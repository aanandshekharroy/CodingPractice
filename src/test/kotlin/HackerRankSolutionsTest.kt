import junitparams.JUnitParamsRunner
import junitparams.Parameters
import org.hamcrest.core.Is.`is`
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith

@RunWith(JUnitParamsRunner::class)
class HackerRankSolutionsTest {

    lateinit var hackerRankSolutions: HackerRankSolutions
    @Before
    fun setUp() {
        hackerRankSolutions = HackerRankSolutions()
    }

    @Test
    @Parameters(method = "getSomeIntArr")
    fun compareTriplets(a: Array<Int>, b: Array<Int> , score: Array<Int>) {
        assertEquals(score, hackerRankSolutions.compareTriplets(a, b))
    }

    fun getSomeIntArr() = arrayOf(arrayOf(arrayOf(1,2), arrayOf(3,4), arrayOf(0,2)),
            arrayOf(arrayOf(3,2), arrayOf(3,4), arrayOf(0,1)),
            arrayOf(arrayOf(3,3), arrayOf(3,3), arrayOf(0,0)),
            arrayOf(arrayOf(), arrayOf(), arrayOf(0, 0)))

    @Test
    @Parameters(method = "dataForAVeryBigSum")
    fun aVeryBigSum(a: Array<Long>, sum:Long) {
        assertEquals(sum, hackerRankSolutions.aVeryBigSum(a))
    }

    fun dataForAVeryBigSum() = arrayOf(arrayOf(arrayOf<Long>(1000000001, 1000000002, 1000000003, 1000000004, 1000000005),5000000015))

    @Test
    @Parameters(method = "datadiagonalDifference")
    fun diagonalDifference(arr: Array<Array<Int>>,diff: Int) {
        assertEquals(diff, hackerRankSolutions.diagonalDifference(arr))
    }

    fun datadiagonalDifference() = arrayOf(
            arrayOf(arrayOf(arrayOf(11,2,4), arrayOf(4,5,6), arrayOf(10,8,-12)),15),
            arrayOf(arrayOf(arrayOf(11,2), arrayOf(4,5)),10),
            arrayOf(arrayOf(arrayOf(11)),0))
}