package com.oryx.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import com.oryx.model.User;
import com.oryx.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private UserService userService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();

        User user = (User) session.getAttribute("user");
        if(user == null){
            //Authentication auth = SecurityContextHolder.getContext().getAuthentication();
            String email = "sami.mbarki@gmail.com";
            user = userService.findByEmail(email);
            session.setAttribute("user", user);
        }

        return super.preHandle(request, response, handler);
    }
}
