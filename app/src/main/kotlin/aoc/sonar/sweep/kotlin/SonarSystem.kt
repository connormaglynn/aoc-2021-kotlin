package aoc.sonar.sweep.kotlin

class SonarSystem() {
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
}
