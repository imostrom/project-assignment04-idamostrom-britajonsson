package com.assignment_4.main;
import com.assignment_4.subclasses.*;
import com.assignment_4.superclasses.*;

/**
 * The main class Main creates a customer and adds three account to the
 * customer.
 * 
 * @author imostrom
 * @version 1.0
 *
 */
public class Main {
	/**
	 * The main method declares a string variable "account" that is used to hold the
	 * account number. This method creates a customer, adds three account to it. It
	 * uses methods from the subclasses and superclasses to deposit/withdraw an
	 * amount of money to/from the accounts The method prints outcomes after every
	 * action.
	 * 
	 */
	public static void main(String[] args) {
		String account = "";
		// Creates a customer and adds three account to it, then prints the customer
		// information.
		BankCustomer bc = new BankCustomer("Rafael", 30);
		bc.addAccount(new BankAccount());
		bc.addAccount(new PersonalAccount());
		bc.addAccount(new SavingAccount());
		System.out.println(bc.toString());

		// Deposit 30 SEK to the first Bank account
		account = bc.getCustomerAccounts().get(0).getAccountNumber();
		System.out.println("Depositing 30.0 to the bank account");
		bc.depositToAccount(account, 30.0);
		System.out.println(bc.toString());

		// Withdraw 200 SEK to the second Bank account
		account = bc.getCustomerAccounts().get(1).getAccountNumber();
		System.out.println("Withdrawing 200 from the personal account");
		bc.withdrawFromAccount(account, 200.0);
		System.out.println(bc.toString());

		// Deposit 200 SEK to the third Bank account
		account = bc.getCustomerAccounts().get(2).getAccountNumber();
		System.out.println("Depositing 200 to the savings account");
		bc.depositToAccount(account, 200.0);
		System.out.println(bc.toString());

	}
}
