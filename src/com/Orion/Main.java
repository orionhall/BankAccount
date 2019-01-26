package com.Orion;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    BankAccount Account = new BankAccount();

	    Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your account information.");

        Account.setAccountNumberPretty(scanner);

        Account.setAccountBalancePretty(scanner);

        System.out.println("What is your name?");
        Account.setCustomerName(scanner.nextLine());
        System.out.println("Name set as " + Account.getCustomerName());

        System.out.println("What is your email address?");
        Account.setCustomerEmail(scanner.nextLine());
        System.out.println("Email address set as " + Account.getCustomerEmail());

        System.out.println("What is your phone number?");
        Account.setCustomerPhone(scanner.nextLine());
        System.out.println("Phone number set as " + Account.getCustomerPhone());

        scanner.close();

        System.out.println();
        System.out.println("Thank you for setting up your account.");
        Account.getAccountInfo();

        Account.withdrawFunds(4500);
        Account.depositFunds(29000);
    }
}
