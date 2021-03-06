package gradecalculator.model;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

public class PieChart extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	DefaultPieDataset result;
	String chartTitle;

	public PieChart(String applicationTitle, String chartTitle) {
		super(applicationTitle);
		this.chartTitle = chartTitle;
		this.result = new DefaultPieDataset();
	}

	public void setup() {
		// This will create the dataset
		PieDataset dataset = createDataset();
		// based on the dataset we create the chart
		JFreeChart chart = createChart(dataset, chartTitle);
		// we put the chart into a panel
		ChartPanel chartPanel = new ChartPanel(chart);
		// default size
		chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
		// add it to our application
		setContentPane(chartPanel);
	}

	/**
	 * Creates a sample dataset.
	 */

	private PieDataset createDataset() {
		result.setValue("Exam 1", 20);
		result.setValue("Exam 2", 20);
		result.setValue("Homeworks", 20);
		result.setValue("Projects", 40);
		return result;

	}

	public DefaultPieDataset getDefaultPieDataset() {
		return result;
	}

	/**
	 * Creates a chart
	 */

	private JFreeChart createChart(PieDataset dataset, String title) {

		JFreeChart chart = ChartFactory.createPieChart3D(title, // chart title
				dataset, // data
				true, // include legend
				true, false);

		PiePlot3D plot = (PiePlot3D) chart.getPlot();
		plot.setStartAngle(290);
		plot.setDirection(Rotation.CLOCKWISE);
		plot.setForegroundAlpha(0.5f);
		return chart;

	}
}