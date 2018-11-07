package CarList;

abstract public class Cargo extends Car {
    private double maxWh, oneKmCost;

    public Cargo(String vin, int topspeed, double acseleration, double maxWh, double oneKmCost) {
        super(vin, topspeed, acseleration);
        this.maxWh = maxWh;
        this.oneKmCost = oneKmCost;
    }

    public double getMaxWh() {
        return maxWh;
    }

    public void setMaxWh(double maxWh) {
        this.maxWh = maxWh;
    }

    public double getOneKmCost() {
        return oneKmCost;
    }

    public void setOneKmCost(double oneKmCost) {
        this.oneKmCost = oneKmCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cargo)) return false;
        if (!super.equals(o)) return false;

        Cargo cargo = (Cargo) o;

        if (Double.compare(cargo.maxWh, maxWh) != 0) return false;
        return Double.compare(cargo.oneKmCost, oneKmCost) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(maxWh);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(oneKmCost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "maxWh=" + maxWh +
                ", oneKmCost=" + oneKmCost +
                '}';
    }
}
