class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String customerName, double balance, double interestRate) {
        super(customerName, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
    }
}