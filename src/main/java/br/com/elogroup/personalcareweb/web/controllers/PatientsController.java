package br.com.elogroup.personalcareweb.web.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.elogroup.personalcareweb.core.ExamScheduling.Patient;
import br.com.elogroup.personalcareweb.core.ExamScheduling.Repositories.PatientsRepository;
import br.com.elogroup.personalcareweb.persistence.seed.Seeds;

@RestController
@RequestMapping(value = "/patients")
public class PatientsController {
	@Autowired
	PatientsRepository patientsRepository;
	
	@RequestMapping(method = RequestMethod.POST)
	public void createPatient(@RequestBody @Valid final Patient patient){
		patientsRepository.save(patient);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Patient> listPatients(){		
		return patientsRepository.all();
	}
}
