package coreex;

public class ConditionalStatements {

	public static void main(String[] args) {
			String genderCode = "M";
			String genderDesc = "";
			//If we want to execute piece of code based on a condition
			
			if(genderCode == "M") {
				genderDesc = "Male";
			} else {
				genderDesc = "Female";
			}
			
			System.out.println(genderCode +": "+genderDesc);
	}

}
