package br.com.elogroup.personalcareweb.core.ExamScheduling;

import org.joda.time.DateTime;

public class PatientRelatedEvent {
	private PatientEventType patientEventType;
	private DateTime eventDate;
	private String observation;
	
	public PatientEventType getEventType() {
		return patientEventType;
	}
	public void setEventType(PatientEventType patientEventType) {
		this.patientEventType = patientEventType;
	}
	public DateTime getEventDate() {
		return eventDate;
	}
	public void setEventDate(DateTime eventDate) {
		this.eventDate = eventDate;
	}
	public String getObservation() {
		return observation;
	}
	public void setObservation(String observation) {
		this.observation = observation;
	}	
}
