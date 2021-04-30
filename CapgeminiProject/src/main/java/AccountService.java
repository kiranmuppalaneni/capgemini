public class AccountService {

	// Account -  whether account is there or not
	public double withdraw(Account account, double amount) {
		double currentBalance = account.getBalance();
		double newBalance = 0.0;
		if (amount > 100) {
			if (currentBalance > amount) {
				newBalance = currentBalance - amount;
				account.setBalance(newBalance);
			} else {
				throw new LowBalanceException();
			}
		} else {
			throw new NegativeAmountException();
		}
		return newBalance;
	}

}
