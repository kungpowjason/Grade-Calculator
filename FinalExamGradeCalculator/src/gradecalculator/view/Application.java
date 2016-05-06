package gradecalculator.view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

import gradecalculator.model.FEGCalculator;
import gradecalculator.model.Screen;

/**
 * Top level GUI class; acts as the container of all gui elements.
 * 
 * @author jwu
 *
 */

public class Application extends JFrame {
	// top level model element
	public FEGCalculator fegc;
	// contentPanel that will be each different screen
	public JPanel contentPanel;
	/**
	 * Create the frame.
	 */
	public Application(FEGCalculator fegc) {
		this.fegc = fegc;
		init();
	}
	/**
	 * Getter for ContentPanel.
	 * @return
	 */
	public JPanel getContentPanel(){
		return contentPanel;
	}
	/**
	 * Setter for ContentPanel.
	 * @param j - panel of interest
	 */
	public void setContentPanel(JPanel j){
		// set location and size relative to JFrame ***
		//j.setBounds(0,0,Screen.width,Screen.height);
		// change contentPanel
		setContentPane(j);
		// redraw screen
		repaint();
	}
	/**
	 * Initializes the JFrame and sets the first panel as a MainMenu JPanel.
	 */
	void init(){
		// puts top left corner into 10% of screen height and width
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int x0 = (int) (screenSize.getWidth()-Screen.width)/2;
		int y0 = (int) (screenSize.getHeight()-Screen.height)/2;
		// sets location and size of JFrame
		setBounds(x0,y0,Screen.width,Screen.height);
		// not resizable
		setResizable(false);
		// standard close operation
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// create new panel (MainMenu) 
		GradeEditorPanel gep = new GradeEditorPanel();
		// set location and size relative to JFrame
		gep.setBounds((int)Screen.width/4, 0, (int)Screen.width/2, (int)Screen.height/2);
		gep.setup();
		// ** set contentPanel for JFrame
		setContentPane(gep);
	}
}
