package br.com.elogroup.personalcareweb.core;

import java.lang.reflect.ParameterizedType;

public abstract class AbstractDomainEventHandler<T extends DomainEvent> implements DomainEventHandler<T> {
	public abstract void handleEvent(T eventArgs);

	@Override
	public final boolean handles(DomainEvent eventArgs) {
		@SuppressWarnings("unchecked")
		Class<T> persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];		
	    return persistentClass == eventArgs.getClass().getGenericSuperclass();
	}

}
