package br.com.elogroup.personalcareweb.core.TasksHandling.UseCases;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.elogroup.personalcareweb.core.TasksHandling.Task;
import br.com.elogroup.personalcareweb.core.TasksHandling.TaskStatus;
import br.com.elogroup.personalcareweb.core.TasksHandling.Repositories.TasksRepository;

public class TasksStatusChangeTests {

	private TaskStatusChange taskStatusChange;	
	private TasksRepository tasksRepository;
	
	@Before
	public void setUp() throws Exception {
		this.tasksRepository = mock(TasksRepository.class);
		this.taskStatusChange = new TaskStatusChange(tasksRepository);
	}

	@Test
	public void startTask_ShouldRetrieveSetTaskStatusToOngoingAndSaveTheTask() {
		Task t = new Task();		
		when(tasksRepository.findById(1)).thenReturn(t);
		this.taskStatusChange.startTask(1);
		assertEquals(TaskStatus.ONGOING, t.getStatus());
		verify(tasksRepository).save(t);
	}

	@Test
	public void finishTask_ShouldRetrieveSetTaskStatusToDoneAndSaveTheTask() {
		Task t = new Task();		
		when(tasksRepository.findById(1)).thenReturn(t);
		this.taskStatusChange.finishTask(1);
		assertEquals(TaskStatus.DONE, t.getStatus());
		verify(tasksRepository).save(t);
	}

}
