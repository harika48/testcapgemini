package Sprint1.Pecunia_bank2.service;

import Sprint1.Pecunia_bank2.transaction.model.TransactionUsingSlip;

public interface TransactionService {
	public boolean creditUsingSlip(String userName,String accountNumber,double balance);
	public boolean debitUsingSlip(String userName,String accountNumber,double balance);
	public void addSomeAccountDetails();

	public double getBalanceByID(String accountNumber);
	public boolean addAmount(String accountNumber, int amount) ;
	public boolean deductAmount(String accountNumber, int amount) ;
}