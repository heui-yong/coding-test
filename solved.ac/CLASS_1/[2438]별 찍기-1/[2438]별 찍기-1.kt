import java.util.Scanner
fun main() = with(Scanner(System.`in`)) {
    for (i: Int in 1..nextInt()) {
        for (j: Int in 1..i){
            print("*")
        }
        println()
    }
}