
import java.util.ArrayList;

/**
 *
 * @author gisne
 */
public class Paquete {

    private ArrayList<Gift> gifts = new ArrayList<>();

    public Paquete() {
    }

    public void addGift(Gift gift) {
        gifts.add(gift);
    }

    public int totalWeight(Gift gift) {
        int weight = 0;
        weight += gift.getWeight();
        return weight; 
    }

}
