
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gisne
 */
public class UserInterface {

    private Scanner scanner;
    private Container container;

    public UserInterface(Container container, Scanner scanner) {
        this.container = container;
        this.scanner = scanner;
    }
    public void start() {
        int container1 = 0;
        int container2 = 0;

        while (true) {
            
            System.out.println("First: " + container1 + "/100");
            System.out.println("Second: " + container2 + "/100");
//            this.liquidContainers.print();
//            System.out.println("Container: " + container + "/100");

            System.out.print("> ");
            String command = scanner.nextLine();
            if (command.equals("quit")) {
                break;
            }

            String[] parts = command.split(" ");

            String input = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (input .equals("add") && amount > 0) {                
                this.container.add(amount);
//                this.container.print();
            
            } else if (input .equals("remove") && amount > 0) {                
                this.container.remove(amount);
//                this.container.print();
            }
        }
    }

}
