import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bfWriter = BufferedWriter(OutputStreamWriter(System.out))
    val num = readLine().toInt()
    val st = StringTokenizer(readLine())
    var max = Integer.MIN_VALUE
    var min = Integer.MAX_VALUE

    for (i in 1..num) {
        val input = st.nextToken().toInt()

        min = min.coerceAtMost(input)
        max = max.coerceAtLeast(input)
    }

    bfWriter.write("$min $max")

    bfWriter.flush()
    bfWriter.close()
    close()
}