
public class Main {

    public static void main(String[] args) {

        // use this main method to try out your classes!
        Gift book = new Gift("Harry Potter and the philosoper's stone", 2);     

        Paquete paquete = new Paquete();
        paquete.addGift(book);
        System.out.println(paquete.totalWeight(book));

    }
}
