package br.com.elogroup.personalcareweb.core.ExamScheduling;

import org.joda.time.DateTime;

import br.com.elogroup.personalcareweb.core.Entity;

public class Exam extends Entity {
	private Patient patient;
	private DateTime dateTimeExamWasMade;
	private DateTime dateTimeExamIsScheduled;
	private String observation;
	private String laboratory;
	
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public DateTime getDateTimeExamWasMade() {
		return dateTimeExamWasMade;
	}
	public void setDateTimeExamWasMade(DateTime dateTimeExamWasMade) {
		this.dateTimeExamWasMade = dateTimeExamWasMade;
	}
	public DateTime getDateTimeExamIsScheduled() {
		return dateTimeExamIsScheduled;
	}
	public void setDateTimeExamIsScheduled(DateTime dateTimeExamIsScheduled) {
		this.dateTimeExamIsScheduled = dateTimeExamIsScheduled;
	}
	public String getObservation() {
		return observation;
	}
	public void setObservation(String observation) {
		this.observation = observation;
	}
	public String getLaboratory() {
		return laboratory;
	}
	public void setLaboratory(String laboratory) {
		this.laboratory = laboratory;
	}
	
}