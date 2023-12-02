package day2.chris

import utils.DayChris

class Day2Chris : DayChris<Int>(2) {
    private val parser = GameParser()

    override fun solve1(input: List<String>) =
        input.sumOf {
            val game = parser.parse(it)
            if (game.isValid()) game.number else 0
        }

    override fun solve2(input: List<String>): Int {
        return 0
    }
}