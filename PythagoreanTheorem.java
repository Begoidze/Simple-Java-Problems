
import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		
		println("Enter values to compute Pythagorean theorem:" );
		
		calculateHypotenouse();
		
	}	 
	/*Finds Hypotenouse, user enters sizes of a and b
	and this program finds c, using a^2+b^2 = C^2.
	*/
	private void calculateHypotenouse(){
		
		double sideA = readInt("a: ");
		double sideB = readInt("b: ");
		double n = sideA*sideA + sideB*sideB;
		double c = Math.sqrt(n);
		println("c: " + c);
	}
	 
}
