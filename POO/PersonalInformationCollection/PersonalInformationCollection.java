
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        Scanner scanner = new Scanner(System.in);
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();        
        
        while (true) {            
            
            String firstName = scanner.nextLine();
            if (firstName.isEmpty()) {
                break;
            }
                   
            String lastName = scanner.nextLine();           
            String identificationNumber = scanner.nextLine();          
            infoCollection.add(new PersonalInformation(firstName, lastName, identificationNumber));      
        }          
        
        for (PersonalInformation personalInfo: infoCollection) {
            System.out.println(personalInfo.getFirstName() +" "+ personalInfo.getLastName());
        }   
       
    }
}
