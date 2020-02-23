package Sprint1.Pecunia_bank2.dao;

import Sprint1.Pecunia_bank2.transaction.model.TransactionUsingSlip;

public interface TransactionDao {
	
	public boolean creditUsingSlip(String userName,String accountNumber,double amount);
	public boolean debitUsingSlip(String userName,String accountNumber,double amount);
	public int getBalanceById(String accountNumber);
	public boolean deductAmount(String accountNumber,double amount);
	public boolean addAmount(String accountNumber,double amount);
	
}
