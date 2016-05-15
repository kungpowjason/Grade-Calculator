package gradecalculator.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import gradecalculator.controller.CalculateMinimumGradeController;
import gradecalculator.controller.ClearInputController;
import gradecalculator.controller.SelectMinimumGradeController;
import gradecalculator.model.FEGCalculator;
import gradecalculator.model.Screen;

public class GradeEditorPanel extends JPanel {
	FEGCalculator fegc;

	GradeInputBox ginputbox;
	JComboBox gradeList;
	JButton calcmingrade;
	JButton clearbtn;
	JLabel gradereq;

	String[] gradeStrings = { "A", "B", "C" };

	public GradeEditorPanel(FEGCalculator fegc) {
		this.fegc = fegc;
		setLayout(null);
		setBackground(Color.PINK);
	}

	public void setup() {

		// Test to see if controllers work
		gradereq = new JLabel();
		gradereq.setBounds((int) (Screen.width * 0.8), 500, 50, 50);
		add(gradereq);

		ginputbox = new GradeInputBox(fegc);
		ginputbox.setLocation(0, 0);
		ginputbox.setup();
		add(ginputbox);

		calcmingrade = new JButton();
		calcmingrade.setBounds((int) (Screen.width * 0.8), 400, 100, 50);
		calcmingrade.addMouseListener(new CalculateMinimumGradeController(fegc, ginputbox, gradereq));
		calcmingrade.setText("Calculate");
		add(calcmingrade);

		clearbtn = new JButton();
		clearbtn.setBounds((int) (Screen.width * 0.8), 300, 100, 50);
		clearbtn.addMouseListener(new ClearInputController(fegc, ginputbox, gradereq));
		clearbtn.setText("Clear");
		add(clearbtn);

		gradeList = new JComboBox(gradeStrings);
		gradeList.setBounds((int) (Screen.width * 0.8), (int) (Screen.height * 0.1), (int) (Screen.width * 0.1),
				(int) (Screen.height * 0.05));
		((JLabel) gradeList.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		add(gradeList);
		gradeList.addActionListener(new SelectMinimumGradeController(fegc, gradereq));

		repaint();
	}

	/**
	 * Getter for GradeInputBox ginput.
	 * 
	 * @return
	 */
	public GradeInputBox getGradeInputBox() {
		return ginputbox;
	}
}
