package com.jee.hopital;

import com.jee.hopital.entities.Patient;
import com.jee.hopital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HopitalApplication implements CommandLineRunner {
	@Autowired
	private PatientRepository patientRepository;

	public static void main(String[] args) {
		SpringApplication.run(HopitalApplication.class, args);
	}

	@Override
	public void run(String...args) throws Exception{
		patientRepository.save(new Patient(null, "mohammed", new Date(), false, 34f));

		patientRepository.save(new Patient(null, "mohammed", new Date(), false, 34f));
		patientRepository.save(new Patient(null, "saadeddine", new Date(), false, 34f));
		patientRepository.save(new Patient(null, "ashraf", new Date(), false, 34f));
		patientRepository.save(new Patient(null, "bouaaza", new Date(), false, 34f));
		patientRepository.save(new Patient(null, "youssef", new Date(), false, 34f));



	}
}
