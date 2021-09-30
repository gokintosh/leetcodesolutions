package tuts.basics

fun main() {
    var x=1

    println("before loop value $x")

    while(x<4){
        println("in the loop $x")
        x+=1
    }

    println("after loop valur $x")
}