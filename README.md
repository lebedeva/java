# java
ФИБОНАЧЧИ (Леонардо из Пизы) 
Fibonacci (Leonardo of Pisa), ок. 1175–1250 

Чи́сла Фибона́ччи — элементы последовательности
1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, …

В которой первые два числа равны либо 1 и 1, либо 0 и 1, а каждое последующее число равно сумме двух предыдущих чисел. 

# Javac. Компилируем и запускаем класс из командной строки cmd
Чтобы скомпилировать и запустить Java-приложение, не обязательно пользовать специальными средами для программирования, такими как jdeveloper или eclipse, NetBeans, jGRASP. Можно, просто, запустить командную строчку cmd и от туда вызвать компилятор Java. Скопилировать небольшое Java-приложение и запустить на выполнение.

- Если Java-приложение надо скомпилировать и запустить, то JDK должен быть установлен на ПК.
- Если Java-приложение надо, просто, запустить на выполнение, то достаточно установленного JRE на ПК. Необходима для исполнения Java-приложений.

<b>Компилируем класс:</b>
с:\Testing\src>"c:\Program Files (x86)\Java\jdk1.7.0_60\bin\javaс" -d ..\clasess ru\ingos\fibonachi.java
 - Запускаем Java-компилятор. Для этого надо знать, куда установлено JDK ("c:\Program Files (x86)\Java\jdk1.7.0_60\bin\javaс")
 - Поднимаемся на этаж выше и опускаемся в директорию clasess. Кидаем туда скомпилированный байт-код (-d ..\clasess).
 - Java-класс, который будем компилировать (fibonachi.java), находится по указанному пути (ru\ingos\fibonachi.java).

<b>Запускаем класс:</b>
с:\Testing\clasess>"c:\Program Files (x86)\Java\jdk1.7.0_60\bin\java" ru.ingos.fibonachi
 - Из директории, в которой лежит скомпилированный байт-код, запускаем пакет на выполнение.   

В Java существует несколько способов сделать сборку Java-приложения.
 <b>1. :</b>