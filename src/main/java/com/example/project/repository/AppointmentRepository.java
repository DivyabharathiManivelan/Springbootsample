package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.Model.Appointment;
import com.example.project.Model.Patient;

import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,String>{
	Appointment findByBookingId(String bookingId);
	Appointment findByPatientId(String patientId);
}
