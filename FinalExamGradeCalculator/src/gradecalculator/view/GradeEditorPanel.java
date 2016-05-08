package gradecalculator.view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import gradecalculator.controller.CalculateMinimumGradeController;
import gradecalculator.controller.SelectMinimumGradeController;
import gradecalculator.model.FEGCalculator;
import gradecalculator.model.Screen;

public class GradeEditorPanel extends JPanel{
	FEGCalculator fegc;
	
	JTextField[] gradepcttf;
	JTextField[] gradetwtf;
	JComboBox gradeList;
	JButton calcmingrade;
	JLabel gradereq;

	String[] gradeStrings = { "A", "B", "C" };
	int numassignments = 10;

	int tfwidth = 100;
	int tfheight = 20;

	public GradeEditorPanel(FEGCalculator fegc) {
		this.fegc = fegc;
		setLayout(null);
	}

	public void setup() {
		gradepcttf = new JTextField[numassignments];
		gradetwtf = new JTextField[numassignments];
		for (int i = 0; i < numassignments; i++) {
			gradepcttf[i] = new JTextField();
			gradepcttf[i].setBounds(Screen.width/4, (int) getHeight() * i / numassignments, tfwidth, tfheight);
			add(gradepcttf[i]);
			gradetwtf[i] = new JTextField();
			gradetwtf[i].setBounds(gradepcttf[i].getWidth()+gradepcttf[i].getX(), (int) getHeight() * i / numassignments, tfwidth, tfheight);
			add(gradetwtf[i]);
			
		}
		
		// Test to see if controllers work
		gradereq = new JLabel();
		gradereq.setBounds(300, 300, 50, 50);
		add(gradereq);
		
		calcmingrade = new JButton();
		calcmingrade.setBounds(400, 400, 50, 50);
		calcmingrade.addMouseListener(new CalculateMinimumGradeController(fegc, gradepcttf, gradetwtf, gradereq));
		add(calcmingrade);
			

		gradeList = new JComboBox(gradeStrings);
		gradeList.setBounds((int) (Screen.width * 0.8), (int) (Screen.height * 0.1),(int) (Screen.width * 0.1), (int) (Screen.height * 0.05));
		((JLabel) gradeList.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		add(gradeList);
		gradeList.addActionListener(new SelectMinimumGradeController(fegc,gradereq));
		repaint();
	}
}
