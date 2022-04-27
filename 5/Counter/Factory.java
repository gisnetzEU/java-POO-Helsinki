public class Factory {
    private String make;

    public Factory(String make) {
        this.make = make;
    }

    public Car procuceCar() {
        return new Car(this.make);
    }
}