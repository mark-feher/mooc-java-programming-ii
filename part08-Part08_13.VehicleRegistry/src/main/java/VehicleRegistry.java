import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> vehicleRegistry;

    public VehicleRegistry() {
        this.vehicleRegistry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        for (LicensePlate liPlate: vehicleRegistry.keySet()) {
            if (liPlate.equals(licensePlate)) {
                return false;
            }
        }

        vehicleRegistry.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return vehicleRegistry.getOrDefault(licensePlate, null);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (!vehicleRegistry.containsKey(licensePlate)) {
            return false;
        } else {
            vehicleRegistry.remove(licensePlate);
        }
        return true;
    }

    public void printLicensePlates() {
        for (LicensePlate licensePlate: vehicleRegistry.keySet()) {
            System.out.println(licensePlate);
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();

        for (String owner: vehicleRegistry.values()) {
            if (!owners.contains(owner)) {
                owners.add(owner);
            }
        }
        for (String owner: owners) {
            System.out.println(owner);
        }
    }
}
