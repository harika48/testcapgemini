package Sprint1.Pecunia_bank2.service;

import org.omg.IOP.TransactionService;

//import Sprint1.Pecunia_bank2.dao.TransactionDao;
import Sprint1.Pecunia_bank2.dao.TransactionDaoImpl;

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

	}


