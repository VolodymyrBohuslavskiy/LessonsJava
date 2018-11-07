package CarList;

abstract class Car {
    private String vin;
    private int topspeed;
    private double acseleration;

    public Car(String vin, int topspeed, double acseleration) {
        this.vin = vin;
        this.topspeed = topspeed;
        this.acseleration = acseleration;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getTopspeed() {
        return topspeed;
    }

    public void setTopspeed(int topspeed) {
        this.topspeed = topspeed;
    }

    public double getAcseleration() {
        return acseleration;
    }

    public void setAcseleration(double acseleration) {
        this.acseleration = acseleration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (topspeed != car.topspeed) return false;
        if (Double.compare(car.acseleration, acseleration) != 0) return false;
        return vin.equals(car.vin);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = vin.hashCode();
        result = 31 * result + topspeed;
        temp = Double.doubleToLongBits(acseleration);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vin='" + vin + '\'' +
                ", topspeed=" + topspeed +
                ", acseleration=" + acseleration +
                '}';
    }
}
