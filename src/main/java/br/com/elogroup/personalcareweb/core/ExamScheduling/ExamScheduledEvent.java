package br.com.elogroup.personalcareweb.core.ExamScheduling;

import br.com.elogroup.personalcareweb.core.DomainEvent;

public class ExamScheduledEvent implements DomainEvent{

	private Exam exam;

	public ExamScheduledEvent(Exam exam) {
		this.setExam(exam);
	}

	private void setExam(Exam exam) {
		this.exam = exam;
	}

	public Exam getExam() {
		return exam;
	}
}
