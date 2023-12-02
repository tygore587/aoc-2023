package day2

import day2.chris.d2c1
import utils.Input

class Day2Input {
    companion object {
        val part1 = Input(
            """
            |Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green
            |Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue
            |Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red
            |Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red
            |Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green
            """.trimMargin(),
            8
        )

        val part2 = Input(
            """
            |Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green
            |Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue
            |Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red
            |Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red
            |Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green
            """.trimMargin(),
            2286
        )

        val chris1 = Input(d2c1, 2771)
        val chris2 = part2

        val martin1 = part1
        val martin2 = part2
    }
}