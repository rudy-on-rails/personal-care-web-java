package br.com.elogroup.personalcareweb.core.ExamScheduling.UseCases;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;

import br.com.elogroup.personalcareweb.core.ExamScheduling.Repositories.ExamsRepository;

public class NextDayScheduledExamsTests {

	private NextDayScheduledExams nextDayScheduledExams;
	private ExamsRepository examsRepository;

	@Before
	public void setUp() throws Exception {
		examsRepository = mock(ExamsRepository.class);
		this.nextDayScheduledExams = new NextDayScheduledExams(examsRepository);
	}

	@Test
	public void testGetExamsList() {
		this.nextDayScheduledExams.getExamsList();
		verify(examsRepository).getNextDayExams();
	}

}
