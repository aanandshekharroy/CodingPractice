
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
    fun timeConversion(input: String): String {

//    if ()

        var hours = 0
        val inputWithoutAMPM = if(input.contains("PM")){
            hours+=12
            if(input.startsWith("12")){
                return input.removeSuffix("PM")
            }
            input.removeSuffix("PM")
        }else{
            if(input.startsWith("12")){
                hours+=12
            }
            input.removeSuffix("AM")
        }
//        hours %= 24
        val units = inputWithoutAMPM.split(":")
        val inputHours = units[0].toInt()
        val result = buildString {
            val finalHours = (inputHours+hours)%24
            if(finalHours<10){
                append("0$finalHours")
            }else{
                append(finalHours)
            }
            append(":")
            append(units[1])
            append(":")
            append(units[2])
        }
        return result
    }
    // Complete the utopianTree function below.
    fun utopianTree(n: Int): Int {
        var treeHeight = 1
        for( i in 1 until n+1){
            if(i%2==1){
                treeHeight*=2
            }else{
                treeHeight+=1
            }
        }
        return treeHeight
    }

    /*
    * Complete the gradingStudents function below.
    */
    fun gradingStudents(grades: Array<Int>): Array<Int> {
        /*
         * Write your code here.
         */
        val result = Array(grades.size) { i -> 0 }
        for (i in 0 until result.size){
            when {
                grades[i]<38 -> result[i] = grades[i]
                grades[i]%5>=3 -> result[i]=(grades[i]+(5-grades[i]%5))
                else -> result[i]=grades[i]
            }
        }
        return result

    }
    fun hurdleRace(k: Int, height: Array<Int>): Int{
        val maxHeight = height.max()
        if(k>= maxHeight!!){
            return 0
        }
        return maxHeight-k
    }


}