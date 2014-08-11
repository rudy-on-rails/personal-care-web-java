package br.com.elogroup.personalcareweb.core.TasksHandling.UseCases;

import br.com.elogroup.personalcareweb.core.TasksHandling.Note;
import br.com.elogroup.personalcareweb.core.TasksHandling.Task;
import br.com.elogroup.personalcareweb.core.TasksHandling.Repositories.TasksRepository;

public class TaskNotesAddition {
	private TasksRepository tasksRepository;

	public TaskNotesAddition(TasksRepository tasksRepository){
		this.tasksRepository = tasksRepository;
	}
	
	public void AddTaskNote(long taskId, Note note){
		Task task = this.tasksRepository.findById(taskId);
		task.addNote(note);
		this.tasksRepository.save(task);
	}
}
