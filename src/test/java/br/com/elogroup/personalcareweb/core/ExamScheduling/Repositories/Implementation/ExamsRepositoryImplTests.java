package br.com.elogroup.personalcareweb.core.ExamScheduling.Repositories.Implementation;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import br.com.elogroup.personalcareweb.TestApplication;
import br.com.elogroup.personalcareweb.core.ExamScheduling.Exam;
import br.com.elogroup.personalcareweb.core.ExamScheduling.Repositories.ExamsRepository;
import br.com.elogroup.personalcareweb.test.factories.ExamTestFactory;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestApplication.class)
@Transactional
public class ExamsRepositoryImplTests {
	
	@Autowired
	ExamsRepository examsRepositoryImpl;	
	ExamTestFactory examTestFactory = new ExamTestFactory();
	
	@Test
	public void getNextDayExams_WhenThereAreExamsScheduledToTheNextDay_ShouldReturnAllExamsScheduledToNextDay() {
		examTestFactory.createExamScheduledTo(DateTime.now().plusDays(1)).forARandomPatient();
		this.examsRepositoryImpl.save(examTestFactory.getCreatedExam());
		examTestFactory.createExamScheduledTo(DateTime.now().plusDays(2)).forARandomPatient();
		this.examsRepositoryImpl.save(examTestFactory.getCreatedExam());
		List<Exam> nextDayExams = this.examsRepositoryImpl.getNextDayExams();
		assertEquals(1, nextDayExams.size());
	}
	
	@Test
	public void getNextDayExams_WhenThereAreNoExamsScheduledToTheNextDay_ShouldReturnEmptyList() {		
		List<Exam> nextDayExams = this.examsRepositoryImpl.getNextDayExams();
		assertEquals(0, nextDayExams.size());
	}

}
