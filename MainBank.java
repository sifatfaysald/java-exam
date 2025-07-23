public class MainBank {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("ACB12345", 1000.0);
        myAccount.deposit(500.0);
        myAccount.withdraw(300.0);
        myAccount.displayAccountInfo();
    }
}
