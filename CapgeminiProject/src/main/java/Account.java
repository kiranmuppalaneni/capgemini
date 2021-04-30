

// 60-70%
public class Account {
	// declared variables inside a class.
	// these variables common to all the objects.
	// we call them instance or non static variables
	private long accountNumber;
	private String customerName;
	private String bankName;
	// for all account i want to give 10% interest
	private double balance;
	protected String address;

	// behaviour or method
	// Methods are key in the programming.
	// what ever the business logic we write that is with
	// the help of methods
	// methods are key programming

	// 7 parts
	// [A.M] [N.A.M] returntype methodname([arguments])[throws][ {
	// //body
	// }]

//	Constructor // For object only once
	public Account() {
	}

	public Account(int anum, String name, String bName, double bal) {
		accountNumber = anum;
		customerName = name;
		bankName = bName;
		balance = bal;
	}
	
	
	// write once reusable
	// 100 stmts
	// group of statements 1..n
	// all these statements are executed with call
	// methods are operating on instance variable (data) // CRU
	// update
	public void createAccount(int anum, String name, String bName, double bal) {
		accountNumber = anum;
		customerName = name;
		bankName = bName;
		balance = bal;
	}

	// Read & print
	public void getAccountDetails() {
		System.out.println(accountNumber);
		System.out.println(customerName);
		System.out.println(bankName);
		System.out.println(balance);
	}

	public void addInterest(double percent) {
		if(percent<=0) {
			throw new InvalidPercentException();
		}
		balance += balance * (percent / 100);
	}

	public double getBalance() {
		return balance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	// 100 methods
}
