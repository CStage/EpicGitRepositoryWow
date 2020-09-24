import java.util.ArrayList;

public class ItemTracker {
    private ArrayList<Item> items;

    public ItemTracker() {
        items = new ArrayList<>();
    }

    //1. Add method

    public void addItems(String itemName, int itemValue) {
        items.add(new Item(itemName, itemValue));
    }

    /**
     * Sorting all the items in alphabetical order
     * @param x
     */




    /** 
    Remove item from list:
    @param x String to be removed
    */ 
    
    public void remove(String x){
        if (items.contains(x))
            items.remove(x);
    }

     /**
    @return all items in the list
     */
    
    public ArrayList<Item> getItems() {
        return items; 
    }

    /** 
    Return a single item in the list:
    @param index
    */ 
    

    public String getItem(String item) {
        for (Item item : items) {
            if(item.name)
        }
        return items.get(index);
    }
}
