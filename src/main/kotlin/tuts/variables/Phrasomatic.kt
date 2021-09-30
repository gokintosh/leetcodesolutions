package tuts.variables

class Phrasomatic {
}

fun main() {
    val wordArray1= arrayOf("Gokul","Rahul","Mehul")
    val wordArray2= arrayOf("eats","drinks","plays")
    val wordArray3= arrayOf("football","mango","milk")


    val arr1Size=wordArray1.size
    val arr2Size=wordArray2.size
    val arr3Size=wordArray3.size


    val rand1=(Math.random()*arr1Size).toInt()
    val rand2=(Math.random()*arr2Size).toInt()
    val rand3=(Math.random()*arr3Size).toInt()

    val phrase="${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"

    println(phrase)
}