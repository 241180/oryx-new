package com.oryx.service;

import com.oryx.model.system.ose.Codification;
import com.oryx.repository.CodificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CodificationService {

    @Autowired
    private CodificationRepository codificationRepository;

    @Transactional(readOnly = true)
    public Codification findByServerCodeAndInternalCode(String serverCode, String internalCode){
        return codificationRepository.findByServerCodeAndInternalCode(serverCode, internalCode);
    }

    @Transactional(readOnly = true)
    public Codification findByServerCodeAndExternalCode(String serverCode, String externalCode){
        return codificationRepository.findByServerCodeAndInternalCode(serverCode, externalCode);
    }

    @Transactional()
    public Codification save(String serverCode, String internalCode, String externalCode){
        Codification cod = new Codification();
        cod.setServerCode(serverCode);
        cod.setInternalCode(internalCode);
        cod.setExternalCode(externalCode);
        return codificationRepository.save(cod);
    }
}