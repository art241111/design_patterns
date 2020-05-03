package factory.dialog.buttons

/**
 * Интерфейс, который описывает методы, который должны
 * реализовывать каждые кнопки
 */
interface Button {
    fun render()
    fun onClick()
}