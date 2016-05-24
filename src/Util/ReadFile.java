package Util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TooManyListenersException;

import Exception.TooManyRecordsException;
import Model.Student;

//Read test file and save to the memory
public class ReadFile {
	public static Student[] readFile(String filename, Student[] students) throws TooManyRecordsException {
		
		int lineCount = -1;
		try {
			FileReader fileReader = new FileReader(filename);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				if (lineCount == -1){
					lineCount++;
					continue;
				}
				if(lineCount == 40) 
					throw new TooManyRecordsException();
				addStudent(line, students, lineCount);

				lineCount++;
			}
			bufferedReader.close();
		} catch (IOException e) {
			System.out.println("Error ­­ " + e.toString());
		}
		
		return students;
	}

	public static void addStudent(String line, Student[] students, int lineCount) {
		students[lineCount] = new Student();
		String[] parts = line.split(" ");
		students[lineCount].setSID(Integer.parseInt(parts[0]));
		int[] tmpScores = new int[5];
		tmpScores[0] = Integer.parseInt(parts[1]);
		tmpScores[1] = Integer.parseInt(parts[2]);
		tmpScores[2] = Integer.parseInt(parts[3]);
		tmpScores[3] = Integer.parseInt(parts[4]);
		tmpScores[4] = Integer.parseInt(parts[5]);
		students[lineCount].setScores(tmpScores);
	}
}
