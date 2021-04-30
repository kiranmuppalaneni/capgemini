import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

//@Ignore // @Disable
public class AccountSeviceTest {
	
	//Test fixure
	AccountService service;
	Account account;
	
//	@BeforeClass // @BeforeAll
//	public void before() {
//		
//	}
//	
//	@AfterClass // @AfterAll
//	public void after() {
//		
//	}
	
	
	@Before   // before every test case this code get executed - BeforeEach
	public void setUp() {
		service = new AccountService();
		account = new Account(1001,"cust1","bank1",10000.00);
	}
	
	@After
	public void tearDown() { // after every test case this code get executed - AfterEach
		service = null;
		account = null;
	}
	
	
	@Test
	public void withdrawPositveTest() {
		double actual = service.withdraw(account, 5000);
		double expected = 5000;
		Assert.assertEquals(expected, actual,0.0);
	} 
	
	
	@Test
	public void withdrawPositveTestAccountBalance() {
		double actual = service.withdraw(account, 5000);
		double expected = account.getBalance();
		Assert.assertEquals(expected, actual,0.0);
	} 
	
	@Test(expected=NegativeAmountException.class)
	public void withdrawNegativeAccountBalance() {
		double actual = service.withdraw(account, -5000);
	} 
	
	@Test(expected=LowBalanceException.class)
	public void withdrawAccountwithmoreAmount() {
		account = new Account(1001,"cust1","bank1",2000.00);
		double actual = service.withdraw(account, 5000);
	}
	
	@Test
	public void accountcreationTest() {
		Account account = new Account();
		double expectedBalance = 0.0;
		Assert.assertEquals(expectedBalance, account.getBalance(),0.0);
	} 

	@Test(timeout = 50)
	public void accountcreationArgconstrcutorTest() {
		double expectedBalance = 10000.0;
		Assert.assertEquals(expectedBalance, account.getBalance(),0.0);
	} 
}
