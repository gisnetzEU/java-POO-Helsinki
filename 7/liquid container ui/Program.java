
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
public class Program {

    public static void main(String[] args) {

        LiquidContainers liquidContainer = new LiquidContainers();
        Scanner scanner = new Scanner(System.in);
        
//        liquidContainer.addAmount(5);
//        liquidContainer.moveAmount(5);
//        liquidContainer.removeAmount(5);
        
        UserInterface ui = new UserInterface(liquidContainer, scanner);
        ui.start();

    }

}
