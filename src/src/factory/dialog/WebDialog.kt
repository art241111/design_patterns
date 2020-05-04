package factory.dialog

import factory.dialog.buttons.Button
import factory.dialog.buttons.HtmlButton

/**
 * Создание Dialog для Web button
 */
class WebDialog: Dialog() {
    /**
     * Инициализация абстрактного класса, для того
     * чтобы задать тип кнопки для класса родителя
     */
    override fun createButton(): Button {
        return HtmlButton()
    }
}