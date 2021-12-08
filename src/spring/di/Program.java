package spring.di;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		
		Exam exam = new NewlecExam();
		ExamConsole i_console = new InlineExamConsole(exam);
		i_console.print();
		ExamConsole g_console = new GridExamConsole(exam);
		g_console.print();

	}

}
