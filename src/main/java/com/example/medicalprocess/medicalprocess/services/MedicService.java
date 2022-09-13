package com.example.medicalprocess.medicalprocess.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.medicalprocess.medicalprocess.repository.MedicRepository;

@Service
public class MedicService {
    
    @Autowired
    private MedicRepository medicRepo;


    public MedicRepository getMedicRepo(){
        return medicRepo;
    }

}
