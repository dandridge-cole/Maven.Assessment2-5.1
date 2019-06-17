package rocks.zipcode.assessment2.collections;

import java.util.*;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    private List<String> strs=new ArrayList<>(0);
    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        this.strs=strings;
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        this.strs = new ArrayList<String>(0);
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        this.strs.add(item);
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {

        this.strs.remove(item);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        return Collections.frequency(this.strs,item);
    }
}
