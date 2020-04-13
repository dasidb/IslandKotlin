import processing.core.PApplet
import processing.core.PImage
import processing.event.KeyEvent

fun main() {
    Game.main()

}

class Game : PApplet() {
    var gameManager: GameManager? = null
    var i: Int = 0
    var resolutionX: Int = 800;
    var resolutionY: Int = 800

    init {
        //gameManager = GameManager(null, this)
        //gameManager.changeGameState("playGameState", PlayGameState(this, gameManager,gameManager.character))
    }

    init {

    }

    companion object {
        @JvmStatic
        fun main() {
            main(Game::class.java)
        }
        var imageMap: MutableMap<String, PImage> = HashMap()
    }

    override fun settings() {
        super.settings()
        size(resolutionX, resolutionY)
    }

    override fun setup() {
        super.setup()
        loadAssets()
        gameManager = GameManager(null, this)
        gameManager?.changeGameState("playGameState", PlayGameState(this, gameManager!!, gameManager!!.character))
        frameRate(60F)
        background(0F, 0F, 0F)
        loop()

        //gameManager = GameManager(gameState = GameState())
    }

    override fun draw() {
        // super.draw()

        gameManager?.update()
        gameManager?.render()


    }

    override fun keyPressed(event: KeyEvent) {
        gameManager?.keyPressed(event)

    }

    override fun keyReleased(event: KeyEvent) {
        gameManager?.keyReleased(event)
    }

    fun loadAssets() {
        loadTileAssets()
        loadEntityAssets()
        loadItemAssets()

    }

    fun loadTileAssets(){
        var image = loadImage("assets/grassTile.png")
        imageMap.put("grassTile", image)
        image = loadImage("assets/waterTile.png")
        imageMap.put("waterTile", image)
        image = loadImage("assets/sandTile.png")
        imageMap.put("sandTile", image)
    }

    fun  loadEntityAssets(){
        var image = loadImage("assets/held_survival.png")
        imageMap.put("character",image)
    }

    fun loadItemAssets(){
        var image = loadImage("assets/wood.png")
        imageMap.put("wood", image)
    }


}