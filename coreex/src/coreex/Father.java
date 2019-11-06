package coreex;

public abstract class Father {

	public int credits = 5000000;
	public int debits = 1000000;

	// abstract: Incomplete behavior
	public abstract float getAmount(int percentage);
	
	public void test() {
		System.out.println("Just to test");
	}
	
}
