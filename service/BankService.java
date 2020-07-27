package com.bank.service;

import com.bank.beans.Account;
import com.bank.beans.Loan;

public interface BankService {
	
	public boolean validateAccountId(String id);
	public boolean validateAccountName(String name);
	
	public int depositAmount(String accId,int amt);
	public int withdrawAmount(String accId,int amt);
	public Account showAccountDetails(String accountNo);
	public void createAccount(Account account);
	
	public int getLoan(long loanId,int lamt);
	public int payLoan(long loanId,int lamt);
	public Loan showLoanDetails(long loanId);
}
