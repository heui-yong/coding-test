import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bfWriter = BufferedWriter(OutputStreamWriter(System.out))
    val num = readLine().toInt()
    val st = StringTokenizer(readLine())
    val score = mutableListOf<Double>()

    repeat(num) {
        score.add(st.nextToken().toDouble())
    }

    val M = score.maxOrNull() ?: 0

    for (i in 0 until  num) {
        score[i] = (score[i] / M.toDouble()) * 100
    }

    bfWriter.write("${score.sum()/num}")

    bfWriter.flush()
    bfWriter.close()
    close()
}