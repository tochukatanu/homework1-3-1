package ru.netology


fun main() {

    println("Пользователь был онлайн" + agoToText(87000 * 3))

}

fun agoToText(timeInSeconds: Int): String {
    return when {
        timeInSeconds < 60 -> " только что"
        timeInSeconds < 60 * 60 -> " ${timeInSeconds / 60} ${minutes(timeInSeconds / 60)} назад"
        timeInSeconds < 24 * 60 * 60 -> " ${timeInSeconds / 3600} ${hoursAndDays(timeInSeconds / 3600)} назад"
        timeInSeconds < 24 * 60 * 60 * 2 -> " вчера"
        timeInSeconds < 24 * 60 * 60 * 3 -> " позавчера"
        else -> " очень давно"
    }

}

fun minutes(timeInSeconds: Int): String {
    return when {
        timeInSeconds % 10 == 0 -> " минут"
        (timeInSeconds - 1) % 10 == 0 -> " минуту"
        (timeInSeconds - 2) % 10 == 0 || (timeInSeconds - 3) % 10 == 0 || (timeInSeconds - 4) % 10 == 0 -> " минуты"
        else -> " минут"
    }
}

fun hoursAndDays(timeInSeconds: Int): String {
    return when {
        timeInSeconds % 3600 < 2 -> " час"
        (timeInSeconds % 3600 - 1) % 10 == 0 -> "  час"
        (timeInSeconds % 3600 - 2) % 10 == 0 -> " часа"
        (timeInSeconds % 3600 - 3) % 10 == 0 -> " часа"
        (timeInSeconds % 3600 - 4) % 10 == 0 -> " часа"
        else -> " часов"
    }
}
