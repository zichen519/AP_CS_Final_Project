package main.kotlin

import main.java.TextHelper
// KotlinMain.kt
// Kotlin version of the main function demonstrating cleaner syntax

fun main() {
    println("=== Extension Functions Demo (Kotlin Version) ===\n")

    demonstrateStringExtensions()
    demonstrateListExtensions()
    demonstrateNumberExtensions()

    println()
    demonstrateJavaInterop()
}

fun demonstrateStringExtensions() {
    println("=== String Extensions ===")

    val text = "hello world"
    val email = "test@email.com"
    val badEmail = "not-an-email"

    // Clean, readable method calls - no static class references needed
    println("Text: '$text'")
    println("Capitalized: ${text.capitalize()}")
    println("No spaces: ${text.removeSpaces()}")

    println("\nEmail validation:")
    println("$email is valid: ${email.isValidEmail()}")
    println("$badEmail is valid: ${badEmail.isValidEmail()}")
}

fun demonstrateListExtensions() {
    println("\n=== List Extensions ===")

    val fruits = listOf("apple", "banana", "cherry")
    val shortList = listOf("only-one")

    // Natural method chaining and null-safe operations
    println("Fruits: $fruits")
    println("Second fruit: ${fruits.secondOrNull()}")
    println("Joined: ${fruits.joinWithComma()}")

    println("\nShort list: $shortList")
    println("Second item: ${shortList.secondOrNull()}")
}

fun demonstrateNumberExtensions() {
    println("\n=== Number Extensions ===")

    val numbers = listOf(4, 7, 10)

    // Functional programming style with extension functions
    numbers.forEach { num ->
        println("Number $num - Even: ${num.isEven()}, Squared: ${num.square()}")
    }
}

// Show comparison between Kotlin and Java approaches
fun demonstrateKotlinVsJavaComparison() {
    println("\n=== Kotlin vs Java Comparison ===")

    val sampleText = "example text"
    val helper = TextHelper("ComparisonHelper")

    // Java style (verbose, utility class based)
    println("Java approach:")
    println("  Capitalize: ${helper.capitalize(sampleText)}")
    println("  Email check: ${helper.isValidEmail("test@example.com")}")

    // Kotlin style (concise, extension functions)
    println("Kotlin approach:")
    println("  Capitalize: ${sampleText.capitalize()}")
    println("  Email check: ${"test@example.com".isValidEmail()}")

    // Show Kotlin's method chaining capabilities
    val processedText = "  MESSY   TEXT  "
        .trim()
        .lowercase()
        .capitalize()
        .removeSpaces()

    println("Kotlin chaining: '$processedText'")

    // Demonstrate null safety
    val nullableText: String? = null
    val safeResult = nullableText?.capitalize() ?: "No text provided"
    println("Null-safe result: $safeResult")
}

// Enhanced version of the original demo with Kotlin improvements
fun demonstrateEnhancedJavaInterop() {
    println("\n=== Enhanced Kotlin-Java Interop ===")

    // Create Java object with Kotlin's concise syntax
    val helper = TextHelper("EnhancedHelper").apply {
        printInfo() // Kotlin's scope function
    }

    val testInputs = listOf(
        "hello world",
        "user@example.com",
        "UPPERCASE TEXT",
        "  spaced   text  "
    )

    testInputs.forEach { input ->
        println("\nProcessing: '$input'")

        // Compare approaches side by side
        val javaResult = helper.capitalize(input)
        val kotlinResult = input.capitalize()

        println("Java result: $javaResult")
        println("Kotlin result: $kotlinResult")
        println("Results match: ${javaResult == kotlinResult}")

        // Show additional Kotlin capabilities
        when {
            input.isValidEmail() -> println("Type: Email")
            input.any { it.isDigit() } -> println("Type: Contains numbers")
            else -> println("Type: Regular text")
        }
    }

    // Demonstrate working with Java collections using Kotlin extensions
    val javaWords = helper.getWords("kotlin makes java better")
    println("\nJava collection enhanced with Kotlin:")
    println("Words: $javaWords")
    println("Second word: ${javaWords.secondOrNull()}")
    println("Comma-separated: ${javaWords.joinWithComma()}")

    // Show functional programming with Java data
    val processedWords = javaWords
        .filter { it.length > 4 }
        .map { it.capitalize() }
        .joinToString(" -> ")

    println("Functional processing: $processedWords")
}