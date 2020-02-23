package Sprint1.Pecunia_bank2.service;

import org.omg.IOP.TransactionService;

//import Sprint1.Pecunia_bank2.dao.TransactionDao;
import Sprint1.Pecunia_bank2.dao.TransactionDaoImpl;
import Sprint1.Pecunia_bank2.transaction.model.TransactionUsingSlip;

public class TransactionServiceImpl implements TransactionService {
		TransactionDaoImpl transactiondao=new TransactionDaoImpl();

		public boolean creditUsingSlip(String userName, String accountNumber, double balance) {
			// TODO Auto-generated method stub
			return transactiondao.creditUsingSlip(userName,accountNumber,balance);
		}

		public boolean debitUsingSlip(String userName, String accountNumber, double balance) {
			// TODO Auto-generated method stub
			return transactiondao.debitUsingSlip(userName, accountNumber, balance);
		}
		public void addSomeAccountDetails() {
			 transactiondao.addSomeAccountDetails();
			
		}
		public static boolean isValidAccountNumber(String accountNumber){
			boolean flag;
			 if(accountNumber.matches("[0-9]{12}")){
				 System.out.println("an");
					return true;
			}
			 return false;
		}
		
			 public static boolean isValidAmount(int amount){
				   
					String str=String.valueOf(amount);
					if(str.matches("[1-9]{1}[0-9]*")){
						 System.out.println("am");
						return true;
					}
					return false; 
				}

			/*	public boolean isValid(TransactionUsingSlip c){
					 
					if(isValidAccountNumber(c.getAccountNumber())&&isValidAmount(c.getAmount())){
						return true;
					}
			 
			 		return false;
				}*/

				public double getBalanceByID(String accountNumber) {
					// TODO Auto-generated method stub
					return transactiondao.getBalanceById(accountNumber) ;
				}

				public boolean addAmount(String accountNumber, int amount) {
					// TODO Auto-generated method stub
					return transactiondao.addAmount(accountNumber, amount);
				}

				public boolean deductAmount(String accountNumber, int amount) {
					// TODO Auto-generated method stub
					return transactiondao.deductAmount(accountNumber, amount);
				}


	}


