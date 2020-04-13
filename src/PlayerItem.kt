class PlayerItem(
    val item : Item,
    var count : Int = 0
){

    fun addCount(count : Int){
        this.count += count
    }
}