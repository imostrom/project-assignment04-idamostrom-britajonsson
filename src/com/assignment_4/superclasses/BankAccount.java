package com.assignment_4.superclasses;
import java.util.UUID;
import com.assignment_4.interfaces.BankOperations;
/**
 * The superclass BankAccount implements the interface BankOperations with the
 * attributes accountNumber, accountType and balance and then sets Bank Account
 * information.
 * 
 * @author imostrom
 * @version 1.0
 *
 */
public class BankAccount implements BankOperations {

	private String accountNumber = "";
	private String accountType = "";
	private double balance = 0;

	/**
	 * Class constructor that creates an objects and sets a random accountNumber and
	 * declares the accountType to "Bank account" and balance to 0.
	 */
	public BankAccount() {
		this.accountNumber = UUID.randomUUID().toString().substring(0, 6);
		this.accountType = "Bank account";
		this.balance = 0;
	}

	/**
	 * Method that returns account number
	 * 
	 * @return accountNumber - account number (UUID) for the account
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * This method sets the account number to a bank account
	 * 
	 * @param accountNumber account number (UUID) for the account
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * Method that returns account type.
	 * 
	 * @return accountType - account type for the bank account
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * This method sets the account type to a bank account
	 * 
	 * @param accountType account type for the bank account
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/**
	 * Method that returns the balance of a bank account
	 * 
	 * @return balance - balance of the bank account
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * Method that sets the balance to a bank account
	 * 
	 * @param balance of the bank account
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * Method from interface BankOperations is implemented. This method is for
	 * withdrawing a set amount of money from a bank account. This method states
	 * that you can't withdraw a negative amount from a bank account.
	 * 
	 * @param amount The amount to withdraw
	 */
	public void withdrawMoney(double amount) {
		if (amount >= 0) {
			setBalance(getBalance() - amount);
		} else {
			System.out.println("You can not withdraw a negative value!");
		}
	}

	/**
	 * Method from interface BankOperations is implemented. This method is for
	 * depositing a set amount of money from a bank account. This method states that
	 * you can't deposit a negative amount to a bank account.
	 * 
	 * @param amount The amount to deposit
	 */
	public void depositMoney(double amount) {
		if (amount >= 0) {
			setBalance(getBalance() + amount);
		} else {
			System.out.println("You can not deposit a negative value!");
		}
	}

	/**
	 * 
	 * This method returns a string containing the account information of this class
	 * attributes.
	 */
	public String toString() {
		return "Bank account [accountNumber = " + getAccountNumber() + ", balance = " + getBalance() + ", accountType "
				+ getAccountType() + "]";

	}
}
