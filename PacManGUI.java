/**
 * This class creates a PacMan GUI that extends the JFrame class. It has a board (JPanel) and 
 * includes a constructor method that sets up the frame and adds a key listener to the board
 */

import javax.swing.*;

public class PacManGUI extends JFrame {
	
	//Board panel
	private Board board = new Board();
	
	/**
	 * PacMan GUI constructor
	 */
	public PacManGUI() {
		
		//1. Setup the GUI
		setSize(600, 600);
		setTitle("PacMan");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//2. Listen for events on the board and add the board to the GUI
		addKeyListener(board);
		add(board);
		
		//3. Make GUI visible
		setVisible(true);
		
	}
}



