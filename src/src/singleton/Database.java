package singleton;

/**
 * Singleton class
 * Важно: конструктор приватный, что позволяет создать
 * объект, только с помощью getInstance
 */
class Database {
    private static Database instance = new Database();
    private static Integer countCreate = 0;

    /**
     * Приватный конструктор
     */
    private Database() {}

    /**
     * Метод для получения объекта
     * @return объект типа Database
     */
    static Database getInstance(){
        countCreate++;
        return instance;
    }

    /**
     * Вывод значения countCreate
     */
    void query(){
        System.out.println(countCreate);
    }
}
