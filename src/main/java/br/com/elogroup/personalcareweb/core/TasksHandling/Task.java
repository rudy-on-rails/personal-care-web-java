package br.com.elogroup.personalcareweb.core.TasksHandling;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;

import br.com.elogroup.personalcareweb.core.Entity;
import br.com.elogroup.personalcareweb.core.TaskResponsible;

public class Task extends Entity{
	private TaskResponsible responsible;
	private TaskStatus status;
	private String taskDescription;
	private DateTime creationDateTime;
	private List<Note> notes;
	
	public Task() {		
		this.notes = new ArrayList<Note>();
	}
	
	public TaskResponsible getResponsible() {
		return responsible;
	}
	public void setResponsible(TaskResponsible targetNurse) {
		this.responsible = targetNurse;
	}
	public TaskStatus getStatus() {
		return status;
	}
	public void setStatus(TaskStatus status) {
		this.status = status;
	}
	public String getTaskDescription() {
		return taskDescription;
	}
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
	public DateTime getCreationDateTime() {
		return creationDateTime;
	}
	public void setCreationDateTime(DateTime creationDateTime) {
		this.creationDateTime = creationDateTime;
	}
	public void finish() {
		this.status = TaskStatus.DONE;
		
	}	
	public void start() {
		this.status = TaskStatus.ONGOING;		
	}

	public List<Note> getNotes() {
		return notes;
	}

	public void addNote(Note note) {
		this.notes.add(note);		
	}		
}
