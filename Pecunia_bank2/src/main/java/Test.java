import java.util.HashMap;
import java.util.Map;

import org.omg.IOP.TransactionService;

import Sprint1.Pecunia_bank2.dao.TransactionDaoImpl;
import Sprint1.Pecunia_bank2.service.TransactionServiceImpl;
import Sprint1.Pecunia_bank2.transaction.model.TransactionUsingSlip;
import junit.framework.TestCase;

public class Test extends TestCase {
	TransactionDaoImpl t2=new TransactionDaoImpl();
	//
	TransactionService t1=new TransactionServiceImpl();
	static Map<String,TransactionUsingSlip> transaction=new HashMap<String,TransactionUsingSlip>();
	
	
	public void test1() {
		assertEquals(true, t2.deductAmount("123456789012", 200));
	}
	
	public void test3() {
		assertEquals(true,t2.addAmount("987654321012", 2000));
	}
	
	
	
}
