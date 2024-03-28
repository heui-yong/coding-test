import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bfWriter = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readln().toInt()) {
        val data = readln().split(" ")

        val H = data[0].toInt()
        val W = data[1].toInt()
        val N = data[2].toInt()

        if (N%H == 0) {
            bfWriter.write(String.format("%d%02d\n", H, (N/H)))
        } else bfWriter.write(String.format("%d%02d\n", N%H, (N/H)+1))
    }

    bfWriter.flush()
    bfWriter.close()
    close()
}