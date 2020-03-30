import processing.core.PApplet
import processing.event.KeyEvent


class GameManager(
    var currentGameState : GameState? = null,
    var pApplet: PApplet

){

    var gameMap : GameMap = GameMap(pApplet)
    var gameStateMap : MutableMap<String, GameState> = HashMap()
    var character : Character = Character()


    fun changeGameState(gameStateKey : String, gameState: GameState){
        if(!gameStateMap.contains(gameStateKey))
            gameStateMap.put(gameStateKey, gameState)

        currentGameState = gameStateMap.get(gameStateKey)
    }

    fun update(){
        currentGameState?.update()

        gameMap.createGameMap(0,0)

    }

    fun render(){
        currentGameState?.render()
        gameMap.render(pApplet)

    }

    fun keyPressed(event : KeyEvent){
        currentGameState?.keyPressed(event)
    }

    fun keyReleased(event : KeyEvent){
        currentGameState?.keyReleased(event)
    }

}