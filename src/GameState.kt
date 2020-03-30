import processing.core.PApplet
import processing.event.KeyEvent


open abstract class  GameState(pApplet: PApplet,
                     gameManager: GameManager
                ){

init {

}
    fun update(){

    }

    fun render(){

    }

    fun keyPressed(event : KeyEvent){

    }

    fun keyReleased(event : KeyEvent){

    }

}