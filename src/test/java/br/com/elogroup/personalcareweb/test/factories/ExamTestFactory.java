package br.com.elogroup.personalcareweb.test.factories;

import org.joda.time.DateTime;

import br.com.elogroup.personalcareweb.core.ExamScheduling.Exam;
import br.com.elogroup.personalcareweb.core.ExamScheduling.Patient;

public class ExamTestFactory {
	private Exam exam;
	
	public ExamTestFactory createExamScheduledTo(DateTime dateTimeExamIsScheduled){
		this.exam = new Exam();
		this.exam.setLaboratory("Laboratório Browstein");
		this.exam.setObservation("Some obs");
		this.exam.setDateTimeExamIsScheduled(dateTimeExamIsScheduled);
		return this;
	}
	
	public ExamTestFactory forARandomPatient(){
		Patient patient = new Patient();
		patient.setName("Rudy Seidinger");
		patient.setAddress("Av. Graça Aranha, 182");
		patient.setPrimaryPhone("22222412");
		exam.setPatient(patient);
		return this;
	}
	
	public Exam getCreatedExam(){
		return this.exam;
	}
}
