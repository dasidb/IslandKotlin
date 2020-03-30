import processing.core.PApplet
import processing.core.PVector


class GameMap(pApplet: PApplet){
   var gameMap : HashMap<PVector, Tile> = HashMap()
    var test : MutableMap<PVector, Tile> = HashMap();
    var pApplet = pApplet

    init {
      //  createGameMap()
    }


    //
    fun createGameMap(cordX : Int, cordY : Int){
        for(x in 0 until 40 ){
            for(y in 0 until 40){
                var cordVector : PVector = PVector(x as Float + cordX, y as Float + cordY)
                val noiseValue : Float = useNoice(cordVector.x + x / 40F,cordVector.y + y / 40F)

            }
        }
        }

    fun useNoice(x : Float, y : Float) : Float{
        var test : Float = pApplet.noise(x * 2f+ y * 2f)
        + 0.5F * pApplet.noise(4F * x, 4F * y)
        +0.25F * pApplet.noise(3F * x, 3F * y)

        return 2F
    }

    fun addTileToMap(noise : Float){
        //if(noise < 0.76F)
            //return
    }

    fun render(){

    }




}

