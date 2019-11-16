Декоратор/Обертка (Decorator/Wrapper) 
-------------------------
  Cтруктурный шаблон проектирования, предназначенный для динамического подключения дополнительного поведения к объекту. 
  Шаблон Декоратор предоставляет гибкую альтернативу практике создания подклассов с целью расширения функциональности.
  
Назначение
-------------------------
  Объект, который предполагается использовать, выполняет основные функции. Однако может потребоваться добавить к нему 
  некоторую дополнительную функциональность, которая будет выполняться до, после или даже вместо основной 
  функциональности объекта. Декоратор предусматривает расширение функциональности объекта без определения подклассов.

Реализация
-------------------------

 Создаётся абстрактный класс, представляющий как исходный класс, так и новые, добавляемые в класс функции. 
 В классах-декораторах новые функции вызываются в требуемой последовательности — до или после вызова последующего объекта.

 При желании остаётся возможность использовать исходный класс (без расширения функциональности), 
 если на его объект сохранилась ссылка.

![Decorator/Wrapper](https://upload.wikimedia.org/wikipedia/ru/0/00/Decorator_template.png)

Плюсы
-------------------------
 - позволяет динамически и статически расширять функциональность, не меняя структуры существующих объектов;
 - использует композиию, что обеспечивает соблюдение принципов SOLID;
 - упрощает написание кода благодаря созданию новых классов для каждого элеманта функциональности вместо изменения 
 существующегокода приложения.
 
 [на главную страницу](https://github.com/EvgeniyShipov/patterns)