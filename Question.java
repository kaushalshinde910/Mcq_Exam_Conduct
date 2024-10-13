package Mcq_exam_conduct;

public class Question {
	String questiontext;
	String op1;
	String op2;
	String op3;
	String op4;
	
	int correctchoice;
	public String option1;
	public String option2;
	public String option3;
	public String option4;
	//public Question(String string, String string2, String string3, String string4, String string5) {
		// TODO Auto-generated constructor stub
	//}
	public Question(String questiontext, String option1, String option2, String option3, String option4, int correctchoice) {
		// TODO Auto-generated constructor stub
		
		
		this.questiontext=questiontext;
		this.option1=option1;
		this.option2=option2;
		this.option3=option3;
		this.option4=option4;
		this.correctchoice=correctchoice;
		
	}
	public Integer getCorrectChoice() {
		// TODO Auto-generated method stub
		return null;
	}

}

