
import java.util.ArrayList;

public class LiquidContainers {

    private int container1;
    private int container2;

    public LiquidContainers() {
        this.container1 = 0;
        this.container2 = 0;
    }

    public void addAmount(int amount) {

        if ((amount <= 100) && (this.container1 + amount <= 100)) {
            this.container1 = container1 + amount;
        } else if (this.container1 + amount > 100) {
            this.container1 = 100;
        } else if (amount > 100) {
            this.container1 = 100;
        }

    }

    public void moveAmount(int amount) {

        if (amount > container1) {
            amount = container1;
        }

        container1 = container1 - amount;
        container2 = container2 + amount;

        if (container2 > 100) {
            container2 = 100;
        }

    }

    public void removeAmount(int amount) {
        this.container2 = container2 - amount;
        if (this.container2 < 0) {
            this.container2 = 0;
        }

    }

    public void print() {
        System.out.println("First:" + container1 + "/100");
        System.out.println("Second:" + container2 + "/100");

    }

}
