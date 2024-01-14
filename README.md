# Пустой репозиторий для работы с Java кодом в Android Studio

Вся логика взаимодействия с пользователем описана в классе Main:
 - Программа запрашивает у пользователя, на скольких человек разделить счёт и проверяет данные на корректность с помощью if/else, а также try/catch.
 - При успешном вводе количества человек (>1) на вход принимает информацию о товарах. Эта информация попадает в класс Calculator.
 - Класс Calculator состоит из основных методов: подсчёт общей стоимости для каждого пользователя, добавление в список товаров, а также вывод списка на экран после добавления всех. 
 - Каждый товар - объект класса Product c двумя полями: "название товара" и "цена", а также конструктором.
 - Класс Formatter состоит из двух основных методов, которые помогают с выводом на экран: округление суммы до двух знаков после запятой и склонение валюты "рубль".
