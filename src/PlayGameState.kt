import processing.core.PApplet
import processing.event.KeyEvent
import kotlin.test.todo

class PlayGameState(pApplet: PApplet, gameManager: GameManager, character: Character) : GameState(pApplet, gameManager){
    val character : Character = character
    init {

    }

    override fun update() {
        changeCameraPositionX()
        changeCameraPositionY()
    }

    override fun render() {
        character.render(pApplet)
    }

    fun changeCameraPositionX(){
       // if(character.position.x <200)
    }

    fun changeCameraPositionY(){
        if(character.position.y < 200)
            todo { "camera movement on specific character position" +
                    ""
            }
    }

    override fun keyPressed(event : KeyEvent){
        super.keyPressed(event)
        keyInput(event.key, event.keyCode, false)
    }

    override fun keyReleased(event: KeyEvent) {
        super.keyReleased(event)
        keyInput(event.key, event.keyCode, true)

    }

    fun keyInput(key : Char, keyCode: Int, keyPressed: Boolean){
        println(character.position.y)
        if(keyPressed){

            if(key == 'w')
                character.moveUp()

            if(key == 's')
                character.moveDown()

        }
    }

}