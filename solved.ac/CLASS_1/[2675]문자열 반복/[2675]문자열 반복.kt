import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bfWriter = BufferedWriter(OutputStreamWriter(System.out))

    val textCase = readln().toInt()
    val p = StringBuilder()

    repeat(textCase) {
        val data = readln().split(" ")
        val r = data[0].toInt()
        val s = data[1]

        repeat(s.length) {
            p.append(s[it].toString().repeat(r))
        }

        bfWriter.write("$p\n")
        p.clear()
    }

    bfWriter.flush()
    bfWriter.close()
    close()
}