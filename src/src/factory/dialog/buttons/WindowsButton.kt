package factory.dialog.buttons

/**
 * Реализация Windows button
 */
class WindowsButton:Button {
    override fun render() {
        println("Windows button render")
    }

    override fun onClick() {
        println("Windows button click")
    }
}