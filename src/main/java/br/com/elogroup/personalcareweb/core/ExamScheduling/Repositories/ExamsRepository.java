package br.com.elogroup.personalcareweb.core.ExamScheduling.Repositories;

import java.util.List;

import br.com.elogroup.personalcareweb.core.Repository;
import br.com.elogroup.personalcareweb.core.ExamScheduling.Exam;

public interface ExamsRepository extends Repository<Exam> {
	List<Exam> getNextDayExams();
}