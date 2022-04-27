
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
public class Stack {
    
private ArrayList<String> stack = new ArrayList<String>();

    public boolean isEmpty(){
        if(this.stack.isEmpty()){
            return true;
        }
        return false;
    }
    
    public void add(String value){
        this.stack.add(value);
    }
    
    public ArrayList<String> values(){
        ArrayList values= new ArrayList<String>();
        
        return values;
    }
    
    public String take(){
//        this.Stack.remove(Stack.size());
        return this.stack.remove(stack.size()-1);
    }
}
