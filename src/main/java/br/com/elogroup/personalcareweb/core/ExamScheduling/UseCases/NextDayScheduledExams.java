package br.com.elogroup.personalcareweb.core.ExamScheduling.UseCases;

import java.util.List;

import br.com.elogroup.personalcareweb.core.ExamScheduling.Exam;
import br.com.elogroup.personalcareweb.core.ExamScheduling.Repositories.ExamsRepository;

public class NextDayScheduledExams {
	private ExamsRepository examsRepository;

	public NextDayScheduledExams(ExamsRepository examsRepository){
		this.examsRepository = examsRepository;
	}
	
	public List<Exam> getExamsList(){
		return this.examsRepository.getNextDayExams();
	}
}
