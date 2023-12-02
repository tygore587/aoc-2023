package day1.chris

import utils.DayChris

class Day1Chris : DayChris<Int>(1) {
    override fun solve1(input: List<String>) =
        input.sumLines(::findFirstDigit, ::findLastDigit)

    override fun solve2(input: List<String>) =
        input.sumLines(::findFirstNumber, ::findLastNumber)

    private fun List<String>.sumLines(
        first: (String) -> Int,
        last: (String) -> Int
    ) = this.sumOf { toLineValue(first(it), last(it)) }

    private fun toLineValue(first: Int, last: Int) =
        "$first$last".toIntOrNull() ?: 0

    private fun findFirstDigit(line: String) =
        line.find { it.isDigit() }?.digitToInt() ?: 0

    private fun findLastDigit(line: String) =
        line.findLast { it.isDigit() }?.digitToInt() ?: 0

    private fun findFirstNumber(line: String) =
        findIn(line, numbers)

    private fun findLastNumber(line: String) =
        findIn(line.reversed(), numbersReversed)

    private fun findIn(line: String, numbers: Map<String, Int>): Int {
        val firstIndex = line.indexOfFirst { it.isDigit() }

        var num = ""
        var index = 0
        do {
            num += line[index]
            val numberMatch = numbers.keys.firstOrNull { it.startsWith(num) }
            if (numberMatch != null) {
                numbers[num]?.also {
                    return@findIn it
                }
            } else {
                // when matched a wrong number, reset match - only when matching in reversed order
                // fiven (match start with fiVEN from seVEN but should match FIVEen)
                index -= num.length - 2
                num = line[index].toString()
            }
            index += 1
        } while (firstIndex < 0 || index <= firstIndex)

        return line[firstIndex].digitToInt()
    }

    private val numbers = mapOf(
        "zero" to 0,
        "one" to 1,
        "two" to 2,
        "three" to 3,
        "four" to 4,
        "five" to 5,
        "six" to 6,
        "seven" to 7,
        "eight" to 8,
        "nine" to 9,
    )

    private val numbersReversed = mapOf(
        "orez" to 0,
        "eno" to 1,
        "owt" to 2,
        "eerht" to 3,
        "ruof" to 4,
        "evif" to 5,
        "xis" to 6,
        "neves" to 7,
        "thgie" to 8,
        "enin" to 9,
    )
}