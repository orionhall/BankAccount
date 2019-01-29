package com.Orion;

class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    VipCustomer() {
        this("George Bukowski", 50000000, "gbuksnow@skitown.com");
    }

    VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "dumb@dumb.com");
    }

    VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    String getName() {
        return name;
    }

    double getCreditLimit() {
        return creditLimit;
    }

    String getEmailAddress() {
        return emailAddress;
    }
}
