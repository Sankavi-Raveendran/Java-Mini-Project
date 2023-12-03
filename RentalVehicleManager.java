package vehicle.main;
import java.util.List;

public interface RentalVehicleManager {
    public void add(Vehicle vehicle);
    public boolean delete(Vehicle vehicle);
    public List<Vehicle> list();
    public void save();
    public boolean exsits(String numberPlate);
}
