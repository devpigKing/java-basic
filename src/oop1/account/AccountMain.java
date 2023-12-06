package oop1.account;

public class AccountMain {
    public static void main(String[] args) {

        Account account = new Account();

        account.deposit(10000);
        account.showStatus();

        account.withdraw(9000);
        account.showStatus();

        account.withdraw(2000);
        account.showStatus();
    }
}
