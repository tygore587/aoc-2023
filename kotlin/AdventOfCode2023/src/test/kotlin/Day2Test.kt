import day1.martin.Day1Martin
import day2.Day2Input
import day2.chris.Day2Chris
import org.junit.jupiter.api.Test

class Day2Test {

    @Test
    fun day2Chris() {
        execute(
            Day2Chris(),
            Day2Input.chris1,
            Day2Input.chris2,
        )
    }

    @Test
    fun day2Martin() {
        execute(
            Day1Martin(),
            Day2Input.martin1,
            Day2Input.martin2,
        )
    }
}