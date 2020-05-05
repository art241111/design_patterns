package singleton;

public class Application {
    /**
     * Клиентский код.
     * Если бы не использовался singleton, то было бы выведено 1 и 1, но
     * так как используются singleton, которыый
     * не пересоздает объект, а использует единственную реализацию,
     * то будет выведено 1 и 2
     */
    public static void main(String[] args) {
        Database database = Database.getInstance();
        database.query(); // 1

        Database second_database = Database.getInstance();
        database.query(); // 2
    }
}
