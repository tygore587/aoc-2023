package day2.chris

import utils.DayChris

class Day2Chris : DayChris<Int>(2) {
    data class Game(val number: Int, val rounds: List<Round>) {
        fun isValid() = rounds.all { it.isValid() }
    }

    data class Round(val pull: List<Pull>) {
        fun isValid() = pull.all { it.isValid() }
    }

    data class Pull(val number: Int, val color: Color) {
        fun isValid() = number <= color.max
    }

    enum class Color(val max: Int) { red(12), green(13), blue(14) }

    override fun solve1(input: List<String>) =
        input.sumOf {
            val game = getGameFromLine(it)
            if (game.isValid()) game.number else 0
        }

    private fun getGameFromLine(line: String) =
        line.split(":", limit = 2)
            .let {
                Game(
                    getGameNumber(it[0]),
                    it[1].split(";").map { round -> getRound(round) }
                )
            }

    private fun getGameNumber(game: String) =
        game.trim()
            .removePrefix("Game")
            .trim()
            .toInt()

    private fun getRound(round: String) =
        Round(
            round.trim()
                .split(",")
                .map { getPull(it.trim()) }
        )

    private fun getPull(pull: String) =
        pull.trim()
            .split(" ", limit = 2)
            .let {
                Pull(
                    it[0].toInt(),
                    Color.valueOf(it[1])
                )
            }

    override fun solve2(input: List<String>): Int {
        return 0
    }
}