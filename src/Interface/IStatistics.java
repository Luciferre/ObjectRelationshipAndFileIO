package Interface;

import Model.Student;

//Inteface of statistics
public interface IStatistics {
	
	public void findlow(Student[] students);

	public void findhigh(Student[] students);

	public void findavg(Student[] students);
}
