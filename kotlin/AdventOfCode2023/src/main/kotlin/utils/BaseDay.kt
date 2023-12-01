package utils

abstract class BaseDay<I, S>(
    day: Int,
    name: String,
) {
    init {
        println(
            """"
        |=========================
        |    $name Day $day\n
        |=========================
        """.trimMargin()
        )
    }

    abstract fun solve(input: I): S
}

abstract class DayChris<I, S>(day: Int) : BaseDay<I, S>(day, "Chris")
abstract class DayMartin<I, S>(day: Int) : BaseDay<I, S>(day, "Martin")