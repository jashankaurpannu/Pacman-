/**
 * This class is used to create a PacMan object. It extends the Mover class and
 * includes an array of ImageIcons constants for the various states of PacMan.
 * Also, there is a constructor that sets the initial image of PacMan
 */
import javax.swing.ImageIcon;

@SuppressWarnings("serial")

public class PacMan extends Mover {

	/** 
	 * creates an array of ImageIcons representing various states of PacMan
	 */
	public static final ImageIcon[][] IMAGE = {
			
			{ new ImageIcon("images/PacLeftClosed.bmp"), new ImageIcon("images/PacLeftOpen.bmp") },
			{ new ImageIcon("images/PacUpClosed.bmp"), new ImageIcon("images/PacUpOpen.bmp") },
			{ new ImageIcon("images/PacUpRightClosed.bmp"), new ImageIcon("images/PacRightOpen.bmp") },
			{ new ImageIcon("images/PacDownClosed.bmp"), new ImageIcon("images/PacDownOpen.bmp") }
				
			
	};
	
	/**
	 * PacMan constructor
	 */
	public PacMan() {
		
		this.setIcon(IMAGE[0][0]);  //setPacMan to left closed when game starts
		
	}

	
}




