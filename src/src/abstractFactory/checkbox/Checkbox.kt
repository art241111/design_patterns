package abstractFactory.checkbox

/**
 * Интерфейс, который описывает действия,
 * которые должен вполнять checkbox
 */
interface Checkbox {
    fun paint()
    fun isCheck():Boolean
    fun change():Boolean
}