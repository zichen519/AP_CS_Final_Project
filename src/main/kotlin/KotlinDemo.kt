package main.kotlin

import main.java.TextHelper

fun demonstrateJavaInterop() {
    println("=== Kotlin Using Java Objects ===")

    val helper = TextHelper("TestHelper")
    helper.printInfo()

    val testText = "hello world"

    println("\nText: '$testText'")
    println("Java capitalize: ${helper.capitalize(testText)}")
    println("Kotlin capitalize: ${testText.capitalize()}")

    val email = "user@example.com"
    println("\nEmail: '$email'")
    println("Java validation: ${helper.isValidEmail(email)}")
    println("Kotlin validation: ${email.isValidEmail()}")

    val words = helper.getWords("apple banana cherry")
    println("\nWords from Java: $words")
    println("Second word: ${words.secondOrNull()}")
    println("Joined: ${words.joinWithComma()}")

    val number = 5
    println("\nNumber: $number")
    println("Is even: ${number.isEven()}")
    println("Squared: ${number.square()}")
}