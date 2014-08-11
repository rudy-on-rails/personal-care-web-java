package br.com.elogroup.personalcareweb.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.elogroup.personalcareweb.core.TasksHandling.Task;
import br.com.elogroup.personalcareweb.core.TasksHandling.Repositories.NursesRepository;
import br.com.elogroup.personalcareweb.core.TasksHandling.Repositories.TasksRepository;
import br.com.elogroup.personalcareweb.core.TasksHandling.UseCases.NurseDailyTasks;

@RestController
public class NursesController {
	@Autowired
	private NursesRepository nursesRepository;
	@Autowired
	private TasksRepository tasksRepository;	
	
	@RequestMapping("/nurses/{nurseId}/tasks_todo")
	public List<Task> getUndoneTasks(@PathVariable long nurseId){
		NurseDailyTasks nurseDailyTasks = new NurseDailyTasks(nursesRepository, tasksRepository);
		return nurseDailyTasks.dailyTodoTasks(nurseId);
	}
}
