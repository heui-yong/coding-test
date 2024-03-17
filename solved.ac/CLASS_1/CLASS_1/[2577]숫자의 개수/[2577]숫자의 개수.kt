import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bfWriter = BufferedWriter(OutputStreamWriter(System.out))

    var result = 1
    val num = IntArray(10)

    for (i in 1..3) {
        result *= readLine().toInt()
    }

    while (result > 0) {
        num[result%10]++
        result /= 10
    }

    num.forEach {
        bfWriter.write("$it\n")
    }

    bfWriter.flush()
    bfWriter.close()
    close()
}