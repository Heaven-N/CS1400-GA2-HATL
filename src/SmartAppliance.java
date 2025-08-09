public class SmartAppliance extends Appliance{
    private boolean lowStatus;
    private double reductionPercent;

    SmartAppliance(String name, double wattage, double probOn, boolean onStatus, boolean lowStatus, double reductionPercent) {
        super(name, wattage, probOn, onStatus);
        this.lowStatus = lowStatus;
        this.reductionPercent = reductionPercent;
    }

    public void setLowStatus(boolean lowStatus) {
        this.lowStatus = lowStatus;
    }

    public void setReductionPercent(double reductionPercent) {
        this.reductionPercent = reductionPercent;
    }

    public boolean getLowStatus() {
        return lowStatus;
    }

    public double getReductionPercent() {
        return reductionPercent;
    }

    // TODO getWattageUse(), toString()
}
