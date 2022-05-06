class BankAcct {
  private int acctNum;
  private double balance;

  // Default constructor
  public BankAcct() {
    // By default, numeric attributes
    // are initialised to 0
  }

  public BankAcct(int aNum, double bal) {
    // Initilize attributes with user
    // provided values
    acctNum = aNum;
    balance = bal;
  }

  // Other methods on next slide
  public int getAcctNum() {
    return acctNum;
  }

  public double getBalance() {
    return balance;
  }

  public boolean withdraw(double amount) {
    if (balance < amount)
      return false;
    balance -= amount;
    return true;
  }

  public void deposit(double amount) {
    if (amount <= 0)
      return;
    balance += amount;
  }

  public void print() {
    System.out.println("Account number: " + getAcctNum());
    System.out.printf("Balance: $%.2f\n", getBalance());
  }
}