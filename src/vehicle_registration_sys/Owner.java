package vehicle_registration_sys;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class Owner {
    private String ownerName;
    private List<Vehicle> vehicleList;

    public Owner(String ownerName) {
        this.ownerName = ownerName;
        this.vehicleList = new ArrayList<>();
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void addVehicle(Vehicle vehicle){
//        vehicle.setOwner(owner);
        this.vehicleList.add(vehicle);
    }
    public List<Vehicle> getVehicleList(){
        return vehicleList;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "ownerName='" + ownerName + '\'' +
                ", vehicleList=" + vehicleList.toString() +
                '}';
    }
}