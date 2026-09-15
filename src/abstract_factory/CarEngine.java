package abstract_factory;
public class CarEngine implements Engine {
    @Override
    public void getSpecification() {
        System.out.println("Engine: Turbocharged Inline-4 Engine");
    }
}
