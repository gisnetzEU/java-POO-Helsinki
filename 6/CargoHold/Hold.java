
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumne_mati1
 */
public class Hold {

    private int maximWeight;
    private ArrayList <Suitcase>suitcases = new ArrayList<>();
    private int total;
    private int weight;
    
    public Hold(int maximWeight) {
        this.maximWeight= maximWeight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        
        this.total = this.total  + suitcase.totalWeight();
        if (this.total <= maximWeight) {
            suitcases.add(suitcase);
            this.weight = this.weight + suitcase.totalWeight();
        }
    }
    
    public void printItems(){
        for(Suitcase suitcase: suitcases){
            System.out.println(suitcase);
        }
    }
 
    public String toString(){
        return suitcases.size() + " suitcases ("+this.total +" kg)";
    }
}
