
import java.util.*
fun getInputList(scanner: Scanner): List<Int> {
    println("введите числа (через пробел):")
    return scanner.nextLine().split(" ").map { it.toInt() }
}
fun sumList(numbers: List<Int>): Int {
    return numbers.sum()
}
fun differenceMaxMin(numbers: List<Int>): Int {
    return numbers.maxOrNull()!! - numbers.minOrNull()!!
}
fun mergeLists(list1: List<Int>, list2: List<Int>): List<Int> {
    return list1 + list2
}
fun isProfitable(prob: Double, prize: Double, pay: Double): Boolean {
    return prob * prize > pay
}
fun isSumLessThan100(num1: Int, num2: Int): Boolean {
    return (num1 + num2) < 100
}
fun isDivisibleBy100(number: Int): Boolean {
    return number % 100 == 0
}
fun calculateFrames(minutes: Int, fps: Int): Int {
    return minutes * 60 * fps
}
fun isPowerEquals(n: Int, k: Int): Boolean {
    return Math.pow(k.toDouble(), k.toDouble()) == n.toDouble()
}
fun repetition(txt: String, n: Int): String {
    return if (n <= 0) "" else txt + repetition(txt, n - 1)
}
fun equation(equation: String): Int {
    return try {
        val result = javax.script.ScriptEngineManager().getEngineByName("JavaScript").eval(equation)
        result.toString().toInt()
    } catch (e: Exception) {
        0
    }
}
fun google(number: Int): String {
    return "G" + "o".repeat(number) + "gle"
}
fun greet() {
    println("привет, мир!")
}
fun sum(num1: Int, num2: Int): Int {
    return num1 + num2
}
fun maxOf(num1: Int, num2: Int): Int {
    return if (num1 > num2) num1 else num2
}
fun isEven(number: Int): Boolean {
    return number % 2 == 0
}
fun factorial(n: Int): Int {
    return if (n <= 1) 1 else n * factorial(n - 1)
}
fun isPrime(n: Int): Boolean {
    if (n <= 1) return false
    for (i in 2 until n) {
        if (n % i == 0) return false
    }
    return true
}
fun sumArray(numbers: IntArray): Int {
    return numbers.sum()
}
fun maxInArray(numbers: IntArray): Int {
    return numbers.maxOrNull() ?: 0
}
fun sortArray(numbers: IntArray): IntArray {
    return numbers.sortedArray()
}
fun isPalindrome(str: String): Boolean {
    return str == str.reversed()
}
fun countCharacters(str: String): Int {
    return str.length
}
fun toUpperCase(str: String): String {
    return str.uppercase()
}
fun concatenateStrings(str1: String, str2: String): String {
    return str1 + str2
}
fun getLastElement(array: IntArray): Int? {
    return array.lastOrNull()
}
fun containsElement(array: IntArray, element: Int): Boolean {
    return array.contains(element)
}
fun createArrayFrom1ToN(n: Int): IntArray {
    return IntArray(n) { it + 1 }
}
fun findMaxMin(numbers: IntArray): Pair<Int?, Int?> {
    return Pair(numbers.maxOrNull(), numbers.minOrNull())
}
fun sumFrom1ToN(n: Int): Int {
    return (1..n).sum()
}
fun celsiusToFahrenheit(celsius: Double): Double {
    return celsius * 9 / 5 + 32
}
fun reverseString(str: String): String {
    return str.reversed()
}
fun findElementByIndex(array: IntArray, index: Int): Int? {
    return if (index in array.indices) array[index] else null
}
fun removeSpaces(str: String): String {
    return str.replace(" ", "")
}
fun sumOfFirstNNumbers(n: Int): Int {
    return (1..n).sum()
}
fun containsSubstring(str: String, substring: String): Boolean {
    return str.contains(substring)
}
fun printMultiplicationTable(number: Int) {
    for (i in 1..10) {
        println("$number * $i = ${number * i}")
    }
}
fun lengthOfString(str: String): Int {
    return str.length
}
fun reverseArray(array: IntArray): IntArray {
    return array.reversedArray()}
fun copyArray(array: IntArray): IntArray {
    return array.copyOf()
}
fun countVowels(str: String): Int {
    return str.count { it.lowercaseChar() in "aeiou" }
}
fun indexOfFirstOccurrence(array: IntArray, element: Int): Int {
    return array.indexOf(element)
}
fun main() {
    val scanner = Scanner(System.`in`)
    println("\nЗадание 1")
    val numbers1 = getInputList(scanner)
    println("сумма элементов: ${sumList(numbers1)}")
    println("\nЗадание 2")
    val numbers2 = getInputList(scanner)
    println("разность: ${differenceMaxMin(numbers2)}")
    println("\nЗадание 3")
    println("введите первый список:")
    val list1 = getInputList(scanner)
    println("введите второй список:")
    val list2 = getInputList(scanner)
    println("объединенный список: ${mergeLists(list1, list2)}")
    println("\nЗадание 4")
    println("введите prob, prize и pay:")
    val prob = scanner.nextDouble()
    val prize = scanner.nextDouble()
    val pay = scanner.nextDouble()
    println("результат: ${isProfitable(prob, prize, pay)}")
    println("\nЗадание 5")
    println("введите prob, prize и pay:")
    val prob2 = scanner.nextDouble()
    val prize2 = scanner.nextDouble()
    val pay2 = scanner.nextDouble()
    println("результат: ${isProfitable(prob2, prize2, pay2)}")
    println("\nЗадание 6")
    println("введите два числа:")
    val num1 = scanner.nextInt()
    val num2 = scanner.nextInt()
    println("сумма меньше 100? ${isSumLessThan100(num1, num2)}")
    println("\nЗадание 7")
    println("введите целое число:")
    val number = scanner.nextInt()
    println("делится на 100? ${isDivisibleBy100(number)}")
    println("\nЗадание 8")
    println("введите количество минут и FPS:")
    val minutes = scanner.nextInt()
    val fps = scanner.nextInt()
    println("количество кадров: ${calculateFrames(minutes, fps)}")
    println("\nЗадание 9")
    println("введите n и k:")
    val n = scanner.nextInt()
    val k = scanner.nextInt()
    println("результат: ${isPowerEquals(n, k)}")
    println("\nЗадание 10")
    println("введите строку и количество повторений:")
    val txt = scanner.next()
    val repeatCount = scanner.nextInt()
    println(repetition(txt, repeatCount))
    println("\nЗадание 11")
    println("введите уравнение (например, '1+1'):")
    val equationInput = scanner.next()
    println(equation(equationInput))
    println("\nЗадание 12")
    println("введите число для Google:")
    val googleCount = scanner.nextInt()
    println(google(googleCount))
    println("\nЗадание 13")
    greet()
    println("\nЗадание 14")
    println("введите два числа:")
    val sumNum1 = scanner.nextInt()
    val sumNum2 = scanner.nextInt()
    println("сумма: ${sum(sumNum1, sumNum2)}")
    println("\nЗадание 15")
    println("введите два числа:")
    val maxNum1 = scanner.nextInt()
    val maxNum2 = scanner.nextInt()
    println("большее число: ${maxOf(maxNum1, maxNum2)}")
    println("\nЗадание 16")
    println("введите число для проверки четности:")
    val evenNum = scanner.nextInt()
    println("четное? ${isEven(evenNum)}")
    println("\nЗадание 17")
    println("введите число для вычисления факториала:")
    val factorialNum = scanner.nextInt()
    println("факториал: ${factorial(factorialNum)}")
    println("\nЗадание 18")
    println("введите число для проверки на простоту:")
    val primeNum = scanner.nextInt()
    println("Простое? ${isPrime(primeNum)}")
    println("\nЗадание 19")
    println("введите массив целых чисел (через пробел):")
    val array19 = scanner.nextLine().split(" ").map { it.toInt() }.toIntArray()
    println("сумма массива: ${sumArray(array19)}")
    println("\nЗадание 20")
    println("введите массив целых чисел (через пробел):")
    val array20 = scanner.nextLine().split(" ").map { it.toInt() }.toIntArray()
    println("максимальное число: ${maxInArray(array20)}")
    println("\nЗадание 21")
    println("введите массив целых чисел (через пробел):")
    val array21 = scanner.nextLine().split(" ").map { it.toInt() }.toIntArray()
    println("отсортированный массив: ${sortArray(array21).joinToString(", ")}")
    println("\nЗадание 22")
    println("введите строку для проверки палиндрома:")
    val palindromeStr = scanner.next()
    println("палиндром? ${isPalindrome(palindromeStr)}")
    println("\nЗадание 23")
    println("введите строку для подсчета символов:")
    val characterCountStr = scanner.next()
    println("количество символов: ${countCharacters(characterCountStr)}")
    println("\nЗадание 24")
    println("введите строку для конвертации в верхний регистр:")
    val upperCaseStr = scanner.next()
    println("в верхнем регистре: ${toUpperCase(upperCaseStr)}")
    println("\nЗадание 25")
    println("введите первую строку:")
    val str1 = scanner.next()
    println("введите вторую строку:")
    val str2 = scanner.next()
    println("объединение строк: ${concatenateStrings(str1, str2)}")
    println("\nЗадание 26")
    println("введите массив целых чисел (через пробел):")
    val array26 = scanner.nextLine().split(" ").map { it.toInt() }.toIntArray()
    println("последний элемент: ${getLastElement(array26)}")
    println("\nЗадание 27")
    println("введите массив целых чисел (через пробел):")
    val array27 = scanner.nextLine().split(" ").map { it.toInt() }.toIntArray()
    println("введите элемент для проверки:")
    val element27 = scanner.nextInt()
    println("присутствует элемент? ${containsElement(array27, element27)}")
    println("\nЗадание 28")
    println("введите N для создания массива от 1 до N:")
    val n28 = scanner.nextInt()
    println("массив от 1 до N: ${createArrayFrom1ToN(n28).joinToString(", ")}")
    println("\nЗадание 29")
    println("введите массив целых чисел (через пробел):")
    val array29 = scanner.nextLine().split(" ").map { it.toInt() }.toIntArray()
    val (max, min) = findMaxMin(array29)
    println("максимум: $max, минимум: $min")
    println("\nЗадание 30")
    println("введите N для суммы от 1 до N:")
    val n30 = scanner.nextInt()
    println("сумма от 1 до N: ${sumFrom1ToN(n30)}")
    println("\nЗадание 31")
    println("введите температуру в цельсиях:")
    val celsius = scanner.nextDouble()
    println("фаренгейт: ${celsiusToFahrenheit(celsius)}")
    println("\nЗадание 32")
    println("введите строку для обратного порядка:")
    val reverseStr = scanner.next()
    println("обратный порядок: ${reverseString(reverseStr)}")
    println("\nЗадание 33")
    println("введите массив целых чисел (через пробел):")
    val array33 = scanner.nextLine().split(" ").map { it.toInt() }.toIntArray()
    println("введите индекс для поиска:")
    val index33 = scanner.nextInt()
    println("элемент по индексу: ${findElementByIndex(array33, index33)}")
    println("\nЗадание 34")
    println("введите строку для удаления пробелов:")
    val spaceStr = scanner.next()
    println("без пробелов: ${removeSpaces(spaceStr)}")
    println("\nЗадание 35")
    println("введите N для суммы первых N натуральных чисел:")
    val n35 = scanner.nextInt()
    println("сумма первых N натуральных чисел: ${sumOfFirstNNumbers(n35)}")
    println("\nЗадание 36")
    println("введите строку и подстроку для проверки наличия:")
    val mainStr = scanner.next()
    val subStr = scanner.next()
    println("содержится подстрока? ${containsSubstring(mainStr, subStr)}")
    println("\nЗадание 37")
    println("введите число для печати таблицы умножения:")
    val multiplicationNum = scanner.nextInt()
    printMultiplicationTable(multiplicationNum)
    println("\nЗадание 38")
    println("введите строку для нахождения длины:")
    val lengthStr = scanner.next()
    println("длина строки: ${lengthOfString(lengthStr)}")
    println("\nЗадание 39")
    println("введите массив целых чисел (через пробел):")
    val array39 = scanner.nextLine().split(" ").map { it.toInt() }.toIntArray()
    println("веревернутый массив: ${reverseArray(array39).joinToString(", ")}")
    println("\nЗадание 40")
    println("введите массив целых чисел (через пробел):")
    val array40 = scanner.nextLine().split(" ").map { it.toInt() }.toIntArray()
    println("копированный массив: ${copyArray(array40).joinToString(", ")}")
    println("\nЗадание 41")
    println("введите строку для подсчета гласных:")
    val vowelStr = scanner.next()
    println("количество гласных: ${countVowels(vowelStr)}")
    println("\nЗадание 42")
    println("введите массив целых чисел (через пробел):")
    val array42 = scanner.nextLine().split(" ").map { it.toInt() }.toIntArray()
    println("введите элемент для поиска:")
    val searchElement = scanner.nextInt()
    println("индекс первого вхождения: ${indexOfFirstOccurrence(array42, searchElement)}")
}