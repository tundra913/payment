package ru.sbrf.userMethods;

public interface Sum {
    String entSum = "Введите сумму платежа в формате '0.00'.";
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    String title = scanner.nextLine();

    void sum();

    void sumScanner();
}
