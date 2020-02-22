package Sprint1.Pecunia_bank2.UI;



import java.util.Scanner;

import Sprint1.Pecunia_bank2.dao.TransactionDao;
import Sprint1.Pecunia_bank2.dao.TransactionDaoImpl;

public class Main_UI {
	
	static TransactionDao transactionservice=new TransactionDaoImpl();
	//static TransactionService transactionservice=new TransactionServiceImpl();
	 static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		for(;;) {
			
			
			System.out.println("Enter your choice");
			System.out.println("1.credit using slip");
			System.out.println("2.debit using slip");
			System.out.println("3.Exit");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				creditUsingSlipInfo();
				break;
			case 2:
				debitUsingSlipInfo();
				break;
			case 3:
					System.exit(0);
					break;
			case 4:
				System.out.println("Invalid Choice");
				break;
			}
		}
	}
	private static void creditUsingSlipInfo() {
		System.out.println("Enter user name");
		String userName=sc.next()+sc.nextLine();
		System.out.println("enter account number");
		String accountNumber=sc.next();
		System.out.println("enter amount to be credited");
		double amount=sc.nextInt();
		
		if(transactionservice.creditUsingSlip( userName, accountNumber,amount)) {
			System.out.println("amount deposited successfully");
		}
		
	}
	private static void debitUsingSlipInfo() {
		System.out.println("Enter user name");
		String userName=sc.next()+sc.nextLine();
		System.out.println("enter account number");
		String accountNumber=sc.next();
		System.out.println("enter amount to be debited");
		double amount=sc.nextInt();
		if(transactionservice.debitUsingSlip( userName, accountNumber,amount)) {
			System.out.println("amount withdrawn successfully");
		
	}
		
	}


}
