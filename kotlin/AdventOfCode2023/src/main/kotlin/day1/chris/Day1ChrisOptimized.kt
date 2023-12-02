package day1.chris

import utils.DayChris

class Day1ChrisOptimized : DayChris<Int>(1) {
    override fun solve1(input: List<String>) =
        input.sumOf { lineValue(it) }

    override fun solve2(input: List<String>) =
        input.sumOf { lineValue(replaceValues(it)) }

    private fun replaceValues(line: String): String {
        var resultLine = line
        for ((r, p) in numbersReplace) {
            resultLine = resultLine.replace(r, p)
        }
        return resultLine
    }

    private fun lineValue(line: String): Int {
        val first = line.find { it.isDigit() }
        val last = line.findLast { it.isDigit() }
        return "$first$last".toIntOrNull() ?: 0
    }

    private val numbersReplace = mapOf(
        "zero" to "z0o",
        "one" to "o1e",
        "two" to "t2o",
        "three" to "t3e",
        "four" to "f4r",
        "five" to "f5e",
        "six" to "s6x",
        "seven" to "s7n",
        "eight" to "e8t",
        "nine" to "n9e",
    )
}