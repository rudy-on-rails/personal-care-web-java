package br.com.elogroup.personalcareweb.core.TasksHandling.Repositories;

import java.util.List;

import br.com.elogroup.personalcareweb.core.Repository;
import br.com.elogroup.personalcareweb.core.TasksHandling.Nurse;
import br.com.elogroup.personalcareweb.core.TasksHandling.Task;

public interface TasksRepository extends Repository<Task> {
	List<Task> undoneTasksOf(Nurse nurse);
}
