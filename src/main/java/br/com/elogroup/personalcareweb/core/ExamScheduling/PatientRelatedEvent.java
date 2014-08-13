package br.com.elogroup.personalcareweb.core.ExamScheduling;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.joda.time.DateTime;

import br.com.elogroup.personalcareweb.core.Entity;

@javax.persistence.Entity
public class PatientRelatedEvent extends Entity {
	@Enumerated(EnumType.STRING)
	private PatientEventType patientEventType;
	@Column
	private DateTime eventDate;
	@Column(nullable = false, length = 1024)
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
