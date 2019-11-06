package coreex;

public class ExceptionEx3 {

	public static void main(String[] args) {
		int totalMarks = 560;
		int totalSubjects = 0;
		float avgMarks = 0;
		String errorMessage = "";
		
		//Exception: Abnormal state of program execution
		
		System.out.println("Start");
	
		try {
			avgMarks = getAverageMarks(totalMarks, totalSubjects);
		} catch(ArithmeticException ae) {
			errorMessage = "Service had issue. Please try again later...";
		} catch(Exception ex) {
			errorMessage = "Service had issue. Please try again later...";
		}

		if(errorMessage != "") {
			System.out.println(errorMessage);
		} else {
			System.out.println("avgMarks: "+avgMarks);
		}
		
		System.out.println("End");
		
	}
	
	//throws is used to throw the exception from called method to calling method
	//throws can handle multiple exceptions at a time and can throw only one whichever comes first
	//Can be used as part of method declaration
	public static float getAverageMarks(int totalMarks, int totalSubjects) throws ArithmeticException, Exception{
		return totalMarks / totalSubjects;
	}

}
