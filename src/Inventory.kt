import kotlin.test.currentStackTrace
import kotlin.test.todo

class Inventory(val playerItemList : MutableMap<Int, PlayerItem> = HashMap()){



    fun addItemToInventory(item : Item, amount : Int){

       if(playerItemList.containsKey(item.id))
           playerItemList.get(item.id)?.addItem(amount)
        else
           playerItemList.put(item.id, PlayerItem(item,amount))
    }

    fun removeItemFromInventory(item : Item, amount : Int){

        if(playerItemList.containsKey(item.id)) {
            if(playerItemList.get(item.id)?.removeItem(amount)!!)
               playerItemList.remove(item.id)
            else
                println("Item konnte nicht entfernt werden" + currentStackTrace()[0])
        }


    }



}