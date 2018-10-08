
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
}