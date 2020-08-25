package ru.sbrf.userMethods;

public interface AccountNumber {
    String accountNumb = "Введите 20-тизначный номер счета для списания.";
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    String title = scanner.nextLine();

    void account();

    void accountScanner();
}
