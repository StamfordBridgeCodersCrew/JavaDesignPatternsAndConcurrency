package AdapterDesignPattern;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("WildTurkey gobbles");
    }

    @Override
    public void fly() {
        System.out.println("WildTurkey flies");
    }
}
