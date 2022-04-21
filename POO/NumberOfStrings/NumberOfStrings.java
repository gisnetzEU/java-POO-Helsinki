
import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        ArrayList<String> list = new ArrayList<>();
        int sum=0;
        
        while (true){
        
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }          
            sum++;            
            list.add(input);
        }
        
        System.out.println(sum);      
       
        

    }
}