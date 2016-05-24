package Model;

//Student model
public class Student {
	
	private int SID;
	
	private int scores[] = new int[5];

	public int[] getScores() {
		return scores;
	}

	public void setScores(int scores[]) {
		this.scores = scores;
	}

	public int getSID() {
		return SID;
	}

	public void setSID(int sID) {
		SID = sID;
	}

	public void print() {
		System.out.println(this.SID + "\t" + this.scores[0] + "\t" + this.scores[1] + "\t" + this.scores[2] + "\t"
				+ this.scores[3] + "\t" + this.scores[4]);
	}
}
