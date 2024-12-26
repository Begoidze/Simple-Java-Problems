
import acm.program.*;

public class FindRange extends ConsoleProgram {
	private static final int SENTINEL = 0;
	public void run() {
		
		programMessage();
		
		findMaxAndMin();
		
		
		}
	
	/*This function finds Min and Max between given numbers,
	 * If no numbers given, provides appropriate message*/
	private void findMaxAndMin(){
		
		int value = readInt(" ? ");
		
		if(value == SENTINEL){
			println("No numbers given.");
			
		}else{
		
			int max = value ;
			int min = value ;
		
			while (!(value == SENTINEL)) {
		
				if(value > max){
				max = value;
				}
				if(value < min){
				min = value;
				}		
			
				value = readInt(" ? ");
			}
		
			println("Smallest: " + min);

			println("Largest: " + max);
		
		}
	}
	//Says what this program does.
	private void programMessage(){
		println("This program finds the largest and smallest numbers. ");
	}
}


