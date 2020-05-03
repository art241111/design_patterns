package abstractFactory.button

/**
 * Реализация интерфейса Button для Win
 */
class WinButton:Button {
    override fun onClick() {
        println("Click on WinButton")
    }

    override fun editText(text: String) {
        println("New WinButton text is $text")
    }

    override fun paint() {
        println("Paint WinButton")
    }
}