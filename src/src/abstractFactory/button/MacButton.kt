package abstractFactory.button

/**
 * Реализация интерфейса Button для Mac
 */
class MacButton:Button {
    var nameButton = "Button"

    /**
     * Реакция кнопки на нажатие кнопки
     */
    override fun onClick() {
        println("Click on MacButton")
    }

    /**
     * Изменения текста кнопки
     * @param text - текст, на который меянется текст
     */
    override fun editText(text: String) {
        nameButton = text
        println("New MacButton text is $nameButton")
    }

    /**
     * Отрисвка кнопки
     */
    override fun paint() {
        println("Paint MacButton")
    }
}