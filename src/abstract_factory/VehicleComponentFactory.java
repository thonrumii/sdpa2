package abstract_factory;
public interface VehicleComponentFactory {
    Engine createEngine();
    Tire createTire();
}
