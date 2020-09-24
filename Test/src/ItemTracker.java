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


    public static void main(String[] args) throws Exception {
        System.out.println("Hej Johannes");
    }
}
