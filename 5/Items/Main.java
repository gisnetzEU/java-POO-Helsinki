
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         ArrayList<Item> items = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if (id.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            Item item = new Item(id, name);
            items.add(item);

//            if (!(items.contains(item))) {
//                
//            } else {
//                System.out.println("The book is already on the list. Let's not add the same book again.");
//            }
            
        }

        // NB! Don't alter the line below!
        System.out.println("==Items==");
        System.out.println(items);


    }
}
