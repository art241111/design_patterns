package abstractFactory.checkbox

/**
 * Реализация интерфейса Checkbox для Mac
 */
class MacCheckbox: Checkbox {
    private var check = false

    /**
     * Отрисовка checkbox
     */
    override fun paint() {
        println(" Paint MacCheckbox")
    }

    /**
     * Проверка выделен checkbox или нет
     * @return значение статуса checkbox
     */
    override fun isCheck(): Boolean {
        println( "MacCheckbox is ${if(check)"checked" else "not checked"}")
        return check
    }

    /**
     * Изменение статуса checkbox
     * @return значение статуса checkbox
     */
    override fun change(): Boolean {
        check = !check
        println( "New value MacCheckbox is ${if(check)"checked" else "not checked"}")
        return check
    }
}