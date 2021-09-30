package tuts.loops

class Loops {

    fun fizzBuzz(i:Int)=when{
        i%15==0->"FizzBuzz"
        i%3==0->"Fizz"
        i%5==0->"Buzz"

        else->"$i"
    }


}

fun main() {
    for(i in 1000 downTo 1 step 3){
        val fizzbuzz=Loops()
        println(fizzbuzz.fizzBuzz(i))
    }
}



