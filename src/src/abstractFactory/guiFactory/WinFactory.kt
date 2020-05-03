package abstractFactory.guiFactory

import abstractFactory.button.Button
import abstractFactory.button.WinButton
import abstractFactory.checkbox.Checkbox
import abstractFactory.checkbox.WinCheckbox

/**
 * Несмотря на то, что фабрика опирирует конкретными классами,
 * их методы возвращают абстрактные типы продуктов.
 * Благодаря этому фабрика можно взаимозаменять,
 * не изменяя клиентский код.
 */
class WinFactory:GUIFactory {
    override fun createButton(): Button {
        return WinButton()
    }

    override fun createCheckbox(): Checkbox {
        return WinCheckbox()
    }
}