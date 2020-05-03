package abstractFactory.guiFactory

import abstractFactory.button.Button
import abstractFactory.button.MacButton
import abstractFactory.checkbox.Checkbox
import abstractFactory.checkbox.MacCheckbox

/**
 * Каждая конкретная фабрика знает и создает
 * только продукты своей вариации
 */
class MacFactory:GUIFactory {
    override fun createButton(): Button {
        return MacButton()
    }

    override fun createCheckbox(): Checkbox {
        return MacCheckbox()
    }
}