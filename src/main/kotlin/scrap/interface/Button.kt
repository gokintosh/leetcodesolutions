package scrap.`interface`

class Button:Clickable {
    override fun click() {
        println("I was clicked")
    }
}

fun main() {
    val button=Button()
    button.click()
}