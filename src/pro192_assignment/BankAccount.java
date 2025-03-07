package pro192_assignment;

/**
 *
 * @author Nguyen Tan Trung - CE200064
 */
public class BankAccount {

    private String accountNumber; // So tai khoan
    private String holderName; // Chu tai khoan
    private double balance; // So du hien tai

    // Phuong thuc khoi tao (constructor)
    public BankAccount() {
    }

    public BankAccount(String accountNumber, String holderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
    }

    //Getter: de lay du lieu
    //Khong tao Setter vi AccountNumber, HolderName khong the thay doi, Balance thi thay doi thong qua cac method khac
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    // Method gui tien
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Balance: " + this.balance);

    }

    // Method rut tien
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance: " + this.balance);
        }
    }

    @Override
    public String toString() {
        return String.format("%s |%s |%.3f", holderName, accountNumber, balance);
    }
}
