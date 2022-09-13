package com.example.medicalprocess.medicalprocess.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.medicalprocess.medicalprocess.repository.ConsultRepository;

@Service
public class ConsultService {
    
    @Autowired
    private ConsultRepository consultRepo;

    /**
     * @return the consultRepo
     */
    public ConsultRepository getConsultRepo() {
        return consultRepo;
    }

}
