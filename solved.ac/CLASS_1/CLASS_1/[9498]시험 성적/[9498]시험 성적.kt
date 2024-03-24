import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bfWriter = BufferedWriter(OutputStreamWriter(System.out))

    when (readln().toInt()) {
        in 90..100 -> bfWriter.write("A")
        in 80..89 -> bfWriter.write("B")
        in 70..79 -> bfWriter.write("C")
        in 60..69 -> bfWriter.write("D")
        else -> bfWriter.write("F")
    }

    bfWriter.flush()
    bfWriter.close()
    close()
}