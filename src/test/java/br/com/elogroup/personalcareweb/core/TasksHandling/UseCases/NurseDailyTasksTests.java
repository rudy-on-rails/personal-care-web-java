package br.com.elogroup.personalcareweb.core.TasksHandling.UseCases;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import br.com.elogroup.personalcareweb.core.TasksHandling.Nurse;
import br.com.elogroup.personalcareweb.core.TasksHandling.Repositories.NursesRepository;
import br.com.elogroup.personalcareweb.core.TasksHandling.Repositories.TasksRepository;

public class NurseDailyTasksTests {

	NurseDailyTasks nurseDailyTasks;
	private NursesRepository nursesRepository;
	private TasksRepository tasksRepository;
		
	@Before
	public void setUp() throws Exception {
		this.tasksRepository = mock(TasksRepository.class);		
		this.nursesRepository = mock(NursesRepository.class);
		this.nurseDailyTasks = new NurseDailyTasks(nursesRepository, tasksRepository);
	}

	@Test
	public void dailyTodoTasks_ShouldReturnAllTasksToTheNurse() {
		long nurseId = 1;
		Nurse nurse = new Nurse();
		when(nursesRepository.findById(1)).thenReturn(nurse);		
		this.nurseDailyTasks.dailyTodoTasks(nurseId);
		verify(tasksRepository).undoneTasksOf(nurse);
	}

}
