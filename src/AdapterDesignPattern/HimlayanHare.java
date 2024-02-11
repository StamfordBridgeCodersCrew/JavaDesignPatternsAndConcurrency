package AdapterDesignPattern;

public class HimlayanHare implements Rabbit {
    @Override
    public void squeak() {
        System.out.println("Himalayan Hare squeaks");
    }

    @Override
    public void hop() {
        System.out.println("Himalayan Hare hops");
    }
}
