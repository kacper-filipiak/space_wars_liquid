import java.lang.NumberFormatException

fun main(args: Array<String>) {
    val calculator = CalculatorImpl();
    println("Welcome to the Space Wars")
    while (true) {
        println("Insert boxes sizes, and press enter to calculate spaceship capacity (egz. 2, 0, 4, 0, 1 ):")
        try {
            val input = readln().split(',').map { it.trim().toInt() }
            val result = calculator.space(input)
            println("Yours ship capacity is equal $result")
            println("Do You want to calculate one more time? If yes write \"y\" and pres Enter")
            if (readln().trim() != "y") {
                break;
            }
        } catch (e: NumberFormatException) {
           println("Wrong format of input! Try again")
        }
    }
}