package com.assignment_4.interfaces;

/**
 * This interface declare the methods for bank operations.
 * 
 * @author imostrom
 * @version 1.0
 *
 */

public interface BankOperations {
	/**
	 * @param amount Withdrawing money method
	 */
	public void withdrawMoney(double amount);

	/**
	 * @param amount Depositing money method
	 */
	public void depositMoney(double amount);
}
