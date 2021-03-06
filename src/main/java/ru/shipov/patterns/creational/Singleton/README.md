Одиночка (Singleton)
-------------------------
 Порождающий шаблон проектирования, гарантирующий, что в однопроцессном приложении будет единственный экземпляр 
 некоторого класса, и предоставляющий глобальную точку доступа к этому экземпляру.
  
Назначение
-------------------------
 У класса есть только один экземпляр, и он предоставляет к нему глобальную точку доступа. 
 При попытке создания данного объекта он создаётся только в том случае, если ещё не существует, 
 в противном случае возвращается ссылка на уже существующий экземпляр и нового выделения памяти не происходит.

 Глобальный «одинокий» объект — бывает нужен:
 - если используется существующая объектно-ориентированная библиотека;
 - если есть шансы, что один объект когда-нибудь превратится в несколько;
 - если интерфейс объекта (например, игрового мира) слишком сложен и не стоит засорять основное пространство 
 имён большим количеством функций;
 - если, в зависимости от каких-нибудь условий и настроек, создаётся один из нескольких объектов. 
 Например, в зависимости от того, ведётся лог или нет, создаётся настоящий объект, пишущий в файл, 
 или «заглушка», ничего не делающая.

Реализация
-------------------------

![Singleton](https://upload.wikimedia.org/wikipedia/commons/d/d7/Singleton_classdia.png)

Плюсы
-------------------------
 - Контролируемый доступ к единственному экземпляру.
 
Минусы
-------------------------
 - Глобальные объекты могут быть вредны для объектного программирования, в некоторых случаях приводят к созданию 
 немасштабируемого проекта;
 - Усложняет написание модульных тестов и следование TDD. 

Применение
-------------------------
 - Должен быть ровно один экземпляр некоторого класса, легко доступный всем клиентам;
 - Единственный экземпляр должен расширяться путём порождения подклассов, и клиентам нужно иметь возможность работать 
 с расширенным экземпляром без модификации своего кода.
 
 [на главную страницу](https://github.com/EvgeniyShipov/patterns)