import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*
fun cavityMap(grid: Array<String>): Array<String> {
//println("start")
//    if(grid.size<=4){
//        return grid
//    }
//    println()
    val dimen = (grid.size.toDouble()).toInt()
    for(i in 1 until grid.size){
        val upIndex = i - dimen
        val leftIndex = i - 1
        val rightIndex = i + 1
        val downIndex = i + dimen
        if(upIndex>0&&downIndex<grid.size&&(i%dimen!=0)&&(i+1)%dimen!=0
                &&(grid[upIndex]!="X"&&grid[downIndex]!="X"&&grid[leftIndex]!="X"&&grid[rightIndex]!="X")){
            if(grid[upIndex].toInt()<grid[i].toInt()&&
                    grid[downIndex].toInt()<grid[i].toInt()&&
                    grid[leftIndex].toInt()<grid[i].toInt()&&
                    grid[rightIndex].toInt()<grid[i].toInt()){
                grid[i]="X"
            }
        }
    }
    println("printing")
    grid.forEach {
        print("printing: "+ it+"  ")
    }
    return grid
}



fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val grid = Array<String>(n, { "" })
    for (i in 0 until n) {
        val gridItem = scan.nextLine()
        grid[i] = gridItem
    }

    val result = cavityMap(grid)

    println(result.joinToString("\n"))
}
