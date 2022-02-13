package aoc.sonar.sweep.kotlin

class SonarSystem {
    fun measurementsLargerThanPrevious(input: List<Int>): Int {
        var counter = 0
        var previousValue: Int? = null

        for (i in input) {
            if (previousValue == null) previousValue = i
            if (i > previousValue) counter++
            previousValue = i
        }

        return counter
    }

    fun measurementsLargerThanPreviousGroupedBy3(input: List<Int>): Int {
        val inputGrouped: MutableList<Int> = mutableListOf()
        input.forEachIndexed { index, i ->
            try {
                val secondValue = input[index + 1]
                val thirdValue = input[index + 2]
                val sumOfAll = i + secondValue + thirdValue
                inputGrouped += sumOfAll
            } catch (e: Exception) {
                return@forEachIndexed
            }
        }

        return measurementsLargerThanPrevious(inputGrouped)
    }
}
