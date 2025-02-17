class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String customerName, double balance, double overdraftLimit) {
        super(customerName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() - amount) >= -overdraftLimit) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit.");
        }
    }
}