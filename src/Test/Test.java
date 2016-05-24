package Test;

import Exception.TooManyRecordsException;
import Model.StatisticsImpl;
import Model.Student;
import Util.ReadFile;

public class Test {
	
	public void test(String filename){
		Student students[] = new Student[40]; // Populate the student array
		try {
			students = ReadFile.readFile(filename, students);
		} catch (TooManyRecordsException e) {
			e.fixException();
		}

		StatisticsImpl statistics = new StatisticsImpl();
		statistics.findlow(students);
		statistics.findhigh(students);
		statistics.findavg(students);
		
		System.out.println("Stud\tQ1\tQ2\tQ3\tQ4\tQ5");

		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				students[i].print();
			}
		}
		statistics.print();
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println("Test records less than 40:");
		test.test("Input_15.txt");
		System.out.println("\nTest records equal 40:");
		test.test("Input_40.txt");
		System.out.println("\nTest records more than 40:");
		test.test("Input_50.txt");

	}

}
