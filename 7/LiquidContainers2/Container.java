/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gisne
 */
public class Container {

    int container1 = 0;
    int container2 = 0;

    public Container() {
        this.container1 = 0;
        this.container2 = 0;
    }

    public int contains() {
        return container1;
    }

    public void add(int amount) {

        if ((amount <= 100) && (this.container1 + amount <= 100)) {
            this.container1 = container1 + amount;
        } else if (this.container1 + amount > 100) {
            this.container1 = 100;
        } else if (amount > 100) {
            this.container1 = 100;
        }

    }

    public void remove(int amount) {
        this.container1 = container1 - amount;
        if (this.container1 < 0) {
            this.container1 = 0;
        }

    }

    @Override
    public String toString() {
        return container1 + "/100";
    }

}
