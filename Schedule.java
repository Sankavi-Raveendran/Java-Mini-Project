package vehicle.main;
import java.util.Objects;

public class Schedule {
    private Date pickUpDate;
    private Date dropOffDate;
    private Vehicle vehicle;

    public Schedule(Date pickUpDate, Date dropOffDate, Vehicle vehicle) {
        this.pickUpDate = pickUpDate;
        this.dropOffDate = dropOffDate;
        this.vehicle = vehicle;
    }


    public Date getPickUpDate() {
        return pickUpDate;
    }

    public void setPickUpDate(Date pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    public Date getDropOffDate() {
        return dropOffDate;
    }

    public void setDropOffDate(Date dropOffDate) {
        this.dropOffDate = dropOffDate;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "pickUpDate=" + pickUpDate +
                ", dropOffDate=" + dropOffDate +
                ", vehicle=" + vehicle +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Schedule schedule = (Schedule) o;
        return Objects.equals(pickUpDate, schedule.pickUpDate) &&
                Objects.equals(dropOffDate, schedule.dropOffDate) &&
                Objects.equals(vehicle, schedule.vehicle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pickUpDate, dropOffDate, vehicle);
    }
}
