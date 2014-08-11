package br.com.elogroup.personalcareweb.core;

public interface DomainEventHandler<T extends DomainEvent> {
	void handleEvent(T eventArgs);	
	boolean handles(DomainEvent eventArgs);
}
