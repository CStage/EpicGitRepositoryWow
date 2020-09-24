import java.util.ArrayList;

public class ItemTracker {
    private ArrayList<String> items;

    public ItemTracker() {
        items = new ArrayList<>();
    }

    //1. Add method

    public void addItems(String item) {
        items.add(item);
    }


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
    
    public ArrayList<String> getItems() {
        return items; 
    }

    /** 
    Return a single item in the list:
    @param index
    */ 
    

    public String getItem(int index) {
        return items.get(index);
    }
}
