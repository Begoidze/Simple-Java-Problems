

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		
		numberBreaker();
		
	}

	
	//This zero is used for counting how many process are needed for breaking.
	int counter = 0;
	
	/*While the given number is not 1, this program does what's needed,
	  it'll always get 1.*/
	
	 private void numberBreaker(){
		 int givenNumber = readInt("Enter a number: ");
		 while(!(givenNumber == 1)){
				if(givenNumber <= 0){
					println("Please, enter a positive number. ");
					break;
				}
				if (givenNumber % 2 == 0){
					println(givenNumber + " is even, so I take half: " + givenNumber /2);
					givenNumber = givenNumber /2;
				}else{
					println(givenNumber + " is odd, so I make 3n+1: " + (3*givenNumber+1));
				
					givenNumber = 3 * givenNumber + 1;
				}
				
				counter = counter + 1;
			}
			if(counter >= 1){
				println("The process took " + counter + " to reach 1.");
			}
	 }

}