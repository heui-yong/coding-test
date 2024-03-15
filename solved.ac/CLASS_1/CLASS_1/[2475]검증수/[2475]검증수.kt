// 수정 전 코드
import java.io.*
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bfWriter = BufferedWriter(OutputStreamWriter(System.out))
    var sum = 0

    val numList = readLine().trim().split(" ").toList()

    numList.forEach {
        val num = it.toInt()
        sum += num*num
    }

    bfWriter.write("${sum%10}")

    bfWriter.flush()
    bfWriter.close()
    close()
}

//수정 후 코드
import java.io.*
import kotlin.math.pow

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    println(
        readLine()
            .split(" ")
            .map { it.toDouble().pow(2) }
            .reduce { acc, d -> acc + d}.toInt()%10
    )
}