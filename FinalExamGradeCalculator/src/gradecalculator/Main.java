package gradecalculator;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import gradecalculator.model.FEGCalculator;
import gradecalculator.model.PieChart;
import gradecalculator.view.Application;

public class Main {
	public static void main (String[] args) {
		FEGCalculator fegc = new FEGCalculator();

		
		// if using 'app' within the anonymous class generated below, must be marked final.
		final Application app = new Application(fegc);
		app.setTitle("Grade Calculator");
		
		// Pie Chart Test
		PieChart demo = new PieChart("Comparison", "Which operating system are you using?");
        demo.pack();
        demo.setVisible(true);
        app.add(demo);

		// state how to deal with leaving
		app.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				app.dispose();
			}      
		});

		app.setVisible(true);
	}
}