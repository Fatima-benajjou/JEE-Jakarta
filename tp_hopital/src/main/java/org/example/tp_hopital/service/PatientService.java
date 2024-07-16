package org.example.tp_hopital.service;

import org.example.tp_hopital.model.Patient;
import org.example.tp_hopital.repository.PatientRepo;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class PatientService {
    private PatientRepo patientRepo = new PatientRepo();
    private Patient patient;

    public Patient create (String firstName, String lastName, LocalDate birthDate) {
        Patient patient = Patient.builder()
                .firstname(firstName)
                .lastname(lastName)
                .birthdate(birthDate)
                .build();
        return patientRepo.create(patient);
    }
    public Patient update (int id, String firstName, String lastName, LocalDate birthDate) {
        Patient patient = patientRepo.findById(Patient.class,id);
        if (patient != null) {
        patient.setFirstname(firstName);
        patient.setLastname(lastName);
        patient.setBirthdate(birthDate);
        return patientRepo.update(patient);
        }
        return null;
    }
    public boolean delete (int id) {
        return patientRepo.delete(getPatientId(id));
    }

    public Patient getPatientId (int id) {
        return patientRepo.findById(Patient.class, id);
    }

    public Patient getPatientName (String firstName, String lastName) {
        return patientRepo.findByName(Patient.class, firstName, lastName);
    }

    public Patient getPatientById (int id) {
        return patientRepo.findById(Patient.class, id);
    }

    public List<Patient> getAllPatients(){
        return patientRepo.findAll(Patient.class);
    }
}
