
import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	public void run() {
		
		drawingPyramid();
		
}
	/* Nothing much to say, just draws pyramid.
	 * Draws 14 bricks(The number is given in constant) on the first row
	 * And then less by one, on every next row, also moves bricks a bit so they are 
	  Like pyramid */
	private void drawingPyramid(){
		
		
		double Y = getHeight() - BRICK_HEIGHT;
		
		for (int i = 0; i < BRICKS_IN_BASE; i++){
			
			Y = Y - BRICK_HEIGHT;
			double X = (getWidth() - BRICK_WIDTH * BRICKS_IN_BASE) / 2;
		for (int j = 0; j < BRICKS_IN_BASE - i; j++) {
			
			GRect rect = new GRect(BRICK_WIDTH, BRICK_HEIGHT);

			rect.setColor(Color.BLACK);

			add(rect, X + i*BRICK_WIDTH / 2  , Y);
			
			X = X + BRICK_WIDTH;
			}
		}
	}

	
	
	
	
	
	

	

	
	
}

