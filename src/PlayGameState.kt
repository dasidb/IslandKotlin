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
        if(character.position.x < 200) {
            gameManager.camera.moveCameraLeft()
            character.moveRight()
        }
        if(character.position.x < 800){
            gameManager.camera.moveCameraRight()
            character.moveLeft()
        }
    }

    fun changeCameraPositionY(){
        if(character.position.y < 200) {
            gameManager.camera.moveCameraUp()
            character.moveDown()
        }
        if(character.position.y > 600) {
            gameManager.camera.moveCameraDown()
            character.moveUp()
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
        if(keyPressed){

            if(key == 'w')
                character.moveUp()

            if(key == 's')
                character.moveDown()
            if(key == 'a')
                character.moveLeft()
            if(key == 'd')
                character.moveRight()
        }
    }

}