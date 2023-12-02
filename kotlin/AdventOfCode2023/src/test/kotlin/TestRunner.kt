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
    println("Solution - 1: \t$solution1 \tin ${System.nanoTime() - start}ns")
    Assertions.assertEquals(input1.solution, solution1)

    start = System.nanoTime()
    val solution2 = day.solve2(
        inputReader.read(input2.value)
    )
    println("Solution - 2: \t$solution2 \tin ${System.nanoTime() - start}ns")
    Assertions.assertEquals(input2.solution, solution2)
}