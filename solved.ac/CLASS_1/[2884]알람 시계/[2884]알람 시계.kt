import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bfWriter = BufferedWriter(OutputStreamWriter(System.out))

    val data = readln().split(" ")
    val hour = data[0].toInt()
    val minute = data[1].toInt()-45

    bfWriter.write(
        when {
            minute < 0 -> {
                if (hour - 1 < 0) "23 ${60 + minute}" else "${hour - 1} ${60 + minute}"
            }
            else -> "$hour $minute"
        }
    )

    bfWriter.flush()
    bfWriter.close()
    close()
}