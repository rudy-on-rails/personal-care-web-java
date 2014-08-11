package br.com.elogroup.personalcareweb.core.ExamScheduling.UseCases;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import br.com.elogroup.personalcareweb.core.ExamScheduling.Patient;
import br.com.elogroup.personalcareweb.core.ExamScheduling.PatientEventType;
import br.com.elogroup.personalcareweb.core.ExamScheduling.PatientRelatedEvent;
import br.com.elogroup.personalcareweb.core.ExamScheduling.Repositories.PatientsRepository;


public class PatientEventRegistrationTests{

	private PatientContactRegistration patientEventRegistration;
	private PatientsRepository patientsRepository;
	private Patient patient;
	
	@Before
	public void setUp(){
		patient = new Patient();
		patientsRepository = mock(PatientsRepository.class);
		when(patientsRepository.findById(1)).thenReturn(patient);
		patientEventRegistration = new PatientContactRegistration(patientsRepository);
	}
	
	@Test
	public void RegisterPhoneContact_ShouldAddAPatientEvent_withtypePHONE_CONTACT_andwithTheGivenObservation(){
		patientEventRegistration.registerPhoneContact(1, "Não atendeu o telefonema!");
		PatientRelatedEvent event = patient.getEvents().get(0);
		assertEquals(PatientEventType.PHONE_CONTACT, event.getEventType());
		assertEquals("Não atendeu o telefonema!", event.getObservation());
		verify(patientsRepository).save(patient);
	}

}
