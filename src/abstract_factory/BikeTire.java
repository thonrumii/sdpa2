package abstract_factory;
public class BikeTire implements Tire {
    @Override
    public void getSpecification() {
        System.out.println("Motorcycle tires");
    }
}
