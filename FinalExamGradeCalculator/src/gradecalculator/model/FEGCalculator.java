package gradecalculator.model;

import java.util.ArrayList;

public class FEGCalculator {
	ArrayList<Assignment> assignments;
	int mingrade;

	public FEGCalculator() {
		assignments = new ArrayList<Assignment>();
	}

	/**
	 * Getter for Minimum Grade.
	 * 
	 * @return
	 */
	public int getMinGrade() {
		return mingrade;
	}

	/**
	 * Setter for Minimum Grade;
	 * 
	 * @param mg
	 */
	public void setMinGrade(int mg) {
		mingrade = mg;
	}

	/**
	 * Getter for Assignments.
	 * 
	 * @return
	 */
	public ArrayList<Assignment> getAssignments() {
		return assignments;
	}

	/**
	 * Add Assignment to list of Assignments.
	 * 
	 * @param assignment
	 */
	public void addAssignment(Assignment assignment) {
		try {
			assignments.add(assignment);
		} catch (NullPointerException e) {
			System.out.println("Invalid Assignment");
		}
	}

	/**
	 * Remove the Assignment from list of Assignments.
	 * 
	 * @param assignment
	 */
	public void removeAssignment(Assignment assignment) {
		assignments.remove(assignment);
	}
	/**
	 * Removes all elements in ArrayList.
	 */
	public void clearAssignments(){
		assignments.clear();
	}
	/**
	 * Calculates minimum grade required.
	 * @param mg
	 * @return
	 */
	public double calculateMinReqGrade(int mg) {
		double totalpnts = 0.0;
		double accumulatedpnts = 0.0;
		System.out.println(assignments.size());
		for (Assignment assignment : assignments) {
			System.out.println("Attempted Calculation");
			totalpnts += assignment.getPctTotalWorth();
			accumulatedpnts += (assignment.getPctTotalWorth() * assignment.getPctGrade()) / 100;
		}
		return accumulatedpnts/totalpnts;
	}
}
