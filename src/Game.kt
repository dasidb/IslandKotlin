import processing.core.PApplet
import processing.event.KeyEvent
import kotlin.properties.Delegates

fun main(){
Game.main()
    Game()
}

class Game(
    var gameManager: GameManager? = null,
    var gameState: GameState? = null
) : PApplet() {

    var resolutionX : Int = 800;
    var resolutionY : Int =800


    init {

    }

    companion object{
    @JvmStatic
    fun main() {
        main(Game::class.java)
    }
    }

    override fun settings() {
        super.settings()


        size(resolutionX,resolutionY)
    }

    override fun setup() {
        super.setup()
        gameManager = GameManager(gameState = GameState())
    }

    override fun draw() {
        super.draw()
    }

    override fun keyPressed(event : KeyEvent){
        gameManager?.keyPressed(event)

    }

    override fun keyReleased(event : KeyEvent) {
        gameManager?.keyReleased(event)
    }


}