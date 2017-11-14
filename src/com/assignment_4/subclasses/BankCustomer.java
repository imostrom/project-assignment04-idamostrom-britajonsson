package com.assignment_4.subclasses;
import java.util.ArrayList;
import com.assignment_4.superclasses.BankAccount;
import com.assignment_4.superclasses.Human;
/**
 *The subclass BankCustomer extends the superclass Human. An object of
 * BankCustomer is an ArrayList of the object BankAccount.
 * 
 * 
 * @author imostrom
 * @version 1.0
 *
 */
public class BankCustomer extends Human {
	public ArrayList<BankAccount> customerAccounts = new ArrayList<BankAccount>();

	/**
	 * The constructor BankCustomer that takes the parameters name and age
	 * 
	 * @param name name of the customer
	 * @param age age of the customer
	 */
	public BankCustomer(String name, int age) {
		super(name, age);
	}

	/**
	 * This method returns an ArrayList of customer accounts
	 * 
	 * @return customerAccounts - The arraylist to be returned
	 */
	public ArrayList<BankAccount> getCustomerAccounts() {
		return customerAccounts;
	}

	/**
	 * This method sets an ArrayList of customer accounts
	 * 
	 * @param customerAccounts The arraylist to be set
	 */
	public void setCustomerAccount(ArrayList<BankAccount> customerAccounts) {
		this.customerAccounts = customerAccounts;
	}

	/**
	 * This method adds a bank account to the ArrayList customer accounts.
	 * 
	 * @param bankAccount bank account to be added
	 */
	public void addAccount(BankAccount bankAccount) {
		customerAccounts.add(bankAccount);
	}

	/**
	 * This method deposits an amount of money to a bank account. It uses the method
	 * getAccountNumber and depositMoney of the class BankAccount
	 * 
	 * @param accountNumber The account number to be deposited into
	 * @param amount the amount of money to be deposited
	 */
	public void depositToAccount(String accountNumber, double amount) {
		for (int i = 0; i < customerAccounts.size(); i++) {
			if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccounts.get(i).depositMoney(amount);
			}
		}
	}

	/**
	 * This method withdraws an amount of money from a bank account. It uses the
	 * method getAccountNumber and withdrawMoney of the class BankAccount
	 * 
	 * @param accountNumber The account number to be withdrawn from
	 * @param amount the amount of money to be withdrawn
	 */
	public void withdrawFromAccount(String accountNumber, double amount) {
		for (int i = 0; i < customerAccounts.size(); i++) {
			if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccounts.get(i).withdrawMoney(amount);
			}
		}
	}

	/**
	 * 
	 * This method returns a string containing the customer name and age and gets
	 * the total bank account information for each bank account of the chosen
	 * customer and returns it in a string.
	 */
	public String toString() {
		String lines = "";
		
		// loop that gets the account information as a string and adds it into string lines
		for (int i = 0; i < customerAccounts.size(); i++) {
			lines = lines + customerAccounts.get(i).toString() + "\n";
		}

		return "Customer: " + getName() + ", age: " + getAge() + "\n" + lines;

	}
}
