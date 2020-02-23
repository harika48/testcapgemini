
package Sprint1.Pecunia_bank2.dao;

import java.util.List;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import Sprint1.Pecunia_bank2.transaction.model.Transaction;
import Sprint1.Pecunia_bank2.transaction.model.TransactionUsingSlip;

public   class TransactionDaoImpl implements TransactionDao{
	static Map<String,TransactionUsingSlip> transaction=new HashMap<String,TransactionUsingSlip>();
	public TransactionDaoImpl() {
		addSomeAccountDetails();
	}
	public void addSomeAccountDetails() {
		TransactionUsingSlip ta1=new TransactionUsingSlip("Akshitha","123456789012",20000);
				
		TransactionUsingSlip ta2=new TransactionUsingSlip("Prameela","987654321012",30000);
				
		transaction.put(ta1.getAccountNumber(), ta1);
		transaction.put(ta2.getAccountNumber(), ta2);
		
	}
	public boolean creditUsingSlip(String userName, String accountNumber, double amount) {
		
		try {
			
			if(amount<=100||amount>=100000) {
				throw new Exception("Insufficient");
			}
		else if((accountNumber).length()!=12){
			throw new Exception("Invalid account number");
		}
	
			addAmount( accountNumber, amount) ;
	System.out.println("Deposited"+amount+".rs Successfully total amount  "+getBalanceById( accountNumber));
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	return false;
	}

	public boolean debitUsingSlip(String userName, String accountNumber, double amount) {
		
		try {
			if(amount<=100||amount>=100000) {
				throw new Exception("Insufficient");
			}
		else if((accountNumber).length()!=12){
			throw new Exception("Invalid account number");
		}
	
			deductAmount(accountNumber, amount);
	System.out.println("withdrawn"+amount+".rs Successfully total amount  "+  getBalanceById( accountNumber));
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	return false;
		
	}

	public int getBalanceById(String accountNumber) {
		if(!transaction.containsKey(accountNumber)) {
			System.out.println("no account found");
			return 0;
		}
		TransactionUsingSlip bal=transaction.get(accountNumber);
			return  (int) bal.getBalance();
		
		}
	public boolean updateAccountBalance(TransactionUsingSlip accountDetails, double amount) {
		if(!transaction.containsKey(accountDetails.getAccountNumber())) {
		return false;
	}
		
//		TransactionUsngSlip transToUpdate=transaction.get(accountNumber.getBalanceById());
//		transToUpdate.setBalance(accountNumber.getBalance());
		
			
		return true;
	}
	

	public boolean deductAmount(String accountNumber,double amount) {
		if(!transaction.containsKey(accountNumber)) {
			return false;
		}
		TransactionUsingSlip acc=transaction.get(accountNumber);
		acc.setBalance(acc.getBalance()-amount);
		return true;
	}

public boolean addAmount(String accountNumber,double amount) {
	if(!transaction.containsKey(accountNumber)) {
		return false;
	}
	TransactionUsingSlip acc=transaction.get(accountNumber);
	acc.setBalance(acc.getBalance()+amount);
	return true;
}
}

