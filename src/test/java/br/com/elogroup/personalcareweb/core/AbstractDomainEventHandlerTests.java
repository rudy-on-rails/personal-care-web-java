package br.com.elogroup.personalcareweb.core;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.elogroup.personalcareweb.core.ExamScheduling.Exam;
import br.com.elogroup.personalcareweb.core.ExamScheduling.ExamScheduledEvent;

public class AbstractDomainEventHandlerTests {
	AbstractDomainEventHandler<ExamScheduledEvent> myHandler = new AbstractDomainEventHandler<ExamScheduledEvent>() {
		@Override
		public void handleEvent(ExamScheduledEvent eventArgs) {
		}
	};

	@Test
	public void handles_ShouldReturnTrueWhenGenericTypeIsTheSame() {
		ExamScheduledEvent event = new ExamScheduledEvent(new Exam()) {
		};
		assertEquals(true, myHandler.handles(event));
	}

	@Test
	public void handles_ShouldReturnFalseWhenGenericTypeIsDifferent() {
		DomainEvent event = new DomainEvent() {
		};
		assertEquals(false, myHandler.handles(event));
	}

}
