import org.junit.jupiter.api.Assertions
import utils.BaseDay
import utils.Input
import utils.InputReader

private val inputReader = InputReader()
fun execute(
    day: BaseDay<*>,
    input1: Input<*>,
    input2: Input<*>,
) {
    var start = System.nanoTime()
    val solution1 = day.solve1(
        inputReader.read(input1.value)
    )
    println("Solution - 1: $solution1 in ${System.nanoTime() - start}")
    Assertions.assertEquals(solution1, input1.solution)

    start = System.nanoTime()
    val solution2 = day.solve2(
        inputReader.read(input2.value)
    )
    println("Solution - 2: $solution2 in ${System.nanoTime() - start}")
    Assertions.assertEquals(solution2, input2.solution)
}