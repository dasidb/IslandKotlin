import processing.core.PVector

fun main() {
    var test : GameMap = GameMap()
}

class GameMap(){
   var gameMap : HashMap<PVector, Tile> = HashMap()
    var test : MutableMap<PVector, Tile> = HashMap();

    init {
        createGameMap()
    }
    fun createGameMap(){
        test.put(PVector(2F,2F), Tile())
        for(key in test){
            println(key.value)
        }
    }

}