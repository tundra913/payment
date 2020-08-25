package ru.sbrf.payment;

import ru.sbrf.applicationMethods.Pay;

public class Application extends User implements Pay {
    public void hostadress() {
        System.out.println(Pay.hAdress);
    }

    public void ip() {
        System.out.println(Pay.ipAdress);
    }

    public void port() {
        System.out.println(Pay.portAdress);
    }

    public void protocol() {
        System.out.println(Pay.protAdress);
    }

    public void dataExchange() {
        this.protocol();
        this.port();
        this.ip();
        this.hostadress();

    }

    @Override
    public void unification() {
        super.unification();
    }
}

