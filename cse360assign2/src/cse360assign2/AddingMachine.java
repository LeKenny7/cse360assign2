/**
 *Name: Kenny Le
 *Class ID: 70641
 *Assignment #2
 *This file will add and subtract from the previous number
 *You are allowed to clear your history and start again from 0
 */
package cse360assign2;


public class AddingMachine {

	private int total;
	private String history;
	
	/**
	 * This method instantiates the history String to 0
	 */
	public AddingMachine () {
		history = "0";
	}
	
	/**
	 * This method returns the total value
	 * @return	int	This returns the total value of all the operations
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * This method adds to the total and saves value into history
	 * @param value	is the parameter that will be added to the total
	 */
	public void add (int value) {
		total += value;
		history = history + " + " + value;
	}
	
	/**
	 * This method subtracts to the total and saves value into history
	 * @param value is the parameter that will be subtracted from to total
	 */
	public void subtract (int value) {
		total -= value;
		history = history + " - " + value;
	}
		
	/**
	 * This method will print the history of added and subtracted values
	 * @return String This returns all the additions and subtractions
	 */
	public String toString () {
		return history;
	}

	/**
	 * This method resets history to 0 and total to 0
	 */
	public void clear() {
		history = "0";
		total = 0;
	}
}
