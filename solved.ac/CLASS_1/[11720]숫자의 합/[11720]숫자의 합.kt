import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bfWriter = BufferedWriter(OutputStreamWriter(System.out))
    val num = readLine().toInt()
    val st = StringTokenizer(readLine())

    bfWriter.write("${
        st.nextToken().toCharArray()
            .map { c ->  c.toString().toInt()}
            .reduce { acc, i -> acc + i }
    }")

    bfWriter.flush()
    bfWriter.close()
    close()
}