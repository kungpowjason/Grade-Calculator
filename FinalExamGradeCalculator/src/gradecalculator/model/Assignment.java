package gradecalculator.model;

public class Assignment {
	double pctgrade;
	double pcttotalworth;
	public Assignment(double pctgrade, double pcttotalworth){
		this.pctgrade = pctgrade;
		this.pcttotalworth = pcttotalworth;
	}
	/**
	 * Getter for Percent Grade.
	 * @return
	 */
	public double getPctGrade(){
		return pctgrade;
	}
	/**
	 * Getter for Percent of the Total Worth.
	 * @return
	 */
	public double getPctTotalWorth(){
		return pcttotalworth;
	}
}
