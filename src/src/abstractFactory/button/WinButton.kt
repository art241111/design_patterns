package abstractFactory.button

/**
 * Реализация интерфейса Button для Win
 */
class WinButton:Button {
    var nameButton = "Button"

    /**
     * Реакция кнопки на нажатие кнопки
     */
    override fun onClick() {
        println("Click on WinButton")
    }

    /**
     * Изменения текста кнопки
     * @param text - текст, на который меянется текст
     */
    override fun editText(text: String) {
        println("New WinButton text is $text")
    }

    /**
     * Отрисвка кнопки
     */
    override fun paint() {
        println("Paint WinButton")
    }
}