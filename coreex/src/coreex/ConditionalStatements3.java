package coreex;

public class ConditionalStatements3 {

	public static void main(String[] args) {
			int marks = 290;
			String grade = "";
			
			if(marks >= 570) {
				grade = "A+";
			} else if(marks >= 540) {
				grade = "A";
			} else if(marks >= 480) {
				grade = "B+";
			} else if(marks >= 420) {
				grade = "B";
			} else if(marks >= 360) {
				grade = "C+";
			} else if(marks >= 300) {
				grade = "C";
			} else {
				grade = "NA";
			}
			
			System.out.println(marks +": "+grade);
	}

}
