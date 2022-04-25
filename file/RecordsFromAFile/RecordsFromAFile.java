
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Name of the file:");
        String filename= scanner.nextLine();

        try ( Scanner file = new Scanner(Paths.get(filename))) {

            while (file.hasNextLine()) {
                String line = file.nextLine();

                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                
                String time = (age!=1)? "years":"year";

                System.out.println(name+", age: "+age+" "+time);
//                System.out.println("Age: " + age);
            }

            }catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
        }

    }
