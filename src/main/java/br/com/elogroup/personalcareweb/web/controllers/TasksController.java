package br.com.elogroup.personalcareweb.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.elogroup.personalcareweb.core.TasksHandling.Task;
import br.com.elogroup.personalcareweb.core.TasksHandling.Repositories.NursesRepository;
import br.com.elogroup.personalcareweb.core.TasksHandling.Repositories.TasksRepository;

@RestController
public class TasksController {
	@Autowired
	private NursesRepository nursesRepository;
	@Autowired
	private TasksRepository tasksRepository;	
	
	@RequestMapping("/my_tasks")
	public List<Task> getMyTasks(){		
		return null;
	}
}
