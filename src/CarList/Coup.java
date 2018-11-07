package CarList;


public class Coup extends Civil {
boolean toPlusTwoPlases;

    public Coup(String vin, int topspeed, double acseleration, String color, double rozhid, int tankMass, int plase, boolean toPlusTwoPlases) {
        super(vin, topspeed, acseleration, color, rozhid, tankMass, plase);
        this.toPlusTwoPlases = toPlusTwoPlases;
    }

    public boolean isToPlusTwoPlases() {
        return toPlusTwoPlases;
    }

    public void setToPlusTwoPlases(boolean toPlusTwoPlases) {
        this.toPlusTwoPlases = toPlusTwoPlases;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coup)) return false;
        if (!super.equals(o)) return false;

        Coup coup = (Coup) o;

        return toPlusTwoPlases == coup.toPlusTwoPlases;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (toPlusTwoPlases ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Coup{" +
                "toPlusTwoPlases=" + toPlusTwoPlases +
                '}';
    }
}
