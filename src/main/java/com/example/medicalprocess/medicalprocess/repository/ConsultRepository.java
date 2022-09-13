package com.example.medicalprocess.medicalprocess.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.medicalprocess.medicalprocess.model.Consult;

@Repository
public interface ConsultRepository extends JpaRepository<Consult, Long>{}
