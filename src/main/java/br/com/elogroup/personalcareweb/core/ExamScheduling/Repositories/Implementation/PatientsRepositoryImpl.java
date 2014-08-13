package br.com.elogroup.personalcareweb.core.ExamScheduling.Repositories.Implementation;

import org.springframework.stereotype.Component;

import br.com.elogroup.personalcareweb.core.ExamScheduling.Patient;
import br.com.elogroup.personalcareweb.core.ExamScheduling.Repositories.PatientsRepository;
import br.com.elogroup.personalcareweb.persistence.BaseRepository;

@Component
public class PatientsRepositoryImpl extends BaseRepository<Patient> implements
		PatientsRepository {

	public PatientsRepositoryImpl() {
		super(Patient.class);		
	}
}
