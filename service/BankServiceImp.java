package com.bank.service;

import com.bank.beans.Account;
import com.bank.beans.Loan;
import com.bank.dao.BankDao;
import com.bank.dao.BankDaoImp;

public class BankServiceImp implements BankService{
	
	BankDao dao;
	
	public BankServiceImp() {
		dao= new BankDaoImp();
	}

	@Override
	public boolean validateAccountId(String id) {
		String regexId = "^[0-9]{7}[A-Za-z]{4}$";
		return id.matches(regexId);
	}

	@Override
	public boolean validateAccountName(String name) {
		String regexName = "^[A-Z]{1}[a-z]{2,30}$";
		return name.matches(regexName);
	}

	@Override
	public int depositAmount(String accId, int amt) {
		// TODO Auto-generated method stub
		return dao.depositAmount(accId, amt);
	}

	@Override
	public int withdrawAmount(String accId, int amt) {
		// TODO Auto-generated method stub
		return dao.withdrawAmount(accId, amt);
	}

	@Override
	public Account showAccountDetails(String accountNo) {
		return dao.showAccountDetails(accountNo);
		
	}

	@Override
	public void createAccount(Account account) {
		dao.createAccount(account);
		
	}
	
	public int getLoan(long loanId,int lamt) {
		return dao.getLoan(loanId, lamt);
	}

	@Override
	public Loan showLoanDetails(long loanId) {
		return dao.showLoanDetails(loanId);
		
	}

	@Override
	public int payLoan(long loanId, int lamt) {
		return dao.payLoan(loanId, lamt);
	}

}
