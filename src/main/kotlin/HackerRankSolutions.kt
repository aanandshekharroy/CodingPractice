import com.sun.scenario.effect.impl.prism.PrRenderInfo

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

    // Complete the countingValleys function below.
    fun countingValleys(n: Int, s: String): Int {
        var altitude = 0
        var countOfValleys = 0
        s.forEach {
            when(it){
                'U' ->{
                    altitude++
                    if(altitude==0){
                        countOfValleys++
                    }
                }
                'D' ->{
                    altitude--
                }
            }
        }
        return countOfValleys
    }

    // Complete the designerPdfViewer function below.
    fun designerPdfViewer(h: Array<Int>, word: String): Int {
        var max = -1
        word.forEach {
            if(max<(h[it-'a'])){
                max = h[it-'a']
            }
        }
        return max*word.length

    }

    fun findDigits(n: Int): Int {

        val charArr = n.toString().toCharArray()
        var countOfDivisors = 0
        charArr.forEach {
           if(it!='0'){
               if(n%(it-'0')==0){
                   countOfDivisors++
               }
           }
        }
        return countOfDivisors
    }
    // Complete the permutationEquation function below.
    fun permutationEquation(p: Array<Int>): Array<Int> {
        val set = mutableSetOf<Int>()
        val result = mutableListOf<Int>()
        p.forEach {
            set.add(it)
        }
        for( i in 0 until p.size){
            if(set.contains(p[p[i]-1])){
                result.add(i+1)
            }
        }
        return result.toTypedArray()
    }
    // Complete the cutTheSticks function below.
    fun cutTheSticks(arr: Array<Int>): Array<Int> {
        arr.sort()
        arr.forEach {

        }
        var sticks = mutableListOf<Int>()
        val result = mutableListOf<Int>()
        arr.forEach {
            sticks.add(it)
        }
        while (sticks.size>0){
            result.add(sticks.size)

            val minLength = sticks.min()?:0
            sticks = sticks.map {
                it - minLength
            }.toMutableList()
            sticks.removeIf {
                it==0
            }

        }
        return result.toTypedArray()
    }

    // Complete the viralAdvertising function below.
    fun viralAdvertising(n: Int): Int {

        val shared = Array(n+1){0}
        val liked = Array(n+1){0}
        val cLikes = Array(n+1){0}
        shared[1] = 5
        liked[1] = 2
        cLikes[1]=2
        for(i in 2 until n+1){
            shared[i] = 3*(liked[i-1])
            liked[i] = shared[i]/2
        }

        for(i in 2 until n+1){
            cLikes[i]=cLikes[i-1]+liked[i]
        }
         return cLikes[n]
    }

    // Complete the beautifulTriplets function below.
    /*given i,j,k such that i<j<k
    *a[j]-a[i]=a[k]-a[j]=d
    * 2a[j]=a[k]+a[i]=d
    * a[j]=d/2, a[i]+a[k]=d
    *
    * */
    fun beautifulTriplets(d: Int, a: Array<Int>): Int {
        var i=0
        var j= 1
        var k = 2
        var result= 0
        if(a.size<3){
            return 0
        }
        while (true){
            when {
                a[j]-a[i]>d -> i++
                a[j]-a[i]<d -> j++
                else -> when {
                    a[k]-a[j]>d -> j++
                    a[k]-a[j]<d -> k++
                    else ->{

                        result++
                        i++
                    }
                }
            }
            if(i==j){
                j++
            }
            if(j==k){
                k++
            }
            if(i==a.size||j==a.size||k==a.size){
                break
            }
        }
        return result
    }

    // Complete the taumBday function below.
    fun taumBday(b: Long, w: Long, bc: Long, wc: Long, z: Long): Long {
        val isBToWFeasible = bc>(wc+z)
        val isWToBFeasible = wc>(bc+z)
        if(!isBToWFeasible&&!isWToBFeasible){
            return b*bc+w*wc
        }
        return if(isBToWFeasible){
            w*wc+(b*(wc+z))
        }else{
            b*bc+(w*(bc+z))
        }
    }


    // Complete the reverseArray function below.
    fun reverseArray(a: Array<Int>): Array<Int> {
        return a.reversedArray()

    }

    // Complete the kangaroo function below.
    fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int):String{
        val x1_x2= x1-x2
        val v2_v1 = v2-v1
        return if((x1_x2<0&&v2_v1<0)||(x1_x2>0&&v2_v1>0)){
            if(x1_x2%v2_v1==0){
                "YES"
            }else{
                "NO"}
        }else{
            "NO"
        }
    }
    fun pickingNumbers(a: Array<Int>): Int {
        // Write your code here
        a.sort()
//        a.forEach {
//            println(it)
//        }
        var maxSubsequent = 1
        var i =0
        var j = 1
        while (i<a.size&&j<a.size){
//            println("a[$i] = ${a[i]}, a[$j] = ${a[j]}, max = $maxSubsequent")
            if(a[j]-a[i]<=1){
                if(maxSubsequent<(j-i+1)){
                    maxSubsequent = j-i+1
                }
                j++
            }else{
                i++
            }
            if(i==j){
                j++
            }
        }

        return maxSubsequent
    }

    // Complete the repeatedString function below.
    fun repeatedString(s: String, n: Long): Long {

        val countOfAInS  = s.count {
            it=='a'
        }
        val multiples = n/s.length
        val remainder = n%(s.length)

        return (multiples*countOfAInS)+(s.substring(0, remainder.toInt()).count {
            it=='a'
        })
    }

    // Complete the minimumDistances function below.
    fun minimumDistances(a: Array<Int>): Int {
        var minDis = a.size + 1
        val map = mutableMapOf<Int, Int>()
        for(i in 0 until a.size){
            if(!map.contains(a[i])){
                map[a[i]] = i
            }else{
                map[a[i]]?.let {
                    if(i - it<minDis){
                        minDis = i - it
                    }
                    map[a[i]] = i
                }
            }
        }
        if(minDis==a.size+1){
            return -1
        }
        return minDis
    }

    // Complete the chocolateFeast function below.
    fun chocolateFeast(n: Int, c: Int, m: Int): Int {
        val chocolatesByMoney = n/c
        var wrappers = chocolatesByMoney
        var totalChocolate = chocolatesByMoney
        while (wrappers/m>=1){
            totalChocolate+=(wrappers/m)
            val remainder = wrappers%m
            wrappers /= m
            wrappers+=remainder
        }
        return totalChocolate
    }

}