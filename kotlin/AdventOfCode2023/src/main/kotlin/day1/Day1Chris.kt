package day1

import utils.DayChris

class Day1Chris : DayChris<List<String>, Int>(1) {
    override fun solve(input: List<String>): Int {
        var sum = 0
        for (line in input) {
            val first = line.find { it.isDigit() }
            val last = line.findLast { it.isDigit() }
            val lineValue = "$first$last".toIntOrNull() ?: 0
            sum += lineValue.also { println("lineValue: $it") }
        }
        return sum
    }
}