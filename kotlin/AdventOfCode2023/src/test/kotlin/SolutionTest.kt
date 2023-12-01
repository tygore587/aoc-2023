import day1.Day1Chris
import day1.Day1ChrisOptimized
import day1.Day1Input
import day1.Day1Martin
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun day1Chris() {
        execute(
            Day1Chris(),
            Day1Input.chris1,
            Day1Input.chris2
        )
    }

    @Test
    fun day1ChrisOptimized() {
        execute(
            Day1ChrisOptimized(),
            Day1Input.chris1,
            Day1Input.chris2
        )
    }

    @Test
    fun day1Martin() {
        execute(
            Day1Martin(),
            Day1Input.chris1,
            Day1Input.chris2
        )
    }
}