package abstractFactory;

import abstractFactory.button.Button;
import abstractFactory.checkbox.Checkbox;
import abstractFactory.guiFactory.GUIFactory;
import abstractFactory.guiFactory.MacFactory;
import abstractFactory.guiFactory.WinFactory;

/**
 * Абстрактная фабрика позволяет создавать не просто разные предметы,
 * но также и с разными типами.
 * Как видно из примера: мы создаем две разные фабрики.
 * В одном случае фабрику с описанием Windows компонентов,
 * в другом случае с описанием Mac компонентов.
 *
 * Далее можно увидеть, что для разных фабрик мы вызываем одну и туже функцию,
 * то есть абстрактная фабрика позволяет нам создавать компоненты разных стилей,
 * затем создавая разная фабрики - использовать стандартные компоненты, не задумываясь о том,
 * какой используется тип (windows/mac)
 */
public class Application {
    /**
     * Метод в котором создается два вида кнопок
     * Windows и Mac. Затем вызывается метод, который
     * работает с кнопками и checkbox
     */
    public static void main(String[] args) {
        try {
            // Создаем Windows интерфейс
            GUIFactory factory = configFactory("Windows");
            buttonEditText_click_isCheck_change_isCheck(factory);

            // Создаем Mac интерфейс
            factory = configFactory("Mac");
            buttonEditText_click_isCheck_change_isCheck(factory);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод для работы с элементами интерфеса
     * @param factory - поле, в котором храниться тип интерфеса,
     *                но реализацию метода не волнует какой он.
     */
    private static void buttonEditText_click_isCheck_change_isCheck(GUIFactory factory){
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.editText("Hello world!");
        button.onClick();

        System.out.println();
        checkbox.isCheck();
        checkbox.change();
        checkbox.isCheck();
    }

    /**
     * Метод, который создает фабрику
     * @param config - тип опирационной системы, для которой
     *               создаются элементы
     * @return фабрика, в которой храниться реализация типа интерфейса
     * @throws Exception - если такой ОС не задано
     */
    private static GUIFactory configFactory(String config) throws Exception {
        if(config.equals("Windows")){
            return new WinFactory();
        } else if(config.equals("Mac")){
            return new MacFactory();
        } else{
            throw new Exception("Error! Unknown operation system!");
        }
    }
}
