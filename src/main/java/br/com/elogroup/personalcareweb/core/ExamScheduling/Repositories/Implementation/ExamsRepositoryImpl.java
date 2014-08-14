package br.com.elogroup.personalcareweb.core.ExamScheduling.Repositories.Implementation;

import java.util.List;

import org.joda.time.DateTime;
import org.springframework.stereotype.Component;

import br.com.elogroup.personalcareweb.core.ExamScheduling.Exam;
import br.com.elogroup.personalcareweb.core.ExamScheduling.Repositories.ExamsRepository;
import br.com.elogroup.personalcareweb.persistence.BaseRepository;

@Component
public class ExamsRepositoryImpl extends BaseRepository<Exam> implements ExamsRepository {

	public ExamsRepositoryImpl() {
		super(Exam.class);		
	}

	@Override
	public List<Exam> getNextDayExams() {
		final String hql = "FROM Exam e WHERE e.dateTimeExamIsScheduled >= :initialDate AND e.dateTimeExamIsScheduled <= :finalDate";		
		DateTime initialDateToCompare = DateTime.now().plusDays(1).toLocalDate().toDateTimeAtStartOfDay();
		DateTime finalDateToCompare = DateTime.now().plusDays(2).toLocalDate().toDateTimeAtStartOfDay();		
		return this.getCurrentSession().createQuery(hql)
		.setParameter("initialDate", initialDateToCompare)
		.setParameter("finalDate", finalDateToCompare).list();		
	}

	

}
