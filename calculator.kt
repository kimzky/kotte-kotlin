/* Class for Calculator, with built in functions
   used to add, subtract, multiply, divide and even
   to calculate the power of different equations.
*/

class Calculator(val name: String) {
  init {
    println("$name's Calculator 🧮")
  }

  /* Unsure if the functions below here should be
   included in the class or not, when running 
   the code later on - you will notice if it works
   or not, if it doesnt: try to put it inside the
   class instead of putting it outside of the class.
   */
  fun add(int1: Int, int2: Int): Int {
  return int1 + int2
}

fun subtract(int1: Int, int2: Int): Int {
  return int1 - int2
}

fun multiply(int1: Int, int2: Int): Int {
  return int1 * int2
}

fun divide(int1: Int, int2: Int): Any {
  if (int2 == 0) {
    return "You can't divide something by 0."
  } else {
    return int1 / int2
  }
}

fun power(int1: Int, int2: Int): Int {
  var result = 1

  for (i in 1..int2) {
    result *= int1
  }
  return result
}
} 


fun main() {
  // Define the name of the calculator.
  var myCalculator = Calculator("Kimzky")
  // Start verifying that functions are working. First up, addition.
  println(myCalculator.add(5, 7))
  // Now let's verify subtraction.
  println(myCalculator.subtract(8, 7))
  // Next up: Multiplication
  println(myCalculator.multiply(5, 12))
  // Let's try out our function used for dividing.
  println(myCalculator.divide(33, 3))
  // And finally, verify that the power function is working.
  println(myCalculator.power(5, 3))

}
