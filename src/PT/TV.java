package PT;

public class TV extends PT {
    private double giagonal;
    private boolean isSmart;

    public TV(String serialNumber, boolean garanty, double powerUP, double giagonal, boolean isSmart) {
        super(serialNumber, garanty, powerUP);
        this.giagonal = giagonal;
        this.isSmart = isSmart;
    }

    public double getGiagonal() {
        return giagonal;
    }

    public void setGiagonal(double giagonal) {
        this.giagonal = giagonal;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TV)) return false;
        if (!super.equals(o)) return false;

        TV tv = (TV) o;

        if (Double.compare(tv.giagonal, giagonal) != 0) return false;
        return isSmart == tv.isSmart;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(giagonal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (isSmart ? 1 : 0);
        return result;
    }

    @Override
    public void DoSone() {
        System.out.println("Watch me !");
    }

    @Override
    public void Star() {

    }
}
