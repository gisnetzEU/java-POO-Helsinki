
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed? ");        
        String filename= scanner.nextLine();

          // we create a scanner for reading the file
        try(Scanner file = new Scanner(Paths.get(filename))) { 

            // we read the file until all lines have been read
            while (file.hasNextLine()) {
                // we read one line
                String row = file.nextLine();
                // we print the line that we read
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
