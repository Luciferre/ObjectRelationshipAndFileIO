package Model;

import Interface.IStatistics;

//Implement interface Istatistics
public class StatisticsImpl implements IStatistics {
	
	private int[] lowScores = new int[5];
	
	private int[] highScores = new int[5];
	
	private float[] avgScores = new float[5];

	public void findlow(Student[] students) {
		/*
		 * This method will find the lowest score and store it in an array names
		 * lowscores.
		 */
		int tmpLow = Integer.MAX_VALUE;
		for (int j = 0; j < 5; j++) {
			tmpLow = Integer.MAX_VALUE;
			for (int i = 0; i < students.length; i++) {
				if (students[i] != null) {
					int[] tmpScores = students[i].getScores();
					if (tmpScores[j] < tmpLow) {
						tmpLow = tmpScores[j];
					}
				}
			}
			lowScores[j] = tmpLow;
		}

	}

	public void findhigh(Student[] students) {
		/*
		 * This method will find the highest score and store it in an array
		 * names highscores.
		 */
		int tmpHigh = Integer.MIN_VALUE;
		for (int j = 0; j < 5; j++) {
			tmpHigh = Integer.MIN_VALUE;
			for (int i = 0; i < students.length; i++) {
				if (students[i] != null) {

					int[] tmpScores = students[i].getScores();
					if (tmpScores[j] > tmpHigh) {
						tmpHigh = tmpScores[j];
					}
				}
			}
			highScores[j] = tmpHigh;
		}
	}

	public void findavg(Student[] students) {
		/*
		 * This method will find avg score for each quiz and store it in an
		 * array names avgscores.
		 */
		int tmpCount = 0;
		int numOfStudents = 0;
		for (int j = 0; j < 5; j++) {
			tmpCount = 0;
			numOfStudents = 0;
			for (int i = 0; i < students.length; i++) {
				if (students[i] != null) {

					int[] tmpScores = students[i].getScores();
					tmpCount += tmpScores[j];
					numOfStudents ++;
				}

			}
			avgScores[j] = tmpCount / numOfStudents;
		}
	}

	public void print() {
		System.out.println("High Score\t" + highScores[0] + "\t" + highScores[1] + "\t" + highScores[2] + "\t"
				+ highScores[3] + "\t" + highScores[4]);
		System.out.println("Low Score\t" + lowScores[0] + "\t" + lowScores[1] + "\t" + lowScores[2] + "\t"
				+ lowScores[3] + "\t" + lowScores[4]);
		System.out.println("Average\t" + avgScores[0] + "\t" + avgScores[1] + "\t" + avgScores[2] + "\t" + avgScores[3]
				+ "\t" + avgScores[4]);
	}
}
