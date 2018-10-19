import java.util.*

// Complete the serviceLane function below.
fun serviceLane(n: Int, cases: Array<Array<Int>>, width: Array<Int>): Array<Int> {


return arrayOf(1)}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nt = scan.nextLine().split(" ")

    val n = nt[0].trim().toInt()

    val t = nt[1].trim().toInt()

    val width = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val cases = Array<Array<Int>>(t, { Array<Int>(2, { 0 }) })

    for (i in 0 until t) {
        cases[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }

    val result = serviceLane(n, cases, width)

    println(result.joinToString("\n"))
}
