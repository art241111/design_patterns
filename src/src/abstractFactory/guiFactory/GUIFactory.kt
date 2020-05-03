package abstractFactory.guiFactory

import abstractFactory.button.Button
import abstractFactory.checkbox.Checkbox

/**
 * Абстрактная фабрика знает о каждой вариации продукта
 */
interface GUIFactory {
    fun createButton():Button
    fun createCheckbox():Checkbox
}