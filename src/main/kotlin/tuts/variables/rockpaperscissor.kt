package tuts.variables

import kotlin.Array

fun main() {
    val options= arrayOf("Rock","paper","Scissors")
    val gameChoice=getGameChoice(options)
    val userChoice= getUserChoice(options)

    printResult(userChoice,gameChoice)


    
}

fun getUserChoice(optionsParam: Array<String>):String {

    var isValidChoice=false
    var userChoice=""






    while(!isValidChoice){
        println("Please enter one of the following:")
        for(item in optionsParam) print(" $item")
        println(".")

        val userInput= readLine()

        if(userInput!=null&&userInput in optionsParam){
            isValidChoice=true
            userChoice=userInput
        }
        if(!isValidChoice) println("Enter a valid choice")
    }

    return userChoice
}

fun printResult(userChoioce:String,gameChoice:String){
    val result:String
}



fun getGameChoice(optionsParam: Array<String>)=optionsParam[(Math.random()*optionsParam.size).toInt()]


