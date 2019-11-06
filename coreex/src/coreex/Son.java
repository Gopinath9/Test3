package coreex;

//extends: To derive the behavior(properties and methods) from super to sub class.
public class Son extends Father {

	public static void main(String[] args) {

		Father father = new Son();
		
		float amountToSon = father.getAmount(60);
		System.out.println("amountToSon: "+amountToSon);
		
	}

	//Runtime Polymorphism or method overriding:
	//More than one method with same name can perform multiple tasks
	// and these methods parameters should be same and in super and sub class.
	
	//super: To access the super class properties and methods
	@Override
	public float getAmount(int percentage) {
		return (super.credits - super.debits) * percentage / 100;
	}

}
