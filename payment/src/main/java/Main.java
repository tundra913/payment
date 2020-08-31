import ru.sbrf.payment.Application;
import ru.sbrf.payment.Server;
import ru.sbrf.payment.User;

public class Main {
    public static void main(String[] args) {
        Application server = new Server();
        User ivanov = new Application();


//        ivanov.id();
//        ivanov.idScanner();
//        ivanov.phone();
//        ivanov.phoneScanner();
//        ivanov.account();
//        ivanov.accountScanner();
//        ivanov.sum();
//        ivanov.sumScanner();
//        ivanov.currency();
//        ivanov.currencyScanner();

        ivanov.unification();


        System.out.println();
        System.out.println("Подождите, платеж выполняется.");
        System.out.println();

        server.dataExchange();

        System.out.println();
        System.out.println("Платеж исполнен.");
        System.out.println("Спасибо, что выбрали наш банк!");
    }
}
//почему нет реализации?