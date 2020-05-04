package factory;

import factory.dialog.Dialog;
import factory.dialog.WebDialog;
import factory.dialog.WindowsDialog;

/**
 * Благодаря фабрике, можно убрать зависимость от реализации.
 * Допустим у нас есть два типа кнопок Windows и Web.
 * С помощью @param config - задается тип кнопки, причем если такого типа нет,
 * то появится ошибка.
 * Создается поле dialog, в котором храниться заданная кнопка и у которого можно вызвать методы:
 * render, onClick, renderAndClick.
 * То есть в Dialog мы можем задать любые комбинации, которые будут работать для обоих кнопок.
 * И в последующем использовать dialog не задумываясь о том, какой тип кнопки задан.
 */
public class Application {
    /**
     * Задаем config, затем в блоке try/catch создаем кнопку
     * и вызываем метод для работы с ними (Причем какой тип
     * кнопки используется нас не волнует)
     * @param args
     */
    public static void main(String[] args){
        String config = "Windows";
        try{
            Dialog dialog = initialize(config);
            doWithButton(dialog);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param config - тип кнопки
     * @return возвращается Dialog со значением кнопки с заданным типом
     * @throws Exception - если такой тип не реализован
     */
    private static Dialog initialize(String config) throws Exception {
        if(config.equals("Windows")){
            return new WindowsDialog();
        } else if (config.equals("Web")){
            return new WebDialog();
        } else{
            throw new Exception("Error, Unknown operation system.");
        }
    }

    /**
     * Метод, в котором проводится операции с кнопками
     * (причем не важно какого они типа)
     * @param dialog - поле, которое определяет кнопку
     */
    private static void doWithButton(Dialog dialog){
        dialog.render();
        System.out.println();

        dialog.renderAndClick();
        System.out.println();

        dialog.onClick();
    }

}
