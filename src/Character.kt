import processing.core.PApplet
import processing.core.PImage
import processing.core.PVector

class Character(image : PImage){
    var drawPosition : PVector
    var image = image
    var mapPosition : PVector
    val inventory = Inventory()

    init {
        drawPosition  = PVector(400F,400F)
        mapPosition = PVector(20F,20F)

    }

    fun moveUp(){
        drawPosition.y -= 20
        mapPosition.y -=1
        println("kommt in der funktion an")
    }
    fun moveDown(){
        drawPosition.y  += 20
        mapPosition.y +=1
    }
    fun moveLeft(){
        drawPosition.x -= 20
        mapPosition.x -=1
    }
    fun moveRight(){
        drawPosition.x += 20
        mapPosition.x +=1
    }

    fun render(pApplet: PApplet){
        pApplet.image(image, drawPosition.x, drawPosition.y)
    }

}