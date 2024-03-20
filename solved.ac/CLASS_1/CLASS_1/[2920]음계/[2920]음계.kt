import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bfWriter = BufferedWriter(OutputStreamWriter(System.out))

    val data = readln().split(" ")

    bfWriter.write(
        when (data) {
            data.sorted() -> "ascending"
            data.sorted().reversed() -> "descending"
            else -> "mixed"
        }
    )

    bfWriter.flush()
    bfWriter.close()
    close()
}