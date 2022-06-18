package Challenges;

public class CourseGrades {
	private GradedActivity[]graded;
	
	public CourseGrades() {
		graded = new GradedActivity[4];
	}
	
	public void setLab(GradedActivity grade) {
		graded[0] = grade;
		//graded[0].setScore(grade.getScore());
	}
	
	public void setPassFailExam(PassFailExam pass) {
		graded[1]= pass;
		//graded[1].setScore(pass.getScore());
	}
	
	public void setEssay(Essay es) {
		graded[2]= es;
		//graded[2].setScore(es.getScore());
	}
	
	public void setFinalExam(FinalExam fi) {
		graded[3]=fi;
		//graded[3].setScore(fi.getScore());
	}
	
	public double getAlusive() {
		double averge = (graded[0].getScore()+graded[1].getScore()+graded[2].getScore()+graded[3].getScore())/4;
		//averge = graded[0]+graded[1]+graded[2]+graded[3];
		return averge;
	}
	
	public double getHighest() {
		double max = graded[0].getScore();
		for (int i = 0; i < graded.length; i++) {
			if(graded[i].getScore()>max) {
				max=graded[i].getScore();
			}
		}
		return max;
	}
	
	public double getLowest() {
		double min = graded[0].getScore();
		for (int i = 0; i < graded.length; i++) {
			if(graded[i].getScore()<min) {
				min = graded[i].getScore();
			}
		}
		return min;
	}
	
	
	
	public String toString() {
		String str = "A lab activity : " + graded[0].getScore() + " and " + graded[0].getGrade()
				+ "\nA pass/fail exam : " + graded[1].getScore() + " and " + graded[1].getGrade()
	            + " \nAn essay : " + graded[2].getScore() + " and "+ graded[2].getGrade()
	            + "\nA final exam " + graded[3].getScore() + " and " + graded[3].getGrade();
		return str;
	}

}
