package gradecalculator.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;

public class SelectMinimumGradeController implements ActionListener{
	JLabel gradereq;
	public SelectMinimumGradeController(JLabel gradereq) {
		this.gradereq = gradereq;
	}
	/** Listens to the combo box. */
	public void actionPerformed(ActionEvent e) {
		JComboBox cb = (JComboBox) e.getSource();
		String gradeselected = (String) cb.getSelectedItem();
		gradereq.setText(gradeselected);
	}
}
