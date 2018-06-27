import com.library.lab.Admin;
import com.library.lab.Catalog;
import com.library.lab.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AppMain {

    public static void main(String[] args) {
        Admin admin = new Admin("Fedor Sidorov", mockCatalogs());
        User user = new User("Alex Petrov");
        user.setUserSubscribedCatalogs(mockCatalogs());
    }

    private static List<Catalog> mockCatalogs() {
        List<Catalog> catalogs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            catalogs.add(new Catalog("Catalog " + i, 1500));
        }

        return catalogs;
    }
}
