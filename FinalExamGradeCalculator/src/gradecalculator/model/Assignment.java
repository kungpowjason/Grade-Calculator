package gradecalculator.model;

public class Assignment {
	int pctgrade;
	int pcttotalworth;
	public Assignment(int pctgrade, int pcttotalworth){
		this.pctgrade = pctgrade;
		this.pcttotalworth = pcttotalworth;
	}
	/**
	 * Getter for Percent Grade.
	 * @return
	 */
	public int getPctGrade(){
		return pctgrade;
	}
	/**
	 * Getter for Percent of the Total Worth.
	 * @return
	 */
	public int getPctTotalWorth(){
		return pcttotalworth;
	}
}
