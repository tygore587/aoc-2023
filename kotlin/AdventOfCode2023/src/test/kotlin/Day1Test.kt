import day1.Day1Input
import day1.chris.Day1Chris
import day1.chris.Day1ChrisOptimized
import day1.martin.Day1Martin
import org.junit.jupiter.api.Test

class Day1Test {

    @Test
    fun day1Chris() {
        execute(
            Day1Chris(),
            Day1Input.chris1,
            Day1Input.chris2,
        )
    }

    @Test
    fun day1ChrisOptimized() {
        execute(
            Day1ChrisOptimized(),
            Day1Input.chris1,
            Day1Input.chris2,
        )
    }

    @Test
    fun day1Martin() {
        execute(
            Day1Martin(),
            Day1Input.martin1,
            Day1Input.martin2,
        )
    }
}