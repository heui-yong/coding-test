import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bfWriter = BufferedWriter(OutputStreamWriter(System.out))
    val st = StringTokenizer(readLine())

    val num1 = st.nextToken().toInt()
    val num2 = st.nextToken().toInt()

    bfWriter.write("${num1+num2}\n")
    bfWriter.write("${num1-num2}\n")
    bfWriter.write("${num1*num2}\n")
    bfWriter.write("${num1/num2}\n")
    bfWriter.write("${num1%num2}\n")

    bfWriter.flush()
    bfWriter.close()
    close()
}