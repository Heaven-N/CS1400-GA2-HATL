import java.util.ArrayList;

public class Location {
    private int locationID;
    private ArrayList<Appliance> appliances = new ArrayList<>();

    Location(int locationID) {
        this.locationID = locationID;
    }

    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

    public int getLocationID() {
        return locationID;
    }

    public void addAppliance (Appliance appliance) {
        appliances.add(appliance);
    }

    // TODO getWattageUse(), toString(), brownOut(boolean)
    //  other functionality for interacting with applainces ArrayList
}
