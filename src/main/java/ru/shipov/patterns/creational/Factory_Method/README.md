Фабричный метод (Factory Method)
-------------------------
 Порождающий шаблон проектирования, предоставляющий подклассам (дочерним классам) интерфейс для создания экземпляров 
 некоторого класса. В момент создания наследники могут определить, какой класс создавать. 
 Иными словами, данный шаблон делегирует создание объектов наследникам родительского класса. 
 Это позволяет использовать в коде программы не специфические классы, а манипулировать абстрактными объектами 
 на более высоком уровне.
  
Назначение
-------------------------
 Определяет интерфейс для создания объекта, но оставляет подклассам решение о том, какой класс инстанцировать. 
 Фабричный метод позволяет классу делегировать создание подклассов

Реализация
-------------------------

![Factory Method](https://upload.wikimedia.org/wikipedia/ru/f/f0/FactoryMethodPattern.png)

Плюсы
-------------------------
 - позволяет сделать код создания объектов более универсальным, не привязываясь к конкретным классам (ConcreteProduct), 
 а оперируя лишь общим интерфейсом (Product);
 - позволяет установить связь между параллельными иерархиями классов.
 
Минусы
-------------------------
 - необходимость создавать наследника Creator для каждого нового типа продукта (ConcreteProduct).

Применение
-------------------------
Используется, когда:
 - Классу заранее неизвестно, объекты каких подклассов ему нужно создавать.
 - Класс спроектирован так, чтобы объекты, которые он создаёт, специфицировались подклассами.
 - Класс делегирует свои обязанности одному из нескольких вспомогательных подклассов, и планируется локализовать 
 знание о том, какой класс принимает эти обязанности на себя

 
 [на главную страницу](https://github.com/EvgeniyShipov/patterns)