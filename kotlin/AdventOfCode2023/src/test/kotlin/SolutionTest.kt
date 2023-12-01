import day1.Day1Chris
import day1.Day1Input
import day1.Day1Martin
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import utils.InputReader

class SolutionTest {
    private val inputReader = InputReader()

    @Test
    fun day1Chris() {
        val solution = Day1Chris().solve(
            inputReader.read(Day1Input.chris.value)
        )
        println("Solution: $solution")
        assertEquals(solution, Day1Input.chris.solution)
    }

    @Test
    fun day1Martin() {
        val solution = Day1Martin().solve(
            inputReader.read(Day1Input.martin.value)
        )
        println("Solution: $solution")
        assertEquals(solution, Day1Input.martin.solution)
    }
}