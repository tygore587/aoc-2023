package day2.chris

class GameParser {
    data class Game(val number: Int, val pulls: List<Pull>) {
        fun isValid() = pulls.all { it.isValid() }
    }

    data class Pull(val cubes: List<Cubes>) {
        fun isValid() = cubes.all { it.isValid() }
    }

    data class Cubes(val number: Int, val color: Color) {
        fun isValid() = number <= color.max
    }

    enum class Color(val max: Int) { red(12), green(13), blue(14) }

    fun parse(line: String) =
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
        Pull(
            round.trim()
                .split(",")
                .map { getPull(it.trim()) }
        )

    private fun getPull(pull: String) =
        pull.trim()
            .split(" ", limit = 2)
            .let {
                Cubes(
                    it[0].toInt(),
                    Color.valueOf(it[1])
                )
            }
}