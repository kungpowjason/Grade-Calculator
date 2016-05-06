package gradecalculator.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;

import gradecalculator.model.FEGCalculator;

public class SelectMinimumGradeController implements ActionListener{
	FEGCalculator fegc;
	JLabel gradereq;
	public SelectMinimumGradeController(FEGCalculator fegc, JLabel gradereq) {
		this.fegc = fegc;
		this.gradereq = gradereq;
	}
	/** Listens to the combo box. */
	public void actionPerformed(ActionEvent e) {
		JComboBox cb = (JComboBox) e.getSource();
		String gradeselected = (String) cb.getSelectedItem();
		gradereq.setText(gradeselected);
	}
}
