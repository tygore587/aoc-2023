package day2.chris

import utils.DayChris

class Day2Chris : DayChris<Int>(2) {
    private val parser = GameParser()

    override fun solve1(input: List<String>) =
        input.sumOf {
            val game = parser.parse(it)
            if (game.isValid()) game.number else 0
        }

    override fun solve2(input: List<String>) =
        input.sumOf { line ->
            val cubeCounts = parser.parse(line).pulls
                .flatMap { it.cubes }
                .groupBy { it.color }

            (cubeCounts[GameParser.Color.red]?.maxOf { it.number } ?: 0) *
                    (cubeCounts[GameParser.Color.blue]?.maxOf { it.number } ?: 0) *
                    (cubeCounts[GameParser.Color.green]?.maxOf { it.number } ?: 0)
        }
}