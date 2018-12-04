import java.io.File

fun main(args: Array<String>) {


    val fileName = "/Users/souriyakhaosanga/github/advent/src/main/resources/data.txt"


    val list = readFileAsLinesUsingReadLines(fileName)

    val get = list.map { it.toInt() }.toList()

    println(get.sum())





}


fun readFileLineByLineUsingForEachLine(fileName: String) = File(fileName).forEachLine { println(it) }

fun readFileAsLinesUsingReadLines(fileName: String): List<String> = File(fileName).readLines()
