package Sprint1.Pecunia_bank2.dao;

import java.util.Map;

import org.omg.IOP.TransactionService;

import Sprint1.Pecunia_bank2.service.TransactionServiceImpl;
import Sprint1.Pecunia_bank2.transaction.model.TransactionUsingSlip;
import junit.framework.TestCase;

public class AppTest extends TestCase {
	TransactionService t1=new TransactionServiceImpl();
	TransactionDao t2=new TransactionDaoImpl();
	public static Map<String,TransactionUsingSlip> transaction=TransactionDaoImpl.transaction;
	public void test() {
		assertEquals(true,t2.addAmount("123456789012", 2000));
	}
	

}
