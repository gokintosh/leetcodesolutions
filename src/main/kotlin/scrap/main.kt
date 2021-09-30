package scrap

import java.util.*

class Rectangle(val height:Int,val width:Int){
    val isSquare:Boolean
        get() = height==width
}

enum class Color(val r:Int,val g:Int,val b:Int){
    RED(255,0,0),ORANGE(255,165,0),YELLOW(255,255,0),GREEN(0,255,0),BLUE(0,0,255),INDIGO(75,0,130),VIOLET(238,130,238);

    fun rgb()=(r*256+g)*256+b
}


fun createRandomRectangle():Rectangle{
    val random=Random();
    return Rectangle(random.nextInt(),random.nextInt())
}
fun main(args: Array<String>) {
    println("Hello World!")


    println(createRandomRectangle().isSquare)
    println(Color.GREEN.rgb())
}