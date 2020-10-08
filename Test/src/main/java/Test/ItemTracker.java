package Test;

import java.util.ArrayList;

public class ItemTracker {
    private ArrayList<Item> items;

    public ItemTracker() {
        this.items = new ArrayList<>();
    }

    // 1. Add method

    public void addItems(String itemName, int itemValue, int age) {
        this.items.add(new Item(itemName, itemValue, age));
    }

    /**
     * Sorting all the items in alphabetical order
     * 
     * @param x
     */

    /**
     * Remove item from list:
     * 
     * @param x String to be removed
     */

    public void remove(String x) {
        if (this.items.contains(x))
            this.items.remove(x);
    }

    /**
     * @return all items in the list
     */

    public ArrayList<Item> getItems() {
        return items;
    }

    /**
     * Return a single item in the list:
     * 
     * @param index
     */

    public Item getItem(String item) {
        if (itemExists(item)) {
            for (Item i : items) {
                if (item.equals(i.getName())) {
                    return i;
                }
            }
        }

        return null;
    }

    private boolean itemExists(String item) {
        for (Item i : items) {
            if (item.equals(i.getName())) {
                return true;
            }
        }
        return false;
    }


    public double getNetWorth() {
        var sum = 0; 
        
    }
}
