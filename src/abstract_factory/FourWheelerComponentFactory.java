package abstract_factory;
public class FourWheelerComponentFactory implements VehicleComponentFactory {
    @Override
    public Engine createEngine() {
        return new CarEngine();
    }
    @Override
    public Tire createTire() {
        return new CarTire();
    }
}
