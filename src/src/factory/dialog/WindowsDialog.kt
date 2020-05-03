package factory.dialog

import factory.dialog.buttons.Button
import factory.dialog.buttons.WindowsButton
/**
 * Создание Dialog для Windows button
 */
class WindowsDialog: Dialog() {
    override fun createButton(): Button {
        return WindowsButton()
    }

}