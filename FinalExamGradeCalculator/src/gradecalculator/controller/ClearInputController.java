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

public class ClearInputController extends MouseAdapter {
	FEGCalculator fegc;
	GradeInputBox ginputbox;
	JLabel gradereq;

	public ClearInputController(FEGCalculator fegc, GradeInputBox ginputbox, JLabel gradereq) {
		this.fegc = fegc;
		this.ginputbox = ginputbox;
		this.gradereq = gradereq;
	}

	/** Listens to the combo box. */
	public void mousePressed(MouseEvent me) {
		fegc.clearAssignments();
		ginputbox.setup();
		gradereq.setText(null);
	}
}
