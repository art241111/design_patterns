package abstractFactory.button

/**
 * Интерфейс, который описывает действия,
 * которые должна вполнять кнопка
 */
interface Button {
    fun onClick()
    fun editText(text:String)
    fun paint()
}