fun fizzBuzz(n: Int): List<String> {
    //20/02/2025
    val result = mutableListOf<String>()
    for(i in 1..n) {
        if(i % 3 == 0 && i % 5 == 0)
            result.add("FizzBuzz")
        else if(i % 3 == 0)
            result.add("Fizz")
        else if(i % 5 == 0)
            result.add("Buzz")
        else
            result.add(i.toString())
    }
    return result
}


fun main() {
    val res = fizzBuzz(20)
    res.forEach { println(it) }

}
