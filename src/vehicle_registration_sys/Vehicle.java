package vehicle_registration_sys;

/**
 * 
 */
public class Vehicle {
    private String vehicleNo;
    private Owner owner;

    public Vehicle(String vehicleNo) {
        this.vehicleNo = vehicleNo;
//        this.owner = owner;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner){
        if(this.owner != null)
            throw new IllegalArgumentException("This vehicle already have an owner!");
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleNo='" + vehicleNo + '\'' +
                ", owner=" + owner.getOwnerName() +
                '}';
    }
}