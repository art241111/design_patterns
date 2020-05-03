<h1> Паттерны проектирования </h1>
<h2> Паттерн "Фабричнй метод" </h2>
<p> "Фабричный метод" - это порождающий паттерн, который определяет общий интерфейс
для создания объектов в суперклассе, позволяя подклассам изменять тип создаваемых объектов. </p>
<p> То есть, благодаря данному паттерну, программист создает поле, и затем использует его,
не задумываясь о том, какая в нем заложена реализация. </p>
<p> Поле создается с помощью метода, а не с помощью стандартного констркутора, что позволяет выбрать
 реализацию, которую нам требуется. Возвращает даный метод абстрактный класс, в котором реализованы
 общие методы, которые в будующем использует программист. </p>

