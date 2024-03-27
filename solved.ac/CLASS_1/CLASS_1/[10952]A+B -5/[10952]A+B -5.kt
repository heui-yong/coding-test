import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bfWriter = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val st = StringTokenizer(readLine())
        val A = st.nextToken().toInt()
        val B = st.nextToken().toInt()

        if (A==0 && B==0) break
        bfWriter.write("${A+B}\n")
    }

    bfWriter.flush()
    bfWriter.close()
    close()
}