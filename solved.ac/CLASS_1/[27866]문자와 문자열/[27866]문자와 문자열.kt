import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bfWriter = BufferedWriter(OutputStreamWriter(System.out))
    val str = readLine()
    val num = readLine().toInt()

    bfWriter.write("${str[num-1]}")

    bfWriter.flush()
    bfWriter.close()
    close()
}