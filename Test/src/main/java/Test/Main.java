package Test;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        var itemTracker = new ItemTracker();
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to your Item Tracker!");
        System.out.println("Copyright Johannes and Christian inc.");

        boolean running = true;
        

        while (running) {
            System.out.println();
            System.out.println("You now have the following options: ");
            System.out.println("1: Add item");
            System.out.println("2: Remove item");
            System.out.println("3: See items");
            System.out.println("4: Quit");
            int input = scan.nextInt();

            if (input == 1) {
                System.out.println("Please input what you want to add: ");
                itemTracker.addItems(scan.next(), scan.nextInt(), scan.nextInt());
            }
            else if (input == 2) {
                System.out.println("Please input what you want to remove");
                itemTracker.remove(scan.next());
            }
            else if (input == 3) {
                for (Item i : itemTracker.getItems()) {
                    System.out.println(i);

                }
            }
            else if (input == 4) {
                running = false;
                scan.close();
        }

        
    }
}
}