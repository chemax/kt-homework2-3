package ru.netology

const val standardDiscount = 10_000L
const val bigPercentDiscount = 0.05
const val melomanDiscount = 0.01
const val standardDiscountPurch = 100_100
const val bigPercentDiscountPurch = 1_000_100

fun main() {
    val userPreviousPurchSum = 50010000L
    val currentPrice = 10000L
    val userMeloman: Boolean = true
    var resultPrice = currentPrice


    //Если предыдущая сумма покупок от 1 001 до 10 000, то стандартная скидка 100 рублей
    if (userPreviousPurchSum in standardDiscountPurch until bigPercentDiscountPurch) {
        resultPrice = currentPrice - standardDiscount
    } else if (userPreviousPurchSum >= bigPercentDiscountPurch) {
        resultPrice = (currentPrice - currentPrice * bigPercentDiscount).toLong()
    }
    if (userMeloman) {
        resultPrice = (resultPrice - resultPrice * melomanDiscount).toLong()
    }

    println("Сумма покупок: ${currentPrice.toDouble() / 100} руб\nСумма с учётом скидок: ${resultPrice.toDouble() / 100} руб")
}