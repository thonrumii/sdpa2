package abstract_factory;
import factory_method.*;
public class Client {
    private final Engine engine;
    private final Tire tire;
    public Client(VehicleComponentFactory factory) {
        this.engine = factory.createEngine();
        this.tire = factory.createTire();
    }
    public void displaySpecifications() {
        engine.getSpecification();
        tire.getSpecification();
    }
    public static void main(String[] args) {
        System.out.println("Factory Method: ");
        VehicleFactory twoWheelerCreator = new TwoWheelerFactory();
        twoWheelerCreator.deliverVehicle();
        VehicleFactory fourWheelerCreator = new FourWheelerFactory();
        fourWheelerCreator.deliverVehicle();

        System.out.println("Abstract Factory: ");
        System.out.println("Two-Wheeler:");
        Client bikeClient = new Client(new TwoWheelerComponentFactory());
        bikeClient.displaySpecifications();
        System.out.println("\nFour-Wheeler: ");
        Client carClient = new Client(new FourWheelerComponentFactory());
        carClient.displaySpecifications();
    }
}