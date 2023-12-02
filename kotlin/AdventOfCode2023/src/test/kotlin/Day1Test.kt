import day1.chris.Day3Chris
import day1.martin.Day3Martin
import org.junit.jupiter.api.Test

class Day1Test {

    @Test
    fun day1Chris() {
        execute(
            Day3Chris(),
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
            Day3Martin(),
            Day1Input.martin1,
            Day1Input.martin2,
        )
    }
}