package com.example.medicalprocess.medicalprocess.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.medicalprocess.medicalprocess.model.Patient;
import com.example.medicalprocess.medicalprocess.repository.PatientRepository;

@Service
public class PatientService {


    @Autowired
    private PatientRepository patientRepo;

    public PatientRepository getPatientRepo(){
        return patientRepo;
    }

    public void savePatient(Patient patient){

        patientRepo.save(patient);

    }


    public boolean deletePatient(long id){

        patientRepo.deleteById(id);
        
        return true;
    }

}


