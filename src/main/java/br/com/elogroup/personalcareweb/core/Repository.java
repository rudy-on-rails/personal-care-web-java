package br.com.elogroup.personalcareweb.core;

import java.util.List;

public interface Repository<T extends Entity> {
	T findById(long entityId);
	void save(T entity);
	void delete(T entity);
	List<T> all();
}
