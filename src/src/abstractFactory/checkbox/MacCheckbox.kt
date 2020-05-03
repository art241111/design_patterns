package abstractFactory.checkbox

/**
 * Реализация интерфейса Checkbox для Mac
 */
class MacCheckbox: Checkbox {
    private var check = false

    override fun paint() {
        println(" Paint MacCheckbox")
    }

    override fun isCheck(): Boolean {
        println( "MacCheckbox is $check")
        return check
    }

    override fun change(): Boolean {
        check = !check
        println( "New value MacCheckbox is $check")
        return check
    }
}