
import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	
	
	//Using this for finding other radiuses, it is the only known radius in pixels.
	private static final int bigRadius = 72;

	
	public void run() {
			
		drawingTarget();
		
			}
	
	//Draws the target, by drawin 3 ovals.
	private void drawingTarget(){
		drawingBiggestOval();
		drawingMediumOval();
		drawingSmallOval();
	}
	
	//Draws biggest circle exactly in the middle
	private void drawingBiggestOval(){
		

		
		double X = getWidth()/2 - bigRadius;
		double Y = getHeight()/2 - bigRadius;
		GOval oval = new GOval(2 * bigRadius, 2 * bigRadius);

		oval.setColor(Color.RED);
		oval.setFilled(true);
		add(oval, X , Y);

	}
	
	//Draws the medium oval, the white one.
	private void drawingMediumOval(){
		
		double mediumRadius = (bigRadius / 2.54) * 1.65;
		
		double X = getWidth()/2 - mediumRadius;
		double Y = getHeight()/2 - mediumRadius;
		GOval oval = new GOval(2 * mediumRadius, 2 * mediumRadius);

		oval.setColor(Color.WHITE);
		oval.setFilled(true);
		add(oval, X , Y);
	}
	
	//Draws the smallest oval
	private void drawingSmallOval(){
		
		double smallRadius = (bigRadius / 2.54) * 0.76;
		
		double X = getWidth()/2 - smallRadius;
		double Y = getHeight()/2 - smallRadius;
		GOval oval = new GOval(2 * smallRadius, 2 * smallRadius);

		oval.setColor(Color.RED);
		oval.setFilled(true);
		add(oval, X , Y);
	}
	
}
