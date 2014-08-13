package br.com.elogroup.personalcareweb.core.ExamScheduling;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import br.com.elogroup.personalcareweb.core.Entity;

@javax.persistence.Entity
public class Patient extends Entity{
	@Column(nullable = false, length = 120)
	private String name;
	@Column(nullable = false, length = 1024)
	private String address;	
	@Column(length = 12)
	private String primaryPhone;
	@Column(length = 12)
	private String secondaryPhone;
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="patient_id", referencedColumnName="id")
	private List<PatientRelatedEvent> patientRelatedEvents;
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="patient_id", referencedColumnName="id")
	private List<Exam> exams;
	
	
	public Patient(){		
		this.patientRelatedEvents = new ArrayList<PatientRelatedEvent>();
		this.exams = new ArrayList<Exam>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<PatientRelatedEvent> getEvents() {
		return this.patientRelatedEvents;
	}
	
	public void registerEvent(PatientRelatedEvent patientRelatedEvent){
		this.patientRelatedEvents.add(patientRelatedEvent);
	}

	public List<Exam> getExams() {
		return exams;
	}

	public void scheduleExam(Exam exam) {
		exam.setPatient(this);
		this.exams.add(exam);		
	}

	public String getPrimaryPhone() {
		return primaryPhone;
	}

	public void setPrimaryPhone(String primaryPhone) {
		this.primaryPhone = primaryPhone;
	}

	public String getSecondaryPhone() {
		return secondaryPhone;
	}

	public void setSecondaryPhone(String secondaryPhone) {
		this.secondaryPhone = secondaryPhone;
	}
}
