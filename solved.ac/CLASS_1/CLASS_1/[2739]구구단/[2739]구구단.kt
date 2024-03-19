import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bfWriter = BufferedWriter(OutputStreamWriter(System.out))

    val N = readln().toInt()

    for (i in 1..9) {
        bfWriter.write("$N * $i = ${N*i}\n")
    }
    
    bfWriter.flush()
    bfWriter.close()
    close()
}