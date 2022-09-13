package com.example.medicalprocess.medicalprocess.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.medicalprocess.medicalprocess.repository.MedicRepository;
import com.example.medicalprocess.medicalprocess.repository.PatientRepository;
import com.example.medicalprocess.medicalprocess.repository.ProcessRepository;

@Service
public class ProcessService {
    
    @Autowired
    private ProcessRepository processRepo;

    @Autowired
    private MedicRepository medicRepo;

    @Autowired
    private PatientRepository patientRepo;


    public ProcessRepository getProcessRepo(){
        return processRepo;
    }

    public MedicRepository getMedicRepo(){
        return medicRepo;
    }

    public PatientRepository getPatientRepo(){
        return patientRepo;
    }

}
