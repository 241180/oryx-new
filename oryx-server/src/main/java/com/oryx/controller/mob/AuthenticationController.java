package com.oryx.controller.mob;

import com.oryx.model.system.ose.User;
import com.oryx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by smbarki on 17/04/2018.
 */

@Controller
@RequestMapping("/protected/authentication")
public class AuthenticationController {

    //Connected Userse <user UUID, User>
    public static Map<UUID, User> connectedUsersMap = new HashMap();

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/connect", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<?> connect(@RequestParam(name = "login") String login, @RequestParam(name = "password") String password) {
        User user = userService.findByEmail(login);
        if(user != null){
            if(user.getPassword()!=null && user.getPassword().equals(password)){
                connectedUsersMap.put(user.getId(), user);
                return new ResponseEntity<User>(user, HttpStatus.OK);
            }
        }

        return new ResponseEntity<User>(user, HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/isconnected", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<?> isconnected(@RequestParam(name = "userId") String userId) {
        if(connectedUsersMap.containsKey(UUID.fromString(userId))){
            return new ResponseEntity<Boolean>(true, HttpStatus.OK);
        }

        return new ResponseEntity<Boolean>(false, HttpStatus.OK);
    }

    @RequestMapping(value = "/disconnect", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<?> disconnect(@RequestParam(name = "userId") String userId) {
        if(connectedUsersMap.containsKey(UUID.fromString(userId))){
            connectedUsersMap.remove(UUID.fromString(userId));
            return new ResponseEntity<Boolean>(true, HttpStatus.OK);
        }

        return new ResponseEntity<Boolean>(false, HttpStatus.OK);
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<?> signup(@RequestParam(name = "firstName") String firstName,
                                    @RequestParam(name = "lastName") String lastName,
                                    @RequestParam(name = "email") String email,
                                    @RequestParam(name = "phone") String phone,
                                    @RequestParam(name = "address") String address,
                                    @RequestParam(name = "password") String password) {

        User user = userService.findByEmail(email);
        if(user == null){
            user = new User();
            user.setCode(firstName);
            user.setLogin(lastName);
            user.setPassword(password);
            user.setEmail(email);
            user.setStartDate(new Date());
            userService.save(user);

            connect(user.getLogin(), user.getPassword());
            return new ResponseEntity<User>(user, HttpStatus.FOUND);
        }

        return new ResponseEntity<String>("User email is already used", HttpStatus.NOT_FOUND);
    }
}