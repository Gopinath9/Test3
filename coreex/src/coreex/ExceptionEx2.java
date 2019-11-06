package coreex;

public class ExceptionEx2 {

	public static void main(String[] args) {
		int totalMarks = 560;
		int totalSubjects = 6;
		float avgMarks = 0;
		String errorMessage = "";
		
		//Exception: Abnormal state of program execution
		
		System.out.println("Start");
	
		try {
			avgMarks = getAverageMarks(totalMarks, totalSubjects);
		} catch(ArithmeticException ae) {
			errorMessage = "Service had issue. Please try again later...";
		}

		if(errorMessage != "") {
			System.out.println(errorMessage);
		} else {
			System.out.println("avgMarks: "+avgMarks);
		}
		
		System.out.println("End");
		
	}
	
	//throw is used to throw the exception from called method to calling method
	//Can handle only one exception at a time
	//Can be used in catch block
	public static float getAverageMarks(int totalMarks, int totalSubjects) {
		float avgMarks = 0;
		
		try { 
			avgMarks = totalMarks / totalSubjects;
		} catch(ArithmeticException ae) {
			throw ae;
		} catch(Exception ex) {
			throw ex;
		}
		
		return avgMarks;
	}

}
