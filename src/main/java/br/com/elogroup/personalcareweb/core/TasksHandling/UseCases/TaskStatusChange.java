package br.com.elogroup.personalcareweb.core.TasksHandling.UseCases;

import br.com.elogroup.personalcareweb.core.TasksHandling.Task;
import br.com.elogroup.personalcareweb.core.TasksHandling.Repositories.TasksRepository;

public class TaskStatusChange {
	private TasksRepository tasksRepository;

	public TaskStatusChange(TasksRepository tasksRepository){
		this.tasksRepository = tasksRepository;
	}
	
	public void startTask(long taskId){
		Task task = this.tasksRepository.findById(taskId);
		task.start();
		this.tasksRepository.save(task);
	}
	
	public void finishTask(long taskId){
		Task task = this.tasksRepository.findById(taskId);
		task.finish();
		this.tasksRepository.save(task);
	}
}
