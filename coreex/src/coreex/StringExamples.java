package coreex;

public class StringExamples {

	public static void main(String[] args) {
		String fullname = "";
		System.out.println(fullname+", "+fullname.hashCode());
		
		fullname = fullname + "Tarini";
		System.out.println(fullname+", "+fullname.hashCode());
		
		fullname = fullname + " Prasad";
		System.out.println(fullname+", "+fullname.hashCode());
		
		fullname += " Nayak";
		System.out.println(fullname+", "+fullname.hashCode());
		
		//Hashcode: Memory location address to the given object
		String s1 = "Abc";
		String s2 = new String("abc");
		
		System.out.println(s1.hashCode()+" and "+s2.hashCode());
		
		if(s1 == s2) {
			System.out.println("Both the object hashcodes are same");
		}
		if(s1.equals(s2)) {
			System.out.println("Both the object values are same and it is case sensitive");
		}
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Both the object values are same and it is case insensitive");
		}
		
		char charDT;
		for(int index=0; index<fullname.length(); index++) {
			charDT = fullname.charAt(index);
			System.out.println(charDT);
		}
		
	}

}
