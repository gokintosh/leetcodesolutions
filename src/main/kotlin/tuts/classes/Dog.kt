package tuts.classes

class Dog(val name:String,var weight:Int,val breed:String) {

    fun bark(){
        println(if(weight<20)"yip!" else "woof!")
    }
}