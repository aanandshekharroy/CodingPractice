import junitparams.JUnitParamsRunner
import junitparams.Parameters
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith


@RunWith(JUnitParamsRunner::class)
class HackerRankSolutionsTest {

    lateinit var mHackerRankSolutions: HackerRankSolutions
    @Before
    fun setUp() {
        mHackerRankSolutions = HackerRankSolutions()
    }

    @Test
    @Parameters(method = "getSomeIntArr")
    fun compareTriplets(a: Array<Int>, b: Array<Int> , score: Array<Int>) {
        assertEquals(score, mHackerRankSolutions.compareTriplets(a, b))
    }

    fun getSomeIntArr() = arrayOf(arrayOf(arrayOf(1,2), arrayOf(3,4), arrayOf(0,2)),
            arrayOf(arrayOf(3,2), arrayOf(3,4), arrayOf(0,1)),
            arrayOf(arrayOf(3,3), arrayOf(3,3), arrayOf(0,0)),
            arrayOf(arrayOf(), arrayOf(), arrayOf(0, 0)))

    @Test
    @Parameters(method = "dataForAVeryBigSum")
    fun aVeryBigSum(a: Array<Long>, sum:Long) {
        assertEquals(sum, mHackerRankSolutions.aVeryBigSum(a))
    }

    fun dataForAVeryBigSum() = arrayOf(arrayOf(arrayOf<Long>(1000000001, 1000000002, 1000000003, 1000000004, 1000000005),5000000015))

    @Test
    @Parameters(method = "datadiagonalDifference")
    fun diagonalDifference(arr: Array<Array<Int>>,diff: Int) {
        assertEquals(diff, mHackerRankSolutions.diagonalDifference(arr))
    }

    fun datadiagonalDifference() = arrayOf(
            arrayOf(arrayOf(arrayOf(11,2,4), arrayOf(4,5,6), arrayOf(10,8,-12)),15),
            arrayOf(arrayOf(arrayOf(11,2), arrayOf(4,5)),10),
            arrayOf(arrayOf(arrayOf(11)),0))

    @Test
    @Parameters(method = "dataPlusMinus")
    fun plusMinus(arr: Array<Int>, result: String) {
        assertEquals(result, mHackerRankSolutions.plusMinus(arr))
    }

    fun dataPlusMinus() = arrayOf(
            arrayOf(arrayOf(-4,3,-9,0,4,1),"0.500000 0.333333 0.166667")
    )

    @Test
    @Parameters(method = "dataAngryProfessor")
    fun angryProfessor(a: Array<Int>, k: Int, result: String) {
        assertEquals(result,mHackerRankSolutions.angryProfessor(k, a))
    }

    fun dataAngryProfessor() = arrayOf(
            arrayOf(arrayOf(-1, -3, 4, 2),3, "YES"),
            arrayOf(arrayOf(-1, -3, -1, 0),1, "NO"),
            arrayOf(arrayOf(0, 0, 0, 0),3, "NO"),
            arrayOf(arrayOf(-1, -3, 4, 2),3, "YES")
    )

    @Test
    @Parameters(method = "dataMiniMaxSum")
    fun miniMaxSum(arr: Array<Int>, sol: Array<Long>) {
        assertEquals(sol, mHackerRankSolutions.miniMaxSum(arr))
    }

    fun dataMiniMaxSum() = arrayOf(
            arrayOf(arrayOf(1, 2, 3, 4, 5), arrayOf(10, 14))
    )

    @Test
    @Parameters(method = "dataTimeConversion")
    fun timeConversion(input:String, result: String) {
        assertEquals(result, mHackerRankSolutions.timeConversion(input))
    }

    fun dataTimeConversion() = arrayOf(
            arrayOf("07:25:45PM","19:25:45"),
            arrayOf("12:00:00AM","00:00:00"),
            arrayOf("12:00:00PM","12:00:00")
    )

    @Test
    @Parameters(method = "dataUtopianTree")
    fun utopianTree(n: Int, result: Int) {
        assertEquals(result, mHackerRankSolutions.utopianTree(n))
    }

    fun dataUtopianTree() = arrayOf(
            arrayOf(0,1),
            arrayOf(1,2),
            arrayOf(4,7)
    )

}