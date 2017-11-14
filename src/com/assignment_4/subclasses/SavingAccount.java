package com.assignment_4.subclasses;
import java.util.UUID;

import com.assignment_4.superclasses.BankAccount;

/**
 * The subclass SavingAccount extends the superclass BankAccount. 
 * It sets information for a saving bank account
 * 
 * 
 * @author imostrom
 * @version 1.0
 *
 */
public class SavingAccount extends BankAccount {
	/**
	 * The method SavingAccount sets an UUID account number, sets the balance at 0.0
	 * and the account type to "Saving account".
	 */
	public SavingAccount() {
		this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6));
		this.setBalance(0.0);
		this.setAccountType("Saving account");

	}

}
