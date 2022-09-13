package com.example.medicalprocess.medicalprocess.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.medicalprocess.medicalprocess.services.ProcessService;
import com.example.medicalprocess.medicalprocess.model.Medic;
import com.example.medicalprocess.medicalprocess.model.Patient;
import com.example.medicalprocess.medicalprocess.model.Process;

@RestController
@RequestMapping("/medicalProcess")
public class ProcessController {

    @Autowired
    ProcessService service;

    @GetMapping
    public ResponseEntity<List<Process>> getAll() {
        try {
            List<Process> items = new ArrayList<Process>();

            service.getProcessRepo().findAll().forEach(items::add);

            if (items.isEmpty())
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);

            return new ResponseEntity<>(items, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<Process> getById(@PathVariable("id") Long id) {
        Optional<Process> existingItemOptional = service.getProcessRepo().findById(id);

        if (existingItemOptional.isPresent()) {
            return new ResponseEntity<>(existingItemOptional.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Process> create(@RequestParam Long idMedic, @RequestParam Long idPatient) {
        try {
            Optional<Medic> medic = service.getMedicRepo().findById(idMedic);

            Optional<Patient> patient = service.getPatientRepo().findById(idPatient);

            if (patient.isPresent()) {
                Process process = new Process();

                if (medic.isPresent())
                    process.setMedic(medic.get());

                process.setPatient(patient.get());
                Process savedItem = service.getProcessRepo().save(process);
                return new ResponseEntity<>(savedItem, HttpStatus.CREATED);

            } else
                return new ResponseEntity<>(null, HttpStatus.NOT_ACCEPTABLE);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

    @PutMapping("{id}")
    public ResponseEntity<Process> update(@PathVariable("id") Long id, @RequestBody Process item) {
        Optional<Process> existingItemOptional = service.getProcessRepo().findById(id);
        if (existingItemOptional.isPresent()) {
            Process existingItem = existingItemOptional.get();
            System.out
                    .println("TODO for developer - update logic is unique to entity and must be implemented manually.");
            // existingItem.setSomeField(item.getSomeField());
            return new ResponseEntity<>(service.getProcessRepo().save(existingItem), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") Long id) {
        try {
            service.getProcessRepo().deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }
}
