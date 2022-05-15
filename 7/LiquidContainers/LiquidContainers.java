
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int container1 = 0;
        int container2 = 0;

        while (true) {

            System.out.println("First: " + container1 + "/100");
            System.out.println("Second: " + container2 + "/100");
            System.out.print("> ");
            
            String command = scanner.nextLine();
            if (command.equals("quit")) {
                break;
            }
            
            String[] parts = command.split(" ");

            String input = parts[0];
            int amount = Integer.valueOf(parts[1]);           

            if (input.equals("add") && amount > 0) {

                if ((amount <= 100) && (container1 + amount <= 100)) {
                    container1 = container1 + amount;
                } else if (container1 + amount > 100) {
                    container1 = 100;
                } else if (amount > 100) {
                    container1 = 100;
                }

            } else if (input.equals("move") && amount > 0) {

                if (amount > container1) {
                    amount = container1;
                }

                container1 = container1 - amount;
                container2 = container2 + amount;

                if (container2 > 100) {
                    container2 = 100;
                }

            } else if (input.equals("remove") && amount > 0) {
                container2 = container2 - amount;
                if (container2 < 0) {
                    container2 = 0;
                }
            } 

        }
    }
}
