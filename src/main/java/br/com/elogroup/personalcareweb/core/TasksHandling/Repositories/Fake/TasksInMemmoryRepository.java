package br.com.elogroup.personalcareweb.core.TasksHandling.Repositories.Fake;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.springframework.stereotype.Component;

import br.com.elogroup.personalcareweb.core.TasksHandling.Note;
import br.com.elogroup.personalcareweb.core.TasksHandling.Nurse;
import br.com.elogroup.personalcareweb.core.TasksHandling.Task;
import br.com.elogroup.personalcareweb.core.TasksHandling.TaskStatus;
import br.com.elogroup.personalcareweb.core.TasksHandling.Repositories.TasksRepository;

@Component
public class TasksInMemmoryRepository implements TasksRepository{

	@Override
	public Task findById(long entityId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Task entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Task entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Task> all() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> undoneTasksOf(Nurse nurse) {
		List<Task> tasks = new ArrayList<Task>();
		Task task = new Task();
		task.setCreationDateTime(DateTime.now());
		task.setId(1);
		task.setStatus(TaskStatus.CREATED);
		task.setTaskDescription("A descrição desta tarefa é muito doida...");
		task.addNote(new Note("Teste de Nota 1"));
		task.addNote(new Note("Teste de Nota 2"));
		task.addNote(new Note("Teste de Nota 3"));		
		tasks.add(task);		
		return tasks;
	}

}
