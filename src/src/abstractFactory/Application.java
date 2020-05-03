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
    public static void main(String[] args) {
        try {

            // Создаем Windows интерфейс
            GUIFactory factory = configurateFactory("Windows");
            buttonEditText_click_isCheck_change_isCheck(factory);

            // Создаем Mac интерфейс
            factory = configurateFactory("Mac");
            buttonEditText_click_isCheck_change_isCheck(factory);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void buttonEditText_click_isCheck_change_isCheck(GUIFactory factory){
        Button button = createButon(factory);
        Checkbox checkbox = createCheckbox(factory);

        button.editText("Hello world!");
        button.onClick();

        System.out.println();
        checkbox.isCheck();
        checkbox.change();
        checkbox.isCheck();
    }
    private static Button createButon(GUIFactory factory){
        return factory.createButton();
    }

    private static Checkbox createCheckbox(GUIFactory factory){
        return factory.createCheckbox();
    }

    private static GUIFactory configurateFactory(String config) throws Exception {
        if(config == "Windows"){
            return new WinFactory();
        } else if(config == "Mac"){
            return new MacFactory();
        } else{
            throw new Exception("Error! Unknown operation system!");
        }
    }
}
