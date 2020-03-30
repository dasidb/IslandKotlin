import processing.core.PApplet
import processing.core.PImage
import processing.core.PVector


class GameMap(pApplet: PApplet){
   var gameMap : HashMap<PVector, Tile> = HashMap()
    var test : MutableMap<PVector, Tile> = HashMap();
    var pApplet = pApplet
  //  var  imageMap : MutableMap<String, PImage> = HashMap()

    init {
      //  createGameMap()

    }


    //
    fun createGameMap(cordX : Int, cordY : Int) : HashMap<PVector, Tile>{
        for(x in 0 until 40 ){
            for(y in 0 until 40){
                var cordVector : PVector = PVector(x as Float + cordX, y as Float + cordY)
                val noiseValue : Float = useNoice(cordVector.x + x / 40F,cordVector.y + y / 40F)
                gameMap.put(cordVector, addTileToMap(noiseValue,cordVector))
            }
        }
        return gameMap
        }

    fun useNoice(x : Float, y : Float) : Float{
        var test : Float = pApplet.noise(x * 2f+ y * 2f)
        + 0.5F * pApplet.noise(4F * x, 4F * y)
        +0.25F * pApplet.noise(3F * x, 3F * y)
        var waterTile : WaterTile = WaterTile(3F,3F)

        return 2F
    }

    fun addTileToMap(noise : Float, vector : PVector): Tile {
        if(noise < 0.76F)
            return WaterTile(vector.x, vector.y)
        else
            return GrassTile(vector.x, vector.y)
    }

    fun render(pApplet: PApplet){
        println("test")
    gameMap.forEach{
        k,v ->

        var image: PImage
        if(v is GrassTile) {
            image = Game.imageMap.get("grassTile")!!

        }
        else{
            image = Game.imageMap.get("waterTile")!!

        }

            pApplet.image(image,2F,2F)
    }

    }






}

