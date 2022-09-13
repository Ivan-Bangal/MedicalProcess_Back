package com.example.medicalprocess.medicalprocess.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.medicalprocess.medicalprocess.model.Medic;
@Repository
public interface MedicRepository extends JpaRepository<Medic, Long>{}
