package ru.sbrf.payment;

import ru.sbrf.userMethods.*;

public class User implements UserId, PhoneNumber, AccountNumber, Sum, Currency {
    public void id() {
        System.out.println(UserId.entId);
    }

    public void idScanner() {
        System.out.println(UserId.title);
    }


    public void phone() {
        System.out.println(PhoneNumber.phoneNumb);
    }

    public void phoneScanner() {
        System.out.println(PhoneNumber.title);
    }


    public void account() {
        System.out.println(AccountNumber.accountNumb);
    }

    public void accountScanner() {
        System.out.println(AccountNumber.title);
    }


    public void sum() {
        System.out.println(Sum.entSum);
    }

    public void sumScanner() {
        System.out.println(Sum.title);
    }


    public void currency() {
        System.out.println(Currency.entCurr);
    }

    public void currencyScanner() {
        System.out.println(Currency.title);
    }

    public void unification() {
        this.id();
        this.idScanner();
        this.phone();
        this.phoneScanner();
        this.account();
        this.accountScanner();
        this.sum();
        this.sumScanner();
        this.currency();
        this.currencyScanner();
    }
}

