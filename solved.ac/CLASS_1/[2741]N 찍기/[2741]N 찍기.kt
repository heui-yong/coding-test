import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bfWriter = BufferedWriter(OutputStreamWriter(System.out))

    for (i in 1..readln().toInt()) {
        bfWriter.write("$i\n")
    }

    bfWriter.flush()
    bfWriter.close()
    close()
}