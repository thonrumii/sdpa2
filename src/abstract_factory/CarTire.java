package abstract_factory;
public class CarTire implements Tire {
    @Override
    public void getSpecification() {
        System.out.println("All-season car tires");
    }
}
