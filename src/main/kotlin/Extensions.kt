package main.kotlin

//Extension functions
fun String.isValidEmail(): Boolean {
    return this.contains("@") && this.contains(".")
}

fun String.capitalize(): String {
    return if (this.isEmpty()) this else this[0].uppercase() + this.substring(1).lowercase()
}

fun String.removeSpaces(): String {
    return this.replace(" ", "")
}

fun <T> List<T>.secondOrNull(): T? {
    return if (this.size >= 2) this[1] else null
}

fun List<String>.joinWithComma(): String {
    return this.joinToString(", ")
}

fun Int.isEven(): Boolean = this % 2 == 0
fun Int.square(): Int = this * this