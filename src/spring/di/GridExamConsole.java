package spring.di;

import spring.di.entity.Exam;
import spring.di.ui.ExamConsole;

public class GridExamConsole implements ExamConsole {

	private Exam exam;
	
	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}
	
	@Override
	public void print() {
		System.out.println("total :" + exam.total());
		System.out.println("avg :" + exam.avg());

	}

}
