package AdapterDesignPattern;

public class BelgianHare implements Rabbit{
    @Override
    public void squeak() {
        System.out.println("Belgian Hare squeaks");
    }

    @Override
    public void hop() {
        System.out.println("Belgian Hare hops");
    }
}
