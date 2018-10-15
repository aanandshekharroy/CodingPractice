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

    @Test
    @Parameters(method = "datagradingStudents")
    fun gradingStudents(grades: Array<Int>, result: Array<Int>) {
        assertEquals(result, mHackerRankSolutions.gradingStudents(grades))
    }

    fun datagradingStudents() = arrayOf(
            arrayOf(arrayOf(73,67,38,33),arrayOf(75,67,40,33)),
            arrayOf(arrayOf(75,37,41,49),arrayOf(75,37,41,50))
    )

    @Test
    @Parameters(method = "dataCountingValleys")
    fun countingValleys(n: Int, hike: String, count: Int) {
        assertEquals(count, mHackerRankSolutions.countingValleys(n, hike))
    }

    fun dataCountingValleys() = arrayOf(
            arrayOf(8, "UDDDUDUU", 1),
            arrayOf(8, "UUDDDDUU", 1)
    )

    @Test
    @Parameters(method = "dataDesignerPdfViewer")
    fun countingDesignerPdfViewer(h: Array<Int>, word: String, area: Int) {
        assertEquals(area, mHackerRankSolutions.designerPdfViewer(h, word))
    }

    fun dataDesignerPdfViewer() = arrayOf(
            arrayOf(arrayOf(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7), "abc", 9),
            arrayOf(arrayOf(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7), "zaba", 28)
    )

    @Test
    @Parameters(method = "dataFindDigits")
    fun findDigits(n: Int, result: Int) {
        assertEquals(result, mHackerRankSolutions.findDigits(n))
    }

    fun dataFindDigits() = arrayOf(
            arrayOf(12,2),
            arrayOf(1012, 3)
    )

    @Test
    @Parameters(method = "datapermutationEquation")
    fun permutationEquation(p: Array<Int>, result: Array<Int>) {
        assertEquals(result, mHackerRankSolutions.permutationEquation(p))
    }

    fun datapermutationEquation() = arrayOf(
            arrayOf(arrayOf(4,3,5,1,2),arrayOf(1,3,5,4,2))
    )

    @Test
    @Parameters(method = "datacutTheSticks")
    fun cutTheSticks(input: Array<Int>, result: Array<Int>) {
        assertEquals(result, mHackerRankSolutions.cutTheSticks(input))
    }

    fun datacutTheSticks() = arrayOf(
            arrayOf(arrayOf(1,2,3,4,3,3,2,1),arrayOf(8,6,4,1))
    )



}