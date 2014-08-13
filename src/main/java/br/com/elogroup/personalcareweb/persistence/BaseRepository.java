package br.com.elogroup.personalcareweb.persistence;

import java.util.List;

import org.hibernate.Session;

import br.com.elogroup.personalcareweb.core.Entity;
import br.com.elogroup.personalcareweb.core.Repository;

@SuppressWarnings("unchecked")
public abstract class BaseRepository<T extends Entity> implements Repository<T> {
	private Class<?> clazz;
	private Session session;
	
	public BaseRepository(Class<T> clazz, Session session){
		this.clazz = clazz;
		this.session = session;
	}
		
	@Override
	public T findById(long entityId) {		
		return (T) this.session.get(this.clazz, entityId);
	}

	@Override
	public void save(T entity) {
		this.session.save(entity);		
	}

	@Override
	public void delete(T entity) {
		this.session.delete(entity);		
	}

	@Override
	public List<T> all() {
		return (List<T>) this.session.createCriteria(this.clazz).list();
	}
	
}
