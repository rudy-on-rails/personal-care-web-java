package br.com.elogroup.personalcareweb.core.ExamScheduling.UseCases;


import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import br.com.elogroup.personalcareweb.core.DomainEvent;
import br.com.elogroup.personalcareweb.core.DomainEventHandler;
import br.com.elogroup.personalcareweb.core.DomainEvents;
import br.com.elogroup.personalcareweb.core.ExamScheduling.Exam;
import br.com.elogroup.personalcareweb.core.ExamScheduling.ExamScheduledEvent;
import br.com.elogroup.personalcareweb.core.ExamScheduling.Patient;
import br.com.elogroup.personalcareweb.core.ExamScheduling.Repositories.PatientsRepository;

public class PatientExamSchedulingTests {

	private PatientExamScheduling patientExamScheduling;

	@Before
	public void setUp() throws Exception {
		PatientsRepository patientsRepository = mock(PatientsRepository.class);		
		when(patientsRepository.findById(1)).thenReturn(new Patient());
		this.patientExamScheduling = new PatientExamScheduling(patientsRepository);
	}

	@Test
	public void scheduleExam_ShouldTrigger_ExamScheduledEventHandlers() {
		Exam exam = new Exam();				
		DomainEventHandler<ExamScheduledEvent> domainEventHandler = mock(DomainEventHandler.class);
		when(domainEventHandler.handles(any(ExamScheduledEvent.class))).thenReturn(true);
		DomainEvents.registerHandler(domainEventHandler);		
		this.patientExamScheduling.ScheduleExam(1, exam);
		verify(domainEventHandler).handleEvent(any(ExamScheduledEvent.class));
	}
	
	@Test
	public void scheduleExam_ShouldNotTrigger_AnyOtherEventHandlers() {
		DomainEvents.clear();
		Exam exam = new Exam();					
		DomainEventHandler<DomainEvent> domainEventHandler = mock(DomainEventHandler.class);
		when(domainEventHandler.handles(any(ExamScheduledEvent.class))).thenReturn(false);
		DomainEvents.registerHandler(domainEventHandler);
		this.patientExamScheduling.ScheduleExam(1, exam);
		verify(domainEventHandler, never()).handleEvent(any(ExamScheduledEvent.class));
	}
}
