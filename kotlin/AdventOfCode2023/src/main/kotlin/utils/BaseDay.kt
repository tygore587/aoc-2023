package utils

abstract class BaseDay<S>(
    day: Int,
    name: String,
) {
    init {
        println(
            """"
            |=========================
            |      $name Day $day
            |=========================
            """.trimMargin()
        )
    }

    abstract fun solve1(input: List<String>): S
    abstract fun solve2(input: List<String>): S
}

abstract class DayChris<S>(day: Int) : BaseDay<S>(day, "Chris")
abstract class DayMartin<S>(day: Int) : BaseDay<S>(day, "Martin")