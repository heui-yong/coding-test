// Scanner 클래스 사용하는 코드
import java.util.Scanner
fun main() = with(Scanner(System.`in`)) {
    val num = nextInt()

    for (i: Int in 1..num) {
        for (j: Int in num downTo 1){
            if (i >= j) print("*")
            else print(" ")
        }
        println()
    }
}

//BufferedReader 클래스 사용하는 코드
import java.io.*
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bfWriter = BufferedWriter(OutputStreamWriter(System.out))

    val num = readLine().toInt()

    for (i: Int in 1..num) {
        for (j: Int in num downTo 1){
            if (i >= j) bfWriter.write("*")
            else bfWriter.write(" ")
        }
        bfWriter.write("\n")
    }

    bfWriter.flush()
    bfWriter.close()
    close()
}