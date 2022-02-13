package aoc.sonar.sweep.kotlin

import org.junit.Before
import java.io.File
import java.lang.Integer.parseInt
import kotlin.test.Test
import kotlin.test.assertEquals

class SonarSystemTest {

    private lateinit var sonarSystem: SonarSystem
    private val noInput: List<Int> = listOf()
    private val smallInput = listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)
    private val day1Input: MutableList<Int> = mutableListOf()
    private val day1InputFileLocation = "src/test/resources/day1Input.txt"

    @Before
    fun before() {
        sonarSystem = SonarSystem()
        File(day1InputFileLocation).readLines().forEach {
            day1Input += parseInt(it)
        }
    }

    @Test
    fun `test measurementsLargerThanPrevious no input`() {
        assertEquals(0, sonarSystem.measurementsLargerThanPrevious(noInput))
    }

    @Test
    fun `test measurementsLargerThanPrevious small input`() {
        assertEquals(7, sonarSystem.measurementsLargerThanPrevious(smallInput))
    }

    @Test
    fun `test measurementsLargerThanPrevious large input`() {
        assertEquals(1665, sonarSystem.measurementsLargerThanPrevious(day1Input))
    }

    @Test
    fun `test measurementsLargerThanPreviousGroupedBy3 no input`() {
        assertEquals(0, sonarSystem.measurementsLargerThanPreviousGroupedBy3(noInput))
    }

    @Test
    fun `test measurementsLargerThanPreviousGroupedBy3 small input`() {
        assertEquals(5, sonarSystem.measurementsLargerThanPreviousGroupedBy3(smallInput))
    }

    @Test
    fun `test measurementsLargerThanPreviousGroupedBy3 large input`() {
        assertEquals(1702, sonarSystem.measurementsLargerThanPreviousGroupedBy3(day1Input))
    }
}
