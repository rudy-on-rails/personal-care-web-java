package br.com.elogroup.personalcareweb.core.TasksHandling.UseCases;

import br.com.elogroup.personalcareweb.core.TaskResponsible;
import br.com.elogroup.personalcareweb.core.TasksHandling.Task;
import br.com.elogroup.personalcareweb.core.TasksHandling.Repositories.TasksRepository;

public class TaskAssignment {
	private TasksRepository tasksRepository;

	public TaskAssignment(TasksRepository tasksRepository){
		this.tasksRepository = tasksRepository;
	}
	
	public void assignTaskTo(TaskResponsible responsible, Task task){
		task.setResponsible(responsible);
		this.tasksRepository.save(task);
	}
}
