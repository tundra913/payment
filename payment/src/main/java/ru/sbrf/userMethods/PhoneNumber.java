package ru.sbrf.userMethods;

public interface PhoneNumber {
    String phoneNumb = "Введите номер Вашего мобильного телефона без '8'.";
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    String title = scanner.nextLine();

    void phone();

    void phoneScanner();
}

