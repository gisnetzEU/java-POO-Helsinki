
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try(Scanner filename = new Scanner(Paths.get(file))) { 
            
            System.out.println("Search for:");
            String searchedFor = scanner.nextLine();
            boolean flag= false;
            
            while (filename.hasNextLine()) {
                
                String row = filename.nextLine();
                
                if( searchedFor.equals(row)){
                    System.out.println("Found!");
                    flag= true;
                    break;
                } else {
                    flag= false;
                    }
      
            }
            if(!flag) System.out.println("Not found.");

        } catch (Exception e) {
            System.out.println("Reading the file nonexistent.txt failed");
        }
        

        

    }
}
