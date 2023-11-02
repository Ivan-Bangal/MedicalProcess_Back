package com.example.medicalprocess.medicalprocess.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
public class Consult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    @NonNull
    private String diagnostic;

    @Column
    @NonNull
    private String consultComment;

    @Column
    @NonNull
    @Temporal(TemporalType.DATE)
    private Date consultDate;

    @Column
    @CreationTimestamp
	private Date timestamp;

    @OneToOne
    private Process medicalProcess;
}
