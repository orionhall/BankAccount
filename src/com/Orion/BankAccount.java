package com.Orion;
import java.util.Scanner;

class BankAccount {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;


    public BankAccount() {
        this(56789, 2.50, "Default Name", "Default Email", "Default Phone");
        System.out.println("Empty constructor called.");
    }

    public BankAccount(String customerName, String customerEmail, String customerPhone) {
        this(11111, 3.50, customerName, customerEmail, customerPhone);
    }

    public BankAccount(int accountNumber, double accountBalance, String customerName, String customerEmail, String customerPhone) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        System.out.println("Account constructor with parameters called.");
    }

    // Setters
    private void setAccountNumber (int accountNumber) {
        this.accountNumber = accountNumber;
    }

    void setAccountNumberPretty (Scanner scanner) {
        while (this.accountNumber == 0) {
            System.out.println("What is your account number?");
            if (scanner.hasNextInt()) {
                this.setAccountNumber(scanner.nextInt());
                System.out.println("Account number set as " + this.getAccountNumber() + ".");
                scanner.nextLine();
            } else {
                System.out.println("Invalid account number.");
                scanner.nextLine();
            }
        }
    }

    private void setAccountBalance (double accountBalance) {
        this.accountBalance = accountBalance;
    }

    void setAccountBalancePretty (Scanner scanner) {
        while (this.accountBalance == 0) {
            System.out.println("What is your account balance?");
            if (scanner.hasNextDouble()) {
                this.setAccountBalance(scanner.nextDouble());
                System.out.println("Account balance set as " + this.getAccountBalance() + ".");
                scanner.nextLine();
            } else {
                System.out.println("Invalid account balance.");
                scanner.nextLine();
            }
        }
    }

    void setCustomerName (String customerName) {
        this.customerName = customerName;
    }

    void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    // Getters
    private int getAccountNumber() {
        return accountNumber;
    }

    private double getAccountBalance() {
        return accountBalance;
    }

    String getCustomerName() {
        return customerName;
    }

    String getCustomerEmail() {
        return customerEmail;
    }

    String getCustomerPhone() {
        return customerPhone;
    }

    // Other methods
    void depositFunds (double depositAmount) {
        if (depositAmount < 0) {
            System.out.println("Cannot deposit a negative amount.");
        } else if (depositAmount == 0) {
            System.out.println("Cannot deposit 0.");
        } else {
            this.accountBalance += depositAmount;
            System.out.println("Deposited " + depositAmount + " into account.");
            System.out.println("Account balance is now " + this.accountBalance);
        }
    }

    void withdrawFunds (double withdrawalAmount) {
        if (withdrawalAmount < 0) {
            System.out.println("Cannot withdraw a negative amount.");
        } else if (withdrawalAmount == 0) {
            System.out.println("Cannot withdraw 0.");
        } else {
            if (this.accountBalance - withdrawalAmount < 0) {
                System.out.println("Account balance is " + this.accountBalance + ".  Cannot withdraw " + withdrawalAmount + ".");
            } else {
                this.accountBalance -= withdrawalAmount;
                System.out.println("Withdrew " + withdrawalAmount + " from account.");
                System.out.println("Account balance is now " + this.accountBalance);
            }
        }
    }

    void getAccountInfo () {
        System.out.println("Account number is: " + this.getAccountNumber());
        System.out.println("Account balance is: " + this.getAccountBalance());
        System.out.println("Customer name is: " + this.getCustomerName());
        System.out.println("Customer email address is: " + this.getCustomerEmail());
        System.out.println("Customer phone number is: " + this.getCustomerPhone());
    }
}
