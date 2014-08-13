package br.com.elogroup.personalcareweb.persistence.seed;

import org.joda.time.DateTime;
import org.springframework.stereotype.Component;

import br.com.elogroup.personalcareweb.core.ExamScheduling.Exam;
import br.com.elogroup.personalcareweb.core.ExamScheduling.Patient;

@Component
public class Seeds {				
	public static Patient createPatientWithExam() {
		Patient rudy = new Patient();
		rudy.setName("Rudy Wagner Seidinger Junior");
		rudy.setAddress("Rua dos Marmelos, 350, Apto. 403. Rio de Janeiro");
		rudy.setPrimaryPhone("961466440");		
		Exam exam = new Exam();		
		exam.setDateTimeExamIsScheduled(DateTime.now());
		exam.setDateTimeExamWasMade(DateTime.now().minusDays(10));
		exam.setObservation("Paciente deve estar em jejum");
		exam.setLaboratory("Browstein Barra da Tijuca");		
		rudy.scheduleExam(exam);		
		return rudy;
	}

}
