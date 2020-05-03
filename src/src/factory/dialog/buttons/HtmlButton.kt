package factory.dialog.buttons

/**
 * Реализация Web button
 */
class HtmlButton:Button {
    override fun render() {
        println("Html button render")
    }

    override fun onClick() {
        println("Html button click")
    }
}