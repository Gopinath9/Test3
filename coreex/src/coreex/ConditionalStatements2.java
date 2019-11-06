package coreex;

public class ConditionalStatements2 {

	public static void main(String[] args) {
			String genderCode = "M";
			String genderDesc = "";
			
			if(genderCode == "M") {
				genderDesc = "Male";
			}
			if(genderCode == "F") {
				genderDesc = "Female";
			}
			
			System.out.println(genderCode +": "+genderDesc);
	}

}
