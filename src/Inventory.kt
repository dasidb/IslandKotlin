import kotlin.test.todo

class Inventory(val playerItemList : MutableMap<Int, PlayerItem> = HashMap()){



    fun addItemToInventory(item : Item, amount : Int){
        todo { "ggf boolean zurück geben ob erfolgreich hinzugefügt oder nicht" }
       if(playerItemList.containsKey(item.id))
           playerItemList.get(item.id)?.addCount(amount)
        else
           playerItemList.put(item.id, PlayerItem(item,amount))
    }

}