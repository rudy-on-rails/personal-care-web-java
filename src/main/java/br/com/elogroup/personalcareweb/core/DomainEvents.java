package br.com.elogroup.personalcareweb.core;

import java.util.ArrayList;
import java.util.List;

public class DomainEvents {
	private static List<DomainEventHandler> domainEventsHandlers = new ArrayList<DomainEventHandler>();
	
	public static <T extends DomainEvent>void registerHandler(DomainEventHandler<T> domainEventHandler){
		domainEventsHandlers.add(domainEventHandler);
	}
	
	public static <T extends DomainEvent>void raise(T args) {
		for (DomainEventHandler<T> domainEventHandler : domainEventsHandlers) {
			if (domainEventHandler.handles(args))
				domainEventHandler.handleEvent(args);
		}
	}

	public static void clear() {
		domainEventsHandlers.clear();
	}

}
