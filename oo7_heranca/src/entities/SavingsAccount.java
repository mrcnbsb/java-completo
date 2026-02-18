package entities;

public final class SavingsAccount extends Account { //conta poupança //final-> a classe não pode ser herdada
	
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		this.balance += balance * interestRate;
	}
	
	@Override
	public final void withdraw(double amount) { //final-> método não pode ser sobreposto
		this.balance -= amount;
	}
}
