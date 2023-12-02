import day1.Day3Input
import day1.chris.Day3Chris
import day1.martin.Day3Martin
import org.junit.jupiter.api.Test

class Day3Test {

    @Test
    fun day3Chris() {
        execute(
            Day3Chris(),
            Day3Input.chris1,
            Day3Input.chris2,
        )
    }

    @Test
    fun day3Martin() {
        execute(
            Day3Martin(),
            Day3Input.martin1,
            Day3Input.martin2,
        )
    }
}