package br.com.elogroup.personalcareweb.core.TasksHandling;

import org.joda.time.DateTime;

import br.com.elogroup.personalcareweb.core.Entity;

public class Note extends Entity{
	private Task task;
	private String note;
	private DateTime addedAt;
	private Nurse nurseAdded;
	
	public DateTime getAddedAt() {
		return addedAt;
	}

	public void setAddedAt(DateTime addedAt) {
		this.addedAt = addedAt;
	}

	public Nurse getNurseAdded() {
		return nurseAdded;
	}

	public void setNurseAdded(Nurse nurseAdded) {
		this.nurseAdded = nurseAdded;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}
}
