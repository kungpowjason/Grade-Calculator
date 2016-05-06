package gradecalculator.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import gradecalculator.controller.SelectMinimumGradeController;
import gradecalculator.model.Screen;

public class GradeEditorPanel extends JPanel{
	JTextField[] gradetf;
	JComboBox gradeList;
	JLabel gradereq;

	String[] gradeStrings = { "A", "B", "C" };
	int numassignments = 10;

	int tfwidth = 100;
	int tfheight = 20;

	public GradeEditorPanel() {
		setLayout(null);
	}

	public void setup() {
		gradetf = new JTextField[numassignments];
		for (int i = 0; i < numassignments; i++) {
			gradetf[i] = new JTextField();
			gradetf[i].setBounds(0, (int) getHeight() * i / numassignments, tfwidth, tfheight);
			add(gradetf[i]);
		}
		// Create the combo box, select the item at index 4.
		// Indices start at 0, so 4 specifies the pig.

		gradereq = new JLabel();
		gradereq.setBounds(300, 300, 50, 50);
		add(gradereq);

		gradeList = new JComboBox(gradeStrings);
		gradeList.setBounds((int) (Screen.width * 0.8), (int) (Screen.height * 0.1),(int) (Screen.width * 0.1), (int) (Screen.height * 0.05));
		((JLabel) gradeList.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		add(gradeList);
		//gradeList.setSelectedIndex(2);
		gradeList.addActionListener(new SelectMinimumGradeController(gradereq));
		repaint();
	}
}
