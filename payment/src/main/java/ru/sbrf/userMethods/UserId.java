package ru.sbrf.userMethods;

public interface UserId {
    String entId = "Введите Ваш идентификационный номер клиента.";
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    String title = scanner.nextLine();

    void id();

    void idScanner();
}
