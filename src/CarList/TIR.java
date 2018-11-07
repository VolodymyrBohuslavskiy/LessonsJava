package CarList;


public class TIR extends Cargo {
    boolean sleepPlase;

    public TIR(String vin, int topspeed, double acseleration, double maxWh, double oneKmCost, boolean sleepPlase) {
        super(vin, topspeed, acseleration, maxWh, oneKmCost);
        this.sleepPlase = sleepPlase;
    }

    public boolean isSleepPlase() {
        return sleepPlase;
    }

    public void setSleepPlase(boolean sleepPlase) {
        this.sleepPlase = sleepPlase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TIR)) return false;
        if (!super.equals(o)) return false;

        TIR tir = (TIR) o;

        return sleepPlase == tir.sleepPlase;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (sleepPlase ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TIR{" +
                "sleepPlase=" + sleepPlase +
                '}';
    }
}
