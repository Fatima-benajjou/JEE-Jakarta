package org.example.tp_hopital.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Consultation {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate consultationDate;
    private String nameDoctor;
    private String prescription;
    private String care;

    @ManyToOne
    @JoinColumn(name="id_Patient")
    private Patient patient;


}
