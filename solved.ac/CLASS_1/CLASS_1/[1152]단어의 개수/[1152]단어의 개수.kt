package com.example.coding_test

fun main() {
    val words = readln().trim().split(" ").toMutableList()
    words.removeAll(listOf(""))

    println(words.size)
}