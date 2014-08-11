package br.com.elogroup.personalcareweb.core.TasksHandling.UseCases;

import java.util.List;

import br.com.elogroup.personalcareweb.core.TasksHandling.Nurse;
import br.com.elogroup.personalcareweb.core.TasksHandling.Task;
import br.com.elogroup.personalcareweb.core.TasksHandling.Repositories.NursesRepository;
import br.com.elogroup.personalcareweb.core.TasksHandling.Repositories.TasksRepository;

public class NurseDailyTasks {	
	private NursesRepository nursesRepository;
	private TasksRepository tasksRepository;
	
	public NurseDailyTasks(NursesRepository nursesRepository, TasksRepository tasksRepository){
		this.nursesRepository = nursesRepository;		
		this.tasksRepository = tasksRepository;
	}
	
	public List<Task> dailyTodoTasks(long nurseId){
		Nurse nurse = this.nursesRepository.findById(nurseId);
		return this.tasksRepository.undoneTasksOf(nurse);		
	}
}
