package abstractFactory.checkbox

/**
 * Реализация интерфейса Checkbox для Win
 */
class WinCheckbox:Checkbox {
    private var check = false

    /**
     * Отрисовка checkbox
     */
    override fun paint() {
        println("Paint WinCheckbox")
    }

    /**
     * Проверка выделен checkbox или нет
     * @return значение статуса checkbox
     */
    override fun isCheck(): Boolean {
        println("WinCheckbox is ${if(check)"checked" else "not checked"}")
        return check
    }

    /**
     * Изменение статуса checkbox
     * @return значение статуса checkbox
     */
    override fun change(): Boolean {
        check = !check
        println("New value WinCheckbox is ${if(check)"checked" else "not checked"}")
        return check
    }
}