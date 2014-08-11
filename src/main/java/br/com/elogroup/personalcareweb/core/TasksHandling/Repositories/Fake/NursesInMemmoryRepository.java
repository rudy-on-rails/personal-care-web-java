package br.com.elogroup.personalcareweb.core.TasksHandling.Repositories.Fake;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.elogroup.personalcareweb.core.TasksHandling.Nurse;
import br.com.elogroup.personalcareweb.core.TasksHandling.Repositories.NursesRepository;

@Component
public class NursesInMemmoryRepository implements NursesRepository{

	@Override
	public Nurse findById(long entityId) {		
		return new Nurse();
	}

	@Override
	public void save(Nurse entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Nurse entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Nurse> all() {
		// TODO Auto-generated method stub
		return null;
	}

}
