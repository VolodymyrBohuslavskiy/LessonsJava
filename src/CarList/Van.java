package CarList;

public class Van extends Cargo {
    private boolean pasangerTransport;

    public Van(String vin, int topspeed, double acseleration, double maxWh, double oneKmCost, boolean pasangerTransport) {
        super(vin, topspeed, acseleration, maxWh, oneKmCost);
        this.pasangerTransport = pasangerTransport;
    }

    public boolean isPasangerTransport() {
        return pasangerTransport;
    }

    public void setPasangerTransport(boolean pasangerTransport) {
        this.pasangerTransport = pasangerTransport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Van)) return false;
        if (!super.equals(o)) return false;

        Van van = (Van) o;

        return pasangerTransport == van.pasangerTransport;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (pasangerTransport ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Van{" +
                "pasangerTransport=" + pasangerTransport +
                '}';
    }
}
