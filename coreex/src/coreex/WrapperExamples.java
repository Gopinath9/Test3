package coreex;

public class WrapperExamples {

	public static void main(String[] args) {
		
		String studentMarks = "80";
		int marks = Integer.parseInt(studentMarks);
		System.out.println("Marks: "+marks);
		
		Integer testMarks = 80;
		
		if(testMarks == null) {
			System.out.println("Absent");
		} else if(testMarks > 90) {
			System.out.println("Selected");
		} else if(testMarks > 50) {
			System.out.println("Pass but not selected");
		} else {
			System.out.println("Failed");
		}
		
		byte byteDT = 127;
		int intDT = byteDT;
		System.out.println("intDT: "+intDT);
		
		int intDT2 = 125;
		byte byteDT2 = (byte) intDT2;
		System.out.println("byteDT2: "+byteDT2);
		
		if(intDT2 >= Byte.MIN_VALUE  && intDT2 <= Byte.MAX_VALUE ) {
			byte byteDT3 = Byte.parseByte(""+intDT2);
			System.out.println("Byte Converted value: "+byteDT3);
		}
		
	}

}
