import processing.core.PApplet
import processing.event.KeyEvent


class GameManager{
    var gameStateMap : Map<String, GameState>? = HashMap()
    var currentGameState : GameState
  //  get() = this.currentGameState
  //  set(state: GameState){
 //       this.currentGameState = state
 //   }

    constructor(gameState: GameState){
        this.currentGameState = gameState
    }

    fun update(){
        currentGameState.update()
    }



    fun render(pApplet: PApplet){
    currentGameState.render()
    }

    fun keyPressed(event : KeyEvent){
        currentGameState.keyPressed(event)
    }

    fun keyReleased(event : KeyEvent){
        currentGameState.keyReleased(event)
    }

}