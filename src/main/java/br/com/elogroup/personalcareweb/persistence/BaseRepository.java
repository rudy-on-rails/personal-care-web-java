package br.com.elogroup.personalcareweb.persistence;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.elogroup.personalcareweb.core.Entity;
import br.com.elogroup.personalcareweb.core.Repository;

@SuppressWarnings("unchecked")
public abstract class BaseRepository<T extends Entity> implements Repository<T> {
	private Class<?> clazz;
	@Autowired
	private SessionFactory sessionFactory;
	
	public BaseRepository(Class<T> clazz){
		this.clazz = clazz;
	}
		
	@Override
	public T findById(long entityId) {		
		return (T) this.getCurrentSession().get(this.clazz, entityId);
	}

	@Override
	public void save(T entity) {
		this.getCurrentSession().save(entity);		
	}

	@Override
	public void delete(T entity) {
		this.getCurrentSession().delete(entity);		
	}

	@Override
	public List<T> all() {
		return (List<T>) this.getCurrentSession().createCriteria(this.clazz).list();
	}
	
	protected Session getCurrentSession(){
		return this.sessionFactory.getCurrentSession();
	}
	
}
