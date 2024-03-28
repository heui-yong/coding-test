import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bfWriter = BufferedWriter(OutputStreamWriter(System.out))
    var str: String?

    while (readLine().also {str = it} != null) {
        val st = StringTokenizer(str)
        bfWriter.write("${st.nextToken().toInt()+st.nextToken().toInt()}\n")
    }

    bfWriter.flush()
    bfWriter.close()
    close()
}