fun main() {
    val words = readln()
    val map = mutableMapOf<Char, Int>()

    words.forEach { word ->
        val upperWord = word.uppercaseChar()

        if (map.containsKey(upperWord)) {
            map[upperWord] = map[upperWord]!!.plus(1)
        } else {
            map[upperWord] = 1
        }
    }

    val max = map.maxBy { it.value }

    if (map.filter { it.value == max.value }.count() > 1) {
        println("?")
    } else {
        println(max.key)
    }
}