package br.com.elogroup.personalcareweb.core.ExamScheduling.UseCases;

import org.joda.time.DateTime;

import br.com.elogroup.personalcareweb.core.ExamScheduling.Patient;
import br.com.elogroup.personalcareweb.core.ExamScheduling.PatientEventType;
import br.com.elogroup.personalcareweb.core.ExamScheduling.PatientRelatedEvent;
import br.com.elogroup.personalcareweb.core.ExamScheduling.Repositories.PatientsRepository;

public class PatientContactRegistration {	
	private PatientsRepository patientsRepository;

	public PatientContactRegistration(PatientsRepository patientsRepository) {
		this.patientsRepository = patientsRepository;
	}

	public void registerPhoneContact(long patientId, String observation) {
		Patient patient = patientsRepository.findById(patientId);
		PatientRelatedEvent event = new PatientRelatedEvent();
		event.setEventDate(DateTime.now());
		event.setEventType(PatientEventType.PHONE_CONTACT);
		event.setObservation(observation);
		patient.registerEvent(event);
		this.patientsRepository.save(patient);
	}
}
