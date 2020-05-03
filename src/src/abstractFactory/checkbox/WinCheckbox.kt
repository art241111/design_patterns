package abstractFactory.checkbox

/**
 * Реализация интерфейса Checkbox для Win
 */
class WinCheckbox:Checkbox {
    private var check = false

    override fun paint() {
        println("Paint WinCheckbox")
    }

    override fun isCheck(): Boolean {
        println("WinCheckbox is $check")
        return check
    }

    override fun change(): Boolean {
        check = !check
        println("New value WinCheckbox is $check")
        return check
    }
}