package gradecalculator.model;

import java.util.ArrayList;

public class FEGCalculator {
	ArrayList<Assignment> assignments;
	public FEGCalculator(){
	}
	/**
	 * Getter for Assignments.
	 * @return
	 */
	public ArrayList<Assignment> getAssignments(){
		return assignments;
	}
	/**
	 * Add Assignment to list of Assignments.
	 * @param assignment
	 */
	public void addAssignment(Assignment assignment){
		assignments.add(assignment);
	}
	/**
	 * Remove the Assignment from list of Assignments.
	 * @param assignment
	 */
	public void removeAssignment(Assignment assignment){
		assignments.remove(assignment);
	}
}
