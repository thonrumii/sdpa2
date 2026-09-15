package abstract_factory;
public class BikeEngine implements Engine{
    @Override
    public void getSpecification() {
        System.out.println("Engine: Single-Cylinder Engine");
    }
}
