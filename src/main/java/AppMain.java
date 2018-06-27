import com.library.lab.Admin;
import com.library.lab.Catalog;
import com.library.lab.User;

import java.util.ArrayList;
import java.util.List;

public class AppMain {

    public static void main(String[] args) {
        Admin admin = new Admin("Fedor Sidorov", mockAllCatalogs());
        User user = new User("Alex Petrov");
        user.setBalance(5006.0);
        user.registerSubscription(mockAllCatalogs().get(4));
        //вывод имеющихся у пользователя подписок
        printUserSubscription(user);

        admin.printAllCatalogs();

    }

    private static List<Catalog> mockAllCatalogs() {
        List<Catalog> catalogs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            catalogs.add(new Catalog("Catalog " + i, 1500));
        }

        return catalogs;
    }

    private static void printUserSubscription(User user) {
        System.out.println("Пользователь: " + user.getUserName() + " имеет подписки на каталоги:");
        for (Catalog catalog: user.getUserSubscribedCatalogs()) {
            System.out.println(catalog.getCatalogTitle());
        }
    }
}
