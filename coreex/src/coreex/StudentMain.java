package coreex;

public class StudentMain {

	public static void main(String[] args) {
		// classname objectname = keyword classname();
		Student student = new Student();

		Student.id = 10;
		
		student.setId(1);
		student.setName("NTP");
		student.setSex('M');

		student.setHindiMarks(70);
		student.setEnglishMarks(80);

		student.setMathsMarks(60);
		student.setScienceMarks(80);
		student.setSocialMarks(90);

		System.out.println("ID: " + student.getId());
		System.out.println("Name: " + student.getName());
		System.out.println("Sex: " + student.getSex());

		System.out.println("Hindi: " + student.getHindiMarks());
		System.out.println("English: " + student.getEnglishMarks());

		System.out.println("Maths: " + student.getMathsMarks());
		System.out.println("Science: " + student.getScienceMarks());
		System.out.println("Social: " + student.getSocialMarks());

		//StudentMain studentMain = new StudentMain();
		
		int langMarks = StudentMain.getTotal(student.getHindiMarks(), 
										student.getEnglishMarks());
			
		int nonLangMarks = StudentMain.getTotal(student.getMathsMarks(), 
										student.getScienceMarks(), student.getSocialMarks());
	
		System.out.println("Language Marks: "+langMarks);
		System.out.println("Non-Language Marks: "+nonLangMarks);
		
	}

	//Polymorphism: More than one method with same name can perform multiple tasks
	
	//Compile time polymorphism or method overloading:
	//More than one method with same name can perform multiple tasks 
	//and these methods should have difference parameters and in the same class
	
	public static int getTotal(int hindi, int english) {
		return hindi + english;
	}

	public static int getTotal(int maths, int science, int social) {
		return maths + science + social;
	}

}
