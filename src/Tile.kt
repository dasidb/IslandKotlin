import processing.core.PImage

open class Tile{
    var image : PImage
    var cordX : Float
    var cordY : Float
    var test : Int = 0;
    constructor(image : PImage, cordX : Float, cordY : Float){
        this.image = image
        this.cordX = cordX
        this.cordY = cordY
    }

    constructor(image: PImage, cordX: Float, test : Int) : this(image,2F,2F) {
        this.image = image
        this.cordX = cordX
        this.test = test
    }


}