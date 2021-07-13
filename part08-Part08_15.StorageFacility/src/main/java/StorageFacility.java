import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storageFacility;

    public StorageFacility() {
        this.storageFacility = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storageFacility.putIfAbsent(unit, new ArrayList<>());

        ArrayList<String> unitList = this.storageFacility.get(unit);
        unitList.add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        for (String unit: storageFacility.keySet()) {
            if (unit.equals(storageUnit)) {
                return storageFacility.get(unit);
            }
        }
        return new ArrayList<>();
    }

    public void remove(String storageUnit, String item) {
        this.storageFacility.get(storageUnit).remove(item);

        if (this.storageFacility.get(storageUnit).isEmpty()) {
            this.storageFacility.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> returnArrayList = new ArrayList<>();

        returnArrayList.addAll(storageFacility.keySet());

        return returnArrayList;
    }
}
