
import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {	
	
	/** Width of each box in pixels */
	private static final int RECT_WIDTH = 150;

	/** Width of each box in pixels */
	private static final int RECT_HEIGHT = 50;
	
	/** Distace of tallest box from Y center */
	private static final int DISTANCE_FROM_CENTER = 350;
	
	/** Distace between boxes */
	private static final int DISTANCE_BETWEEN_BOXES = 50;
		
	public void run() {
		programBox();
		graphicsBox();
		consoleBox();
		dialogBox();
	}
	

	
	//This Function draws rect and writes text in box, it does the first box.
	private void programBox(){
		
		int X = (getWidth() - RECT_WIDTH) / 2;
		int Y = getHeight() - DISTANCE_FROM_CENTER;
		
		GRect rect = new GRect(RECT_WIDTH, RECT_HEIGHT);
		add(rect, X   , Y);
		
		GLabel label = new GLabel("Program ");
		double labelWidth = label.getWidth();
		double labelHeight = label.getAscent();
		add(label, X + (RECT_WIDTH - labelWidth)/2,
				 Y + RECT_HEIGHT / 2 + labelHeight / 2);
	}
	
	/* This function draws graphic's box, draws rect first, then writes 
	 * Text and lastly it connects this box the the programs box by line */
	private void graphicsBox(){
		
		int X = (getWidth() - RECT_WIDTH) / 2 - RECT_WIDTH - DISTANCE_BETWEEN_BOXES;
		int Y = getHeight() - DISTANCE_FROM_CENTER + 2 * RECT_HEIGHT;
		
		GRect rect = new GRect(RECT_WIDTH, RECT_HEIGHT);
		add(rect, X   , Y);
		
		GLabel label = new GLabel("GraphicsProgram ");
		double labelWidth = label.getWidth();
		double labelHeight = label.getAscent();
		add(label, X + (RECT_WIDTH - labelWidth)/2,
				 Y + RECT_HEIGHT / 2 + labelHeight / 2);
		
		GLine gline = new GLine(X + RECT_WIDTH / 2 , Y,
				 X + 3*RECT_WIDTH/2 + DISTANCE_BETWEEN_BOXES , Y - RECT_HEIGHT );
		add(gline);
	}
	
	/* This function draws consoles's box, draws rect first, then writes 
	 * Text and lastly it connects this box the the programs box by line */
	private void consoleBox(){
		
		int X = (getWidth() - RECT_WIDTH) / 2;
		int Y = getHeight() - DISTANCE_FROM_CENTER + 2 * RECT_HEIGHT;
		
		GRect rect = new GRect(RECT_WIDTH, RECT_HEIGHT);
		add(rect, X   , Y);
		
		GLabel label = new GLabel("ConsoleProgram ");
		double labelWidth = label.getWidth();
		double labelHeight = label.getAscent();
		add(label, X + (RECT_WIDTH - labelWidth)/2,
				 Y + RECT_HEIGHT / 2 + labelHeight / 2);
		
		GLine gline = new GLine(X + RECT_WIDTH / 2 , Y,
				 X + RECT_WIDTH/2  , Y - RECT_HEIGHT );
		add(gline);
	}
	
	/* This function does same thing, but it's for dialog's box, draws rect, then
	 * Text and lastly it connects this box the the programs box by line */
	private void dialogBox(){
		
		int X = (getWidth() - RECT_WIDTH) / 2 + DISTANCE_BETWEEN_BOXES + RECT_WIDTH;
		int Y = getHeight() - DISTANCE_FROM_CENTER + 2 * RECT_HEIGHT;
		
		GRect rect = new GRect(RECT_WIDTH, RECT_HEIGHT);
		add(rect, X   , Y);
		
		GLabel label = new GLabel("DialogProgram ");
		double labelWidth = label.getWidth();
		double labelHeight = label.getAscent();
		add(label, X + (RECT_WIDTH - labelWidth)/2,
				 Y + RECT_HEIGHT / 2 + labelHeight / 2);
		
		GLine gline = new GLine(X + RECT_WIDTH / 2 , Y,
				 X - RECT_WIDTH/2 - DISTANCE_BETWEEN_BOXES  , Y - RECT_HEIGHT );
		add(gline);
	}
}

