package com.assignment_4.subclasses;
import java.util.UUID;
import com.assignment_4.superclasses.BankAccount;
/**
 * The subclass PersonalAccount extends the superclass BankAccount. It sets
 * information for a personal bank account
 * 
 * 
 * @author imostrom
 * @version 1.0
 *
 */
public class PersonalAccount extends BankAccount {
	/**
	 * The method PersonalAccount sets an UUID account number, sets the balance at
	 * 0.0 and the account type to "Personal account".
	 */
	public PersonalAccount() {
		this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6));
		this.setBalance(0.0);
		this.setAccountType("Personal account");
	}
}
