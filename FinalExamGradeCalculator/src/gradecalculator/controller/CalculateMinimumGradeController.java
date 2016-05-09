package gradecalculator.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

import gradecalculator.model.Assignment;
import gradecalculator.model.FEGCalculator;
import gradecalculator.view.GradeInputBox;

public class CalculateMinimumGradeController extends MouseAdapter {
	FEGCalculator fegc;
	GradeInputBox ginputbox;
	JTextField[] gradepcttf;
	JTextField[] gradetwtf;
	JLabel gradereq;

	public CalculateMinimumGradeController(FEGCalculator fegc, GradeInputBox ginputbox,
			JLabel gradereq) {
		this.fegc = fegc;
		this.ginputbox = ginputbox;
		this.gradereq = gradereq;
		this.gradepcttf = ginputbox.getGradePct();
		this.gradetwtf = ginputbox.getGradeTotalWorth();
	}

	/** Listens to the combo box. */
	public void mousePressed(MouseEvent me) {
		fegc.clearAssignments();
		for (int i = 0; i < gradepcttf.length; i++) {
			try {
				System.out.println("Attempted");
				Assignment assignment = new Assignment(Integer.parseInt(gradepcttf[i].getText()),
						Integer.parseInt(gradetwtf[i].getText()));
				fegc.addAssignment(assignment);
				System.out.println("Success");
			} catch (NumberFormatException nfe) {
				System.out.println("No inputs");
			}
		}
		String mingrade = String.valueOf(fegc.calculateMinReqGrade(50)*100);
		gradereq.setText(mingrade + "%");
	}
}
