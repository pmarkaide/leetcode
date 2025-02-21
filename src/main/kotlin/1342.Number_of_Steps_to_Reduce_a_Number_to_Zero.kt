
fun numberOfSteps(num: Int): Int {
    //20/02/2025
    var steps = 0
    var result = num
    while(result != 0){
        if(result % 2 == 0){
            result /= 2
            steps++
        }
        else{
            result -= 1
            steps++
        }
    }
    return steps
}

fun main() {
    val res = numberOfSteps(20)
    println(res)

}