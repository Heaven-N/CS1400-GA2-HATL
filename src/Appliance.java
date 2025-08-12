import java.util.Random;

public class Appliance {
    private String name;
    private double wattage;
    private double probOn;
    private boolean onStatus;

    // basic constructor
    Appliance (String name, double wattage, double probOn, boolean onStatus) {
        this.name = name;
        this.wattage = wattage;
        this.probOn = probOn;
        this.onStatus = onStatus;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWattage(double wattage) {
        this.wattage = wattage;
    }

    public void setProbOn(double probOn) {
        this.probOn = probOn;
    }

    public void setOnStatus(boolean onStatus) {
        this.onStatus = onStatus;
    }

    public String getName() {
        return name;
    }

    public double getWattage() {
        return wattage;
    }

    public double getProbOn() {
        return probOn;
    }

    public boolean getOnStatus() {
        return onStatus;
    }

    // TODO randomiseIsOn(), getWattageUse(), toString()

    public boolean randomiseIsOn(){
        Random random = new Random();
        onStatus = random.nextDouble() , probOn;
        return onStatus;
    }

    public double getWattageUse(){
        return onStatus ? wattage : 0.0;
    }
}
