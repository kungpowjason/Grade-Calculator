package gradecalculator.model;

/**
 * Assignment keeps track of the percent earned from the assignment and the
 * total worth of the assignment in the course.
 * 
 * @author ywu
 *
 */
public class Assignment {
	double pctgrade;
	double pcttotalworth;

	public Assignment(double pctgrade, double pcttotalworth) {
		this.pctgrade = pctgrade;
		this.pcttotalworth = pcttotalworth;
	}

	/**
	 * Getter for Percent Grade.
	 * 
	 * @return
	 */
	public double getPctGrade() {
		return pctgrade;
	}

	/**
	 * Getter for Percent of the Total Worth.
	 * 
	 * @return
	 */
	public double getPctTotalWorth() {
		return pcttotalworth;
	}
}
