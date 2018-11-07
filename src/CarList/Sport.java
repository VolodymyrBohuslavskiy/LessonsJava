package CarList;

abstract public class Sport extends Car{
    private String sponsor, pilotName;
    private boolean solidWay;

    public Sport(String vin, int topspeed, double acseleration, String sponsor, String pilotName, boolean solodWay) {
        super(vin, topspeed, acseleration);
        this.sponsor = sponsor;
        this.pilotName = pilotName;
        this.solidWay = solodWay;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public String getPilotName() {
        return pilotName;
    }

    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }

    public boolean isSolidWay() {
        return solidWay;
    }

    public void setSolidWay(boolean solidWay) {
        this.solidWay = solidWay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sport)) return false;
        if (!super.equals(o)) return false;

        Sport sport = (Sport) o;

        if (solidWay != sport.solidWay) return false;
        if (!sponsor.equals(sport.sponsor)) return false;
        return pilotName.equals(sport.pilotName);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + sponsor.hashCode();
        result = 31 * result + pilotName.hashCode();
        result = 31 * result + (solidWay ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Sport{" +
                "sponsor='" + sponsor + '\'' +
                ", pilotName='" + pilotName + '\'' +
                ", solidWay=" + solidWay +
                '}';
    }
}
