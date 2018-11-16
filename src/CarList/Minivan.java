package CarList;

public class Minivan extends Civil{
    String typeEngen;

    public Minivan(String vin, int topspeed, double acseleration, String color, double rozhid, int tankMass, int plase, String diselEngen) {
        super(vin, topspeed, acseleration, color, rozhid, tankMass, plase);
        this.typeEngen = diselEngen;
    }

    public String getTypeEngen() {
        return typeEngen;
    }

    public void setTypeEngen(String typeEngen) {
        this.typeEngen = typeEngen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Minivan)) return false;
        if (!super.equals(o)) return false;

        Minivan minivan = (Minivan) o;

        return typeEngen.equals(minivan.typeEngen);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + typeEngen.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Minivan{" +
                "typeEngen='" + typeEngen + '\'' +
                '}';
    }
}
