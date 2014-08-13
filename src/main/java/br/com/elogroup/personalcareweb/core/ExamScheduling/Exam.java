package br.com.elogroup.personalcareweb.core.ExamScheduling;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import br.com.elogroup.personalcareweb.core.Entity;

@javax.persistence.Entity
public class Exam extends Entity {
	@ManyToOne
	@JoinColumn(name="patient_id", referencedColumnName="id")
	private Patient patient;
	@Column(nullable = false)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime dateTimeExamWasMade;
	@Column(nullable = false)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime dateTimeExamIsScheduled;
	@Column(nullable = false, length = 1024)
	private String observation;
	@Column(nullable = false, length = 200)
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