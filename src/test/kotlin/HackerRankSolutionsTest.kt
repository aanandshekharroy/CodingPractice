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

    @Test
    @Parameters(method = "dataBeautifulTriplets")
    fun beautifulTriplets(d: Int, arr: Array<Int>, result: Int) {
        assertEquals(result, mHackerRankSolutions.beautifulTriplets(d,arr))
    }

    fun dataBeautifulTriplets() = arrayOf(
            arrayOf(1,arrayOf(2,2,3,4,5),3)
    )

    @Test
    @Parameters(method = "dataTaumBday")
    fun taumBday(b: Long, w:Long, bc: Long, wc:Long, z: Long, result: Long) {
        assertEquals(result, mHackerRankSolutions.taumBday(b,w,bc,wc,z))
    }

    fun dataTaumBday() = arrayOf(
            arrayOf(27984,1402,619246,615589,247954, 18192035842),
            arrayOf(5,9,2,3,4,37),
            arrayOf(3,6,9,1,1,12),
            arrayOf(3,3,1,9,2,12),
            arrayOf(7,7,4,2,1,35),
            arrayOf(860,605,274229, 795307, 2153,403048050),
            arrayOf(657,327,861981,46769,513320,383271936),
            arrayOf(384 ,887,2778,6916,7794, 7201244),
            arrayOf(27984,1402,619246,615589,247954, 18192035842)
    )

    @Test
    @Parameters(method = "dataKangaroo")
    fun kangaroo(x1:Int, v1:Int, x2:Int, v2:Int, result: String) {
        assertEquals(result, mHackerRankSolutions.kangaroo(x1,v1,x2,v2))
    }

    fun dataKangaroo() = arrayOf(
            arrayOf(0,2,5,3,"NO"),
            arrayOf(0,3,4,2,"YES")
    )

    @Test
    @Parameters(method = "dataPickingNumber")
    fun pickingNumber(a: Array<Int>, result: Int) {
        assertEquals(result, mHackerRankSolutions.pickingNumbers(a))
    }

    fun dataPickingNumber() = arrayOf(
            arrayOf(arrayOf(1,2,2,3,1,2),5),
            arrayOf(arrayOf(4,6,5,3,3,1),3)
    )

    @Test
    @Parameters(method = "dataRepeatedString")
    fun repeatedString(s: String, n: Long, result: Long) {
        assertEquals(result, mHackerRankSolutions.repeatedString(s,n))
    }

    fun dataRepeatedString() = arrayOf(
            arrayOf("a",10,10),
            arrayOf("aba", 10 ,7),
            arrayOf("a",1000000000000,1000000000000)
    )

    @Test
    @Parameters(method = "dataMinimumDistances")
    fun minimumDistances(a: Array<Int>, result: Int) {
        assertEquals(result, mHackerRankSolutions.minimumDistances(a))
    }
    fun dataMinimumDistances() = arrayOf(
            arrayOf(arrayOf(7,1,3,4,1,7),3)
    )

    @Test
    @Parameters(method = "dataChocolateFeast")
    fun chocolateFeast(n: Int, c: Int, m: Int, result: Int) {
        assertEquals(result, mHackerRankSolutions.chocolateFeast(n,c,m))
    }

    fun dataChocolateFeast() = arrayOf(
            arrayOf(10,2,5,6),
            arrayOf(12,4,4,3),
            arrayOf(6,2,2,5)
    )

    @Test
    @Parameters(method = "dataServiceLane")
    fun serviceLane(n: Int, cases: Array<Array<Int>>, result: Array<Int>, width: Array<Int> ) {
        assertEquals(result, mHackerRankSolutions.serviceLane(n, cases,width))
    }
    fun dataServiceLane() = arrayOf(
            arrayOf(8, arrayOf(arrayOf(0,3),arrayOf(4,6),arrayOf(6,7), arrayOf(3,5),arrayOf(0,7)), arrayOf(1,2,3,2,1),arrayOf(2 ,3 ,1 ,2, 3, 2, 3, 3))
    )

    @Test
    @Parameters(method = "dataHowManyGames")
    fun howManyGames(p:Int, d: Int, m: Int, s: Int, result: Int) {
        assertEquals(result, mHackerRankSolutions.howManyGames(p,d,m,s))
    }
    fun dataHowManyGames() = arrayOf(
            arrayOf(20,3,6,85,7),
            arrayOf(20,3,6,80,6),
            arrayOf(16 ,2, 1, 9981,9917)
    )
    @Test
    @Parameters(method = "dataTimeInWords")
    fun timeInWords(h: Int, m: Int, result: String){

        assertEquals(result, mHackerRankSolutions.timeInWords(h,m))
    }

    fun dataTimeInWords() = arrayOf(
            arrayOf(7,15,"quarter past seven"),
            arrayOf(3,0,"three o' clock"),
            arrayOf(5,28,"twenty eight minutes past five"),
            arrayOf(5,30,"half past five"),
            arrayOf(5, 47, "thirteen minutes to six"),
            arrayOf(1,1,"one minute past one")

    )

    @Test
    @Parameters(method = "dataEqualizeArray")
    fun equalizeArray(arr: Array<Int>, result: Int){
        assertEquals(result, mHackerRankSolutions.equalizeArray(arr))
    }
    fun dataEqualizeArray() = arrayOf(
            arrayOf(arrayOf(3,3,2,1,3),2)
    )

    @Test
    @Parameters(method = "dataHappyLadyBugs")
    fun happyLadybugs(b: String, result: String){
        assertEquals(result,mHackerRankSolutions.happyLadybugs(b))
    }

    fun dataHappyLadyBugs() = arrayOf(
            arrayOf("RBY_YBR","YES"),
            arrayOf("X_Y__X","NO"),
            arrayOf("__","YES"),
            arrayOf("B_RRBR","YES"),
            arrayOf("_R","NO"),
            arrayOf("R_YR","NO"),
            arrayOf("RRY","NO"),
            arrayOf("BBB_","YES"),
            arrayOf("BBB","YES"),
            arrayOf("_","YES"),
            arrayOf("RBRB","NO"),
            arrayOf("G","NO"),
            arrayOf("GR","NO")
    )

    @Test
    @Parameters(method = "dataBreakingRecords")
    fun breakingRecords(scores: Array<Int>, result: Array<Int>){
        assertEquals(result, mHackerRankSolutions.breakingRecords(scores))
    }

    fun dataBreakingRecords() = arrayOf(
            arrayOf(arrayOf(3, 4, 21, 36, 10, 28, 35, 5, 24, 42), arrayOf(4,0))
    )

    @Test
    @Parameters(method = "dataBirthday")
    fun birthday(s: Array<Int>, d: Int, m: Int, result: Int){
//        assertEquals(result , mHackerRankSolutions.birthday(s,d,m))
    }
    fun dataBirthday() = arrayOf(
            arrayOf( arrayOf(1,1,1,1,1,1), 3, 2, 0),
            arrayOf(arrayOf(4),4,1,1),
            arrayOf(arrayOf(1,2,1,3,2),3,2,2)
    )

    @Test
    @Parameters(method = "dataSockMerchant")
    fun sockMerchant(arr: Array<Int>, result: Int){
        assertEquals(result, mHackerRankSolutions.sockMerchant(arr.size, arr))
    }

    fun dataSockMerchant() = arrayOf(
            arrayOf(arrayOf(1 ,1 ,3 ,1 ,2 ,1 ,3 ,3 ,3 ,3 ),4)
    )

}