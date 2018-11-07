package CarList;

abstract public class Civil extends Car {

    private String color;
    private double rozhid;
    private int tankMass, plase;

    public Civil(String vin, int topspeed, double acseleration, String color, double rozhid, int tankMass, int plase) {
        super(vin, topspeed, acseleration);
        this.color = color;
        this.rozhid = rozhid;
        this.tankMass = tankMass;
        this.plase = plase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRozhid() {
        return rozhid;
    }

    public void setRozhid(double rozhid) {
        this.rozhid = rozhid;
    }

    public int getTankMass() {
        return tankMass;
    }

    public void setTankMass(int tankMass) {
        this.tankMass = tankMass;
    }

    public int getPlase() {
        return plase;
    }

    public void setPlase(int plase) {
        this.plase = plase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Civil)) return false;
        if (!super.equals(o)) return false;

        Civil civil = (Civil) o;

        if (Double.compare(civil.rozhid, rozhid) != 0) return false;
        if (tankMass != civil.tankMass) return false;
        if (plase != civil.plase) return false;
        return color.equals(civil.color);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + color.hashCode();
        temp = Double.doubleToLongBits(rozhid);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + tankMass;
        result = 31 * result + plase;
        return result;
    }
}
