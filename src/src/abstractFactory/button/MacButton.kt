package abstractFactory.button

/**
 * Реализация интерфейса Button для Mac
 */
class MacButton:Button {
    override fun onClick() {
        println("Click on MacButton")
    }

    override fun editText(text: String) {
        println("New MacButton text is $text")
    }

    override fun paint() {
        println("Paint MacButton")
    }
}