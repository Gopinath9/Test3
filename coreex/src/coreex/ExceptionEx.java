package coreex;

public class ExceptionEx {

	public static void main(String[] args) {
		int totalMarks = 560;
		int totalSubjects = 6;
		float avgMarks = 0;
		String errorMessage = "";
		
		//Exception: Abnormal state of program execution
		
		System.out.println("Start");
		
		try {
			System.out.println("Try: to write doughtable code");
			avgMarks = totalMarks / totalSubjects;
		} catch(ArithmeticException ae) {
			System.out.println("Catch: to catch and handle the exception");
			errorMessage = "Service had issue. Please try again later...";
		} finally {
			System.out.println("Finally: To nullify the objects and can get executed always");
		}
		
		if(errorMessage != "") {
			System.out.println(errorMessage);
		} else {
			System.out.println("avgMarks: "+avgMarks);
		}
		
		System.out.println("End");
		
	}

}
