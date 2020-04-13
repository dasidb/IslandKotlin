import processing.core.PApplet
import processing.core.PImage
import processing.core.PVector

class Character(image : PImage){
    var position : PVector
    var image = image
    init {
        position  = PVector(400F,400F)

    }

    fun moveUp(){
        position.y -= 20
        println("kommt in der funktion an")
    }
    fun moveDown(){
        position.y  += 20
    }
    fun moveLeft(){
        position.x -= 20
    }
    fun moveRight(){
        position.x += 20
    }

    fun render(pApplet: PApplet){
        pApplet.image(image, position.x, position.y)
    }

}