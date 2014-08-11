package br.com.elogroup.personalcareweb.core.ExamScheduling.UseCases;

import br.com.elogroup.personalcareweb.core.ExamScheduling.Exam;
import br.com.elogroup.personalcareweb.core.ExamScheduling.Patient;
import br.com.elogroup.personalcareweb.core.ExamScheduling.Repositories.PatientsRepository;

public class PatientExamScheduling {
	private PatientsRepository patientsRepository;	

	public PatientExamScheduling(PatientsRepository patientsRepository){
		this.patientsRepository = patientsRepository;
	}
	
	public void ScheduleExam(long patientId, Exam exam){
		Patient patient = patientsRepository.findById(patientId);
		patient.scheduleExam(exam);		
		this.patientsRepository.save(patient);		
	}
}
