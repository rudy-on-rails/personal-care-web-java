package br.com.elogroup.personalcareweb.core;

import java.util.List;

import br.com.elogroup.personalcareweb.core.TasksHandling.Task;

public abstract class TaskResponsible extends Entity {
	private List<Task> tasks;

	public List<Task> getTasks() {
		return tasks;
	}	
}
