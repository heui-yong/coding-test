import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bfWriter = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readln().toInt()) {
        val str = readLine()
        var score = 0
        var result = 0

        for (i in str.indices) {
            if (str[i] == 'O') {
                score++
                result += score
            } else score = 0
        }
        bfWriter.write("$result\n")
    }

    bfWriter.flush()
    bfWriter.close()
    close()
}