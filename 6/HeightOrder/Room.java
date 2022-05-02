
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gisne
 */
public class Room {

    private ArrayList<Person> persons = new ArrayList<Person>();

    public Room() {
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {        
        
        if(this.persons.isEmpty()){
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public Person shortest() {
        if (persons.isEmpty()) {
            return null;
        }

        Person shortest = persons.get(0); 
        for (Person person : persons) {
            shortest = shortest.getHeight() < person.getHeight() ? shortest : person;
        }
        return shortest;
    }
    
    public Person take(){
        if (persons.isEmpty()) {
            return null;
        }
        
        Person shortest = persons.get(0); 
        for (Person person : persons) {
            shortest = shortest.getHeight() < person.getHeight() ? shortest : person;
        }        
        
        this.persons.remove(shortest);
        
      return shortest;
        
    }
}
