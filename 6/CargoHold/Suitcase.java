
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
public class Suitcase {

    private int weight;
    private ArrayList<Item> items = new ArrayList<>();
    private int sum;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.sum = this.sum + item.getWeight();
        if (this.sum <= maximumWeight) {
            items.add(item);
            this.weight = this.weight + item.getWeight();
        }
    }   

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        return this.weight;
    }

    public void printGoods() {

    }

    public Item heaviestItem() {

        if (items.isEmpty()) {
            return null;
        }

        Item heaviest = items.get(0);
        for (Item item : items) {
            heaviest = heaviest.getWeight() > item.getWeight() ? heaviest : item;

        }
        return heaviest;
    }
    
    public String toString() {
        if (items.size() == 0) {
            return "no items (0 kg)";
        } else if (items.size() == 1) {
            return items.size() + " item (" + this.weight + " kg)";
        } else {

            return items.size() + " items (" + this.weight + " kg)";
        }
    }
    
    

}
