package coreex;

//extends: To derive the behavior(properties and methods) from super to sub class.
public class Daughter extends Father {

	public static void main(String[] args) {

		Father father = new Daughter();
		
		float amountToDaughter = father.getAmount(40);
		System.out.println("amountToDaughter: "+amountToDaughter);
		
	}

	//super: To access the super class properties and methods
	@Override
	public float getAmount(int percentage) {
		return (super.credits - super.debits) * percentage / 100;
	}

}
