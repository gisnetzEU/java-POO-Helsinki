
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        LiquidContainers2 liquidContainer = new LiquidContainers2();
        Container container = new Container();
//        System.out.println(container);
//
//        container.add(50);
//        System.out.println(container);
//        System.out.println(container.contains());
//
//        container.remove(60);
//        System.out.println(container);
//
//        container.add(200);
//        System.out.println(container);
        
        UserInterface ui = new UserInterface(container, scan);
        ui.start();

      
    }

}
