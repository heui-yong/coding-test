//처음 제출 코드 -> 116ms
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bfWriter = BufferedWriter(OutputStreamWriter(System.out))
    val numList = mutableListOf<Int>()

    for (i in 0..9) {
        numList.add(
            readLine().toInt()%42
        )
    }

    bfWriter.write("${numList.distinct().size}")

    bfWriter.flush()
    bfWriter.close()
    close()
}

//set 사용한 코드 -> 88ms
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bfWriter = BufferedWriter(OutputStreamWriter(System.out))
    val numList = mutableSetOf<Int>()

    for (i in 0..9) {
        numList.add(
            readLine().toInt()%42
        )
    }

    bfWriter.write("${numList.size}")

    bfWriter.flush()
    bfWriter.close()
    close()
}