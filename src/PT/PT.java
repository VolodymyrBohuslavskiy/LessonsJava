package PT;

abstract class PT extends All{
    private double powerUP;

    public PT(String serialNumber, boolean garanty, double powerUP) {
        super(serialNumber, garanty);
        this.powerUP = powerUP;
    }

    public double getPowerUP() {
        return powerUP;
    }

    public void setPowerUP(double powerUP) {
        this.powerUP = powerUP;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PT)) return false;

        PT pt = (PT) o;

        return Double.compare(pt.powerUP, powerUP) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(powerUP);
        return (int) (temp ^ (temp >>> 32));
    }
}
