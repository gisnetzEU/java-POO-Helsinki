
import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GradeRegister register = new GradeRegister();
        register.addGradeBasedOnPoints(82);
        register.addGradeBasedOnPoints(83);
        register.addGradeBasedOnPoints(96);
        register.addGradeBasedOnPoints(51);
        register.addGradeBasedOnPoints(48);
        register.addGradeBasedOnPoints(56);
        register.addGradeBasedOnPoints(61);        

        UserInterface userInterface = new UserInterface(register, scanner);        
        userInterface.start();
        
        System.out.println("The average of points: " + register.averageOfPoints());
        System.out.println("The average of grades: " + register.averageOfGrades());
    }
}
