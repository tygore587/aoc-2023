package day1

import utils.DayChris

class Day1Chris : DayChris<Int>(1) {

    override fun solve1(input: List<String>): Int {
        var sum = 0
        for (line in input) {
            val first = line.find { it.isDigit() }
            val last = line.findLast { it.isDigit() }
            val lineValue = "$first$last".toIntOrNull() ?: 0
            sum += lineValue
        }
        return sum
    }

    override fun solve2(input: List<String>): Int {
        var sum = 0
        for (line in input) {
            val first = findFirstNumber(line)
            val last = findLastNumber(line)
            val lineValue = "$first$last".toIntOrNull() ?: 0
            sum += lineValue
        }
        return sum
    }

    private fun findFirstNumber(line: String) = findIn(line, numbers)
    private fun findLastNumber(line: String) = findIn(line.reversed(), numbersReversed)

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