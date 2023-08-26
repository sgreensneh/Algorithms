package chapterThree;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("John Doe", 50.00);
        Account account2 = new Account("John Blue", -7.00);
        displayAccount(account1);
        System.out.println();
        displayAccount(account2);

    }
    public static void displayAccount(Account accountToDisplay) {
        System.out.printf("name: %s  balance: $%.2f", accountToDisplay.getName(), accountToDisplay.getBalance());
    }
}
