package factory.dialog

import factory.dialog.buttons.Button

/**
 * Абстрактный класс с методами, которые должен использовать пользователь.
 * Это могут быть как стандартные методы - которые реализуют кнопки,
 * так и любые другие.
 */
abstract class Dialog{
    /**
     * Создание кнопки через абстрактный метод,
     * что позволяет наследникам поменять тип кнопки
     */
    private val okButton = createButton()


    /**
     * Простые операии, которые могут делать кнопки
     */
    fun render(){
        okButton.render()
    }
    fun onClick(){
        okButton.onClick()
    }

    fun renderAndClick(){
        okButton.render()
        okButton.onClick()
    }


    /**
     * Абстрактный класс, который позволяет при наследовании
     * реализовывать нужный тип.
     */
    abstract fun createButton():Button
}