package day1

import day1.chris.d1c1
import day1.chris.d1c2
import utils.Input

class Day1Input {
    companion object {
        val part1 = Input(
            """1abc2
                |pqr3stu8vwx
                |a1b2c3d4e5f
                |treb7uchet
            """.trimMargin(),
            77
        )

        val part2 = Input(
            """
            |two1nine
            |eightwothree
            |abcone2threexyz
            |xtwone3four
            |4nineeightseven2
            |zoneight234
            |7pqrstsixteen
            """.trimMargin(),
            281
        )

        val chris1 = Input(d1c1, 54561)
        val chris2 = Input(d1c2, 54076)

        val martin1 = part1
        val martin2 = part2
    }
}