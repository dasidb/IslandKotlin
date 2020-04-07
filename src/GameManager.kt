import processing.core.PApplet
import processing.event.KeyEvent


class GameManager(
    var currentGameState : GameState? = null,
    var pApplet: PApplet,
    var hasMapUpdate : Boolean = true

){
    var increment : Int = 0
    var gameMap : GameMap = GameMap(pApplet)
    var gameStateMap : MutableMap<String, GameState> = HashMap()
    var character : Character = Character()
    var camera : Camera = Camera()


    fun changeGameState(gameStateKey : String, gameState: GameState){
        if(!gameStateMap.contains(gameStateKey))
            gameStateMap.put(gameStateKey, gameState)

        currentGameState = gameStateMap.get(gameStateKey)
    }

    fun update(){
        currentGameState?.update()
       // if(hasMapUpdate) {
            //gameMap.createGameMap(camera.position.x, camera.position.y)
        gameMap.createGameMap(camera.position.x , camera.position.y)
        //}
        //println(gameMap.gameMap.size)
    }

    fun render(){
        increment++
        pApplet.clear()
        currentGameState?.render()
        gameMap.render(pApplet, camera.position)
       // if(increment > 60){
           // increment = 0
            camera.position.x ++
            camera.position.y ++
            println(gameMap.gameMap.size)
    //    }

        //camera.position.x++



    }

    fun keyPressed(event : KeyEvent){
        currentGameState?.keyPressed(event)
    }

    fun keyReleased(event : KeyEvent){
        currentGameState?.keyReleased(event)
    }

}