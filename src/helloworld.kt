fun main(args: Array<String>) {
    firstVersion()
    secondVersion(args)
    thirdVersion(args)
    fourthVersion(args)
    println("First ${foo()} Second ${foo()}")
}

fun firstVersion() {
    val name = "Luis"
    print("First version: ")
    println("Hello $name")
}

fun secondVersion(args: Array<String>) {
    //TODO refactor name in third version
    val name = if (args.size > 0) args[0] else "Kotlin"
    print("Second version: ")
    println("Hello $name")
}

fun thirdVersion(args: Array<String>) {
    val name = if (args.isNotEmpty()) args[0] else "Kotlin"
    print("Third version: ")
    println("Hello world $name")
}

fun fourthVersion(args: Array<String>) {
    print("Fourth version: ")
    //println("Hello $args.getOrNull(0)") wrong, functions must be in curly braces
    println("Hello ${args.getOrNull(0)}")
}

fun foo(): String {
    println("Returning calculating foo...")
    return "foo"
}