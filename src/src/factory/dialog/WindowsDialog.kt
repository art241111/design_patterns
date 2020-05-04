package factory.dialog

import factory.dialog.buttons.Button
import factory.dialog.buttons.WindowsButton
/**
 * Создание Dialog для Windows button
 */
class WindowsDialog: Dialog() {
    /**
     * Инициализация абстрактного класса, для того
     * чтобы задать тип кнопки для класса родителя
     */
    override fun createButton(): Button {
        return WindowsButton()
    }

}