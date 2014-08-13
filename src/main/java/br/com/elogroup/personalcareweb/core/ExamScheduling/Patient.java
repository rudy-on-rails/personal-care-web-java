package br.com.elogroup.personalcareweb.core.ExamScheduling;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

import br.com.elogroup.personalcareweb.core.Entity;

@javax.persistence.Entity
public class Patient extends Entity{
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String Address;
	@Transient
	private List<String> phonesList;
	@Transient
	private List<PatientRelatedEvent> patientRelatedEvents;
	@Transient
	private List<Exam> exams;
	
	
	public Patient(){
		this.phonesList = new ArrayList<String>();
		this.patientRelatedEvents = new ArrayList<PatientRelatedEvent>();
		this.exams = new ArrayList<Exam>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhonesList() {
		return phonesList;
	}

	public void setPhonesList(List<String> phonesList) {
		this.phonesList = phonesList;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
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
		this.exams.add(exam);		
	}
}
