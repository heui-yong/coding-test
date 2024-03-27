import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bfWriter = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(readLine())

    val N = st.nextToken().toInt()
    val X = st.nextToken().toInt()

    val num = readLine()
        .split(" ")
        .filter {
            it.toInt() < X
        }

    num.forEach { n ->
        bfWriter.write("$n ")
    }

    bfWriter.flush()
    bfWriter.close()
    close()
}