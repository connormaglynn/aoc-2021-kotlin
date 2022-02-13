package aoc.sonar.sweep.kotlin

import org.junit.Before
import java.io.File
import java.lang.Integer.parseInt
import kotlin.test.Test
import kotlin.test.assertEquals

class SonarSystemTest {

    private lateinit var sonarSystem: SonarSystem

    @Before
    fun before() {
        sonarSystem = SonarSystem()
    }

    @Test
    fun `test measurementsLargerThanPrevious no input`() {
        val input: List<Int> = listOf()
        assertEquals(0, sonarSystem.measurementsLargerThanPrevious(input))
    }

    @Test
    fun `test measurementsLargerThanPrevious small input`() {
        val input = listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)
        assertEquals(7, sonarSystem.measurementsLargerThanPrevious(input))
    }

    @Test
    fun `test measurementsLargerThanPrevious small large input`() {
        val input: MutableList<Int> = mutableListOf()
        File("src/test/resources/day1Input.txt").readLines().forEach {
            input += parseInt(it)
        }
        assertEquals(1665, sonarSystem.measurementsLargerThanPrevious(input))
    }
}
