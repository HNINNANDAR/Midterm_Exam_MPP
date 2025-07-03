import vehicle_registration_sys.Owner;
import vehicle_registration_sys.Vehicle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Owner owner = new Owner("Thae");
        Owner owner1 = new Owner("Lay");

        Vehicle vehicle = new Vehicle("V001");
        Vehicle vehicle1 = new Vehicle("V002");
        Vehicle vehicle2 = new Vehicle("V003");
        Vehicle vehicle3 = new Vehicle("V004");

        vehicle.setOwner(owner);
        vehicle1.setOwner(owner);
        vehicle2.setOwner(owner1);
        vehicle3.setOwner(owner1);

        owner.addVehicle(vehicle1);
        owner1.addVehicle(vehicle2);
        owner1.addVehicle(vehicle2);
        owner1.addVehicle(vehicle3);

        System.out.println(owner);
        System.out.println(owner1);

    }
}