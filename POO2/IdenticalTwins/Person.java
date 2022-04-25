
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

//         if the compared object is not of type Person, the objects are not equal
        if (!(compared instanceof Person)) {
            return false;
        }

        // convert the object into a Person object
        Person comparedPerson = (Person) compared;

        // if the values of the object variables are equal, the objects are equal
        if (this.name.equals(comparedPerson.name)
                && this.birthday.equals(comparedPerson.birthday)
                && this.height == comparedPerson.height
                && this.weight == comparedPerson.weight) {
            return true;
        }

        // otherwise the objects are not equal
        return false;

//        if (compared == null || this.getClass() != compared.getClass()) {
//            return false;
//        }
//
//        boolean nameFlag = false;
//        boolean birthdayFlag = false;
//        boolean heightFlag = false;
//        boolean weightFlag = false;
//
//        // if the values of the object varialbes are equal, the objects are equal
//        // name, birthdate, height, weight
//        if (this.name.equals(compared.getName())) {
//            nameFlag = true;
//        }
//
//        if (this.birthday.equals(compared.getBirthday())) {
//            birthdayFlag = true;
//        }
//
//        if (this.height == compared.getHeight()) {
//            heightFlag = true;
//        }
//
//        if (this.weight == compared.getWeight()) {
//            weightFlag = true;
//        }
//
//        if (nameFlag == true && birthdayFlag == true && heightFlag == true
//                && weightFlag == true) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public String getName() {
//        return this.name;
//    }
//
//    public SimpleDate getBirthday() {
//        return this.birthday;
//    }
//
//    public int getWeight() {
//        return this.weight;
//    }
//
//    public int getHeight() {
//        return this.height;
//    }
    }
}
