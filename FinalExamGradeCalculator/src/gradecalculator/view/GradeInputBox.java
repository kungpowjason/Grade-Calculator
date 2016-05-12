package gradecalculator.view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import gradecalculator.model.FEGCalculator;
import gradecalculator.model.Screen;

public class GradeInputBox extends JPanel {
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
		for (int i = 0; i < numassignments + 1; i++) {
			if (i < 1) {
				JLabel gradepcttflbl = new JLabel("Grade (%)", SwingConstants.CENTER);
				gradepcttflbl.setBounds((int) getWidth() * 0, (int) getHeight() * i / (numassignments + 1), tfwidth,
						tfheight);
				add(gradepcttflbl);
				JLabel gradetwtflbl = new JLabel("Total Worth", SwingConstants.CENTER);
				gradetwtflbl.setBounds(gradepcttflbl.getWidth() + gradepcttflbl.getX() + (int) getWidth() * 0,
						(int) getHeight() * i / (numassignments + 1), tfwidth, tfheight);
				add(gradetwtflbl);
			} else {
				gradepcttf[i - 1] = new JTextField();
				gradepcttf[i - 1].setBounds((int) getWidth() * 0, (int) getHeight() * i / (numassignments + 1), tfwidth,
						tfheight);
				add(gradepcttf[i - 1]);
				gradetwtf[i - 1] = new JTextField();
				gradetwtf[i - 1].setBounds(gradepcttf[i-1].getWidth() + gradepcttf[i-1].getX() + (int) getWidth() * 0,
						(int) getHeight() * i / (numassignments + 1), tfwidth, tfheight);
				add(gradetwtf[i - 1]);
			}

		}
		repaint();
	}

	/**
	 * Getter for Assignment Worth Overall.
	 * 
	 * @return
	 */
	public JTextField[] getGradeTotalWorth() {
		return gradetwtf;
	}

	/**
	 * Getter for Individual Assignment Score (Percent Grade).
	 * 
	 * @return
	 */
	public JTextField[] getGradePct() {
		return gradepcttf;
	}
}
