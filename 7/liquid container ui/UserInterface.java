
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
    private LiquidContainers liquidContainers;

    public UserInterface(LiquidContainers liquidContainers, Scanner scanner) {
        this.liquidContainers = liquidContainers;
        this.scanner = scanner;
    }

    public void start() {
        
        while (true) {
//            this.liquidContainers.print();
            System.out.println("");
            System.out.println("Commands:");
            System.out.println("add n");
            System.out.println("move n");
            System.out.println("remove n");
            System.out.println("quit");
            String command  = scanner.nextLine();
            String[] parts = command .split(" ");

            String input  = parts[0];
            int amount = 0;
            
            if(parts[1] !=null){
                amount = Integer.valueOf(parts[1]);
            }            
           
            if (input .equals("add") && amount > 0) {                
                this.liquidContainers.addAmount(amount);
                this.liquidContainers.print();
            } else if (input .equals("move")  && amount > 0) {                
                this.liquidContainers.moveAmount(amount);
                this.liquidContainers.print();
            } else if (input .equals("remove") && amount > 0) {                
                this.liquidContainers.removeAmount(amount);
                this.liquidContainers.print();
            } else if (input.equals("quit")) {
                break;
            }
        }
    }

}
