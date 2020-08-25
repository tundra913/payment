package ru.sbrf.userMethods;

public interface Currency {
    String entCurr = "Введите, в какой валюте будет производиться платеж, в формате 'rub', 'eur', 'usd'.";
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    String title = scanner.nextLine();

    void currency();

    void currencyScanner();
}
