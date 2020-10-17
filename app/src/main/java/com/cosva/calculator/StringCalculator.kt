package com.cosva.calculator

class StringCalculator {

    fun calculate(calculationList: List<String>): Int {
        var currentOp: String = ""
        var currentNumber = 0

        calculationList.forEach { token ->
            when {
                token == "+"
                        || token == "/"
                        || token == "*"
                        || token == "-" -> currentOp = token

                currentOp == "-" -> currentNumber -= token.toInt()
                currentOp == "/" -> currentNumber /= token.toInt()
                currentOp == "*" -> currentNumber *= token.toInt()
                else -> currentNumber += token.toInt()

            }
        }

        return currentNumber
    }
}
