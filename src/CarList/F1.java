package CarList;


public class F1 extends Sport{
    String actualytySeason;

    public F1(String vin, int topspeed, double acseleration, String sponsor, String pilotName, boolean solodWay, String actualytySeason) {
        super(vin, topspeed, acseleration, sponsor, pilotName, solodWay);
        this.actualytySeason = actualytySeason;
    }

    public String getActualytySeason() {
        return actualytySeason;
    }

    public void setActualytySeason(String actualytySeason) {
        this.actualytySeason = actualytySeason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof F1)) return false;
        if (!super.equals(o)) return false;

        F1 f1 = (F1) o;

        return actualytySeason.equals(f1.actualytySeason);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + actualytySeason.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "F1{" +
                "actualytySeason='" + actualytySeason + '\'' +
                '}';
    }
}
