import kotlin.math.roundToInt

fun main() {
    println("Практическая работа №1: Округление чисел")
    var number1 = 1272
    var number2 = 1672
    println("$number1 --> " + roundAndAddK(number1))
    println("$number2 --> " + roundAndAddK(number2))

    println()

    println("Практическая работа №2: Правильное окончание для слов")
    println("0 " + yearsWord(0))  // лет
    println("1 " + yearsWord(1))  // год
    println("2 " + yearsWord(2))  // года
    println("3 " + yearsWord(3))  // года
    println("4 " + yearsWord(4))  // года
    println("5 " + yearsWord(5))  // лет
    println("11 " + yearsWord(11))  // лет
    println("20 " + yearsWord(20))  // лет
    println("21 " + yearsWord(21))  // год
    println("22 " + yearsWord(22))  // года
    println("25 " + yearsWord(25))  // лет
}

/*
Практическая работа №1: Округление чисел
Создайте функцию, которая будет округлять четырехзначные числа,
заменяя все цифры, стоящие справа от разряда числа, буквой «К». Число
менее тысячи будет выводиться без изменений.

Пример:
// Передаем число 1272
// Получаем - 1К
 */
fun roundAndAddK(n: Int): String {
    if (n<1000) return n.toString()
    var rounded: Int = (n / 1000.0).roundToInt()
    return rounded.toString() + "K"
}

/*
Практическая работа №2: Правильное окончание для слов
Создайте функцию, которая будет возвращать правильное окончание
количеству лет.
Например: при вводе числа 1 функция будет добавлять слово «год» (чтобы
получилось 1 год), при вводе 2 – 2 года, при вводе 5 – 5 лет и т. д.
 */
fun yearsWord(years: Int): String {
    if ((years > 4) and (years < 21)) return ("лет")
    if (years % 10 == 1) return ("год")
    if ((years % 10 == 2) or (years % 10 == 3) or (years % 10 == 4)) return ("года")
    return "лет"
}