package gradecalculator.view;

import javax.swing.JPanel;
import javax.swing.JTextField;
import gradecalculator.model.FEGCalculator;
import gradecalculator.model.Screen;

public class GradeInputBox extends JPanel{
	FEGCalculator fegc;
	
	JTextField[] gradepcttf;
	JTextField[] gradetwtf;

	int numassignments = 10;

	int tfwidth = 100;
	int tfheight = 20;

	public GradeInputBox(FEGCalculator fegc) {
		this.fegc = fegc;
		setLayout(null);
	}
	/**
	 * Setup to fill grade input with textfields.
	 */
	public void setup() {
		gradepcttf = new JTextField[numassignments];
		gradetwtf = new JTextField[numassignments];
		for (int i = 0; i < numassignments; i++) {
			gradepcttf[i] = new JTextField();
			gradepcttf[i].setBounds((int)getWidth() * 0, (int) getHeight() * i / numassignments, tfwidth, tfheight);
			add(gradepcttf[i]);
			gradetwtf[i] = new JTextField();
			gradetwtf[i].setBounds(gradepcttf[i].getWidth()+gradepcttf[i].getX() + (int)getWidth() * 0, (int) getHeight() * i / numassignments, tfwidth, tfheight);
			add(gradetwtf[i]);
			
		}
		repaint();
	}
	/**
	 * Getter for Assignment Worth Overall.
	 * @return
	 */
	public JTextField[] getGradeTotalWorth(){
		return gradetwtf;
	}
	/**
	 * Getter for Individual Assignment Score (Percent Grade).
	 * @return
	 */
	public JTextField[] getGradePct(){
		return gradepcttf;
	}
}
