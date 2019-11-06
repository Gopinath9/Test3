package coreex;

public class LoopingStatements {

	public static void main(String[] args) {

		//Looping statement: To execute piece of code n number of times
		//for, while and do-while
		
		int forTotal = 0;
		
		//initialization;condition; increment/decrement
		for(int index=1; index<=5; index++) {
			
			forTotal = forTotal + index;
		}
		System.out.println("forTotal: "+forTotal);
		
		int whileTotal = 0;
		int whileIndex = 1; //initialization is outside of while block
		while(whileIndex <= 5) { //condition is as part of while declaration
			whileTotal = whileTotal + whileIndex;
			whileIndex++; //increment/decrement is inside of while block
		}
		System.out.println("whileTotal: "+whileTotal);
		
		
		int doWhileTotal = 0;
		int doWhileIndex = 1; //initialization is outside of do block
		do {
			doWhileTotal = doWhileTotal + doWhileIndex;
			doWhileIndex++; //increment/decrement is inside of do block
		} while(doWhileIndex <= 5); //condition is at the end of do block
		System.out.println("doWhileTotal: "+doWhileTotal);
		
	}

}
