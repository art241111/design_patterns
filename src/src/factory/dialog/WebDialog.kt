package factory.dialog

import factory.dialog.buttons.Button
import factory.dialog.buttons.HtmlButton

/**
 * Создание Dialog для Web button
 */
class WebDialog: Dialog() {
    override fun createButton(): Button {
        return HtmlButton()
    }
}