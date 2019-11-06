package coreex;

public class Student {

	// datatype: To let the compiler, which type of data can be holded by a
	// property.
	// access specifier: To know up to which scope, a property/method/class can be
	// accessed.
	public static int id;
	private String name;
	private char sex;

	private int hindiMarks;
	private int englishMarks;

	private int mathsMarks;
	private int scienceMarks;
	private int socialMarks;

	public int getId() {
		return id;
	}

	//this: To access the current class properties and methods
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getHindiMarks() {
		return hindiMarks;
	}

	public void setHindiMarks(int hindiMarks) {
		this.hindiMarks = hindiMarks;
	}

	public int getEnglishMarks() {
		return englishMarks;
	}

	public void setEnglishMarks(int englishMarks) {
		this.englishMarks = englishMarks;
	}

	public int getMathsMarks() {
		return mathsMarks;
	}

	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}

	public int getScienceMarks() {
		return scienceMarks;
	}

	public void setScienceMarks(int scienceMarks) {
		this.scienceMarks = scienceMarks;
	}

	public int getSocialMarks() {
		return socialMarks;
	}

	public void setSocialMarks(int socialMarks) {
		this.socialMarks = socialMarks;
	}

}
