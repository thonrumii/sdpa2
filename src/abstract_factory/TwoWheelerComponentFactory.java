package abstract_factory;
public class TwoWheelerComponentFactory implements VehicleComponentFactory {
    @Override
    public Engine createEngine() {
        return new BikeEngine();
    }
    @Override
    public Tire createTire() {
        return new BikeTire();
    }
}