import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.sqrt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bfWriter = BufferedWriter(OutputStreamWriter(System.out))
    val (start, end) = readLine().split(' ').map { it.toInt() }

    val prime = BooleanArray(end + 1)
    prime[1] = true

    for(i in 2 .. sqrt(end.toDouble()).toInt()) {
        if(prime[i]) continue

        for(j in i*i .. end step i) {
            prime[j] = true
        }
    }

    for(i in start .. end) {
        if(!prime[i]) {
            bfWriter.write("$i\n")
        }
    }

    bfWriter.flush()
    bfWriter.close()
    close()
}