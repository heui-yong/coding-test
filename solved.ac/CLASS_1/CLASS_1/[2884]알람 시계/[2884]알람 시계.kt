import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bfWriter = BufferedWriter(OutputStreamWriter(System.out))
    val year = readln().toInt()
    if (year%4==0 && (year%100!=0 || year%400==0)) {
        bfWriter.write("1")
    } else bfWriter.write("0")

    bfWriter.flush()
    bfWriter.close()
    close()
}