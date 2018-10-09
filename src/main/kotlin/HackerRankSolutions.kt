
class HackerRankSolutions {
    fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
        var aScore = 0
        var bScore = 0
        for(i in 0 until a.size){
            if(a[i]<b[i]){
                bScore++
            }else if(a[i]>b[i]){
                aScore++
            }
        }
        return arrayOf(aScore, bScore)

    }

    // Complete the aVeryBigSum function below.
    fun aVeryBigSum(ar: Array<Long>) = ar.sum()

    fun diagonalDifference(arr: Array<Array<Int>>): Int {
        var leftDiagonalSum = 0
        var rightDiagonalSum = 0
        for(i in 0 until arr.size){
            val rightDiagonalIndex = arr.size-1-i
            leftDiagonalSum += arr[i][i]
            rightDiagonalSum += arr[i][rightDiagonalIndex]
        }
        return Math.abs(leftDiagonalSum - rightDiagonalSum)

    }

    // Complete the plusMinus function below.
    fun plusMinus(arr: Array<Int>){
        var positives = 0
        var negatives = 0
        var zeroes = 0
        arr.forEach {
            when{
                it > 0 -> positives++
                it < 0 -> negatives++
                it == 0 -> zeroes++
            }
        }
        println("${positives.toFloat()/arr.size}\n${negatives.toFloat()/arr.size}\n${zeroes.toFloat()/arr.size}")
    }

    fun staircase(n: Int) {
        for(i in 0 until n){
            val spaces = buildString {
                for( j in 0 until  (n-i-1)){
                     append(" ")
                }
            }
            val stars = buildString {
                append(spaces)
                for(k in 0 until (i+1)){
                    append("#")
                }
            }
            println(stars)
        }
    }

    // Complete the angryProfessor function below.
    fun angryProfessor(k: Int, a: Array<Int>): String {
        var arrivedOnTime = 0
        a.forEach {
            when{
                it<=0 -> arrivedOnTime++
            }
        }
        return if(arrivedOnTime>=k){
            "NO"
        }else{
            "YES"
        }
    }

    fun miniMaxSum(arr: Array<Int>) {
        val total:Long = arr.sum().toLong()
        var minSum:Long = total
        var maxSum:Long = -1
        arr.forEach{
            val sumExceptThis = total - it
            if(sumExceptThis>maxSum){
                maxSum = sumExceptThis
            }
            if(sumExceptThis<minSum){
                minSum = sumExceptThis
            }
        }
        println("$minSum $maxSum")
//        return arrayOf(minSum, maxSum)

    }

}