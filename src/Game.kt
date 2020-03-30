import processing.core.PApplet
import processing.core.PImage
import processing.event.KeyEvent

fun main(){
Game.main()

}

//fun main(args: Array<String>) {
   // Game.run()
//}

class Game : PApplet() {

 //   companion object Factory {
   //     fun run() {
   //         var game = Game()
    //        game.runSketch()

     //   }

    var gameManager : GameManager
    var i : Int = 0
    init {
        gameManager = GameManager(null, this)
        gameManager.changeGameState("playGameState",PlayGameState(this,gameManager))
    }

    var resolutionX : Int = 800;
    var resolutionY : Int =800




    init {

    }

   companion object{
    @JvmStatic
   fun main() {
       main(Game::class.java)

   }





        var imageMap : MutableMap<String, PImage> = HashMap()
    }



    override fun settings() {
        super.settings()


        size(resolutionX,resolutionY)
    }

    override fun setup() {
        super.setup()
        loadMapAssets()

        frameRate(30F)
        background(0F,0F,0F)
        loop()

        //gameManager = GameManager(gameState = GameState())
    }

    override fun draw() {
       // super.draw()

        kotlin.io.println(i)
        gameManager.render()
        i++
    }

    override fun keyPressed(event : KeyEvent){
        gameManager?.keyPressed(event)

    }

    override fun keyReleased(event : KeyEvent) {
        gameManager?.keyReleased(event)
    }

    fun loadMapAssets(){
        var image = loadImage("assets/grassTile.png")
        imageMap.put("grassTile",image)
        image = loadImage("assets/waterTile.png")
        imageMap.put("waterTile",image)
    }


}