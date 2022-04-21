import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        ArrayList<Book> libros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true){
        
            String title = scanner.nextLine();
            if (title.isEmpty()){
                break;
            }
            
            int pages = Integer.valueOf(scanner.nextLine());            
            int year = Integer.valueOf(scanner.nextLine());
            
            libros.add(new Book(title, pages, year));
        }
        
        System.out.println();
        System.out.println("What information will be printed? ");
        String input = scanner.nextLine();
        
        if(input.equals("everything")){        
            for (Book book: libros) {                
                System.out.println(book.getTitle()+", "+book.getPages()+" pages, "+ book.getYear());                
            }
        } else if(input.equals("name")){
            for (Book book: libros) {                
                System.out.println(book.getTitle());                
            }
        }


    }
}
