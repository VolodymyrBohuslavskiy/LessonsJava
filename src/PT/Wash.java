package PT;

public class Wash extends PT{
    private int rpm;
    private boolean isDisplay;

    public Wash(String serialNumber, boolean garanty, double powerUP, int rpm, boolean isDisplay) {
        super(serialNumber, garanty, powerUP);
        this.rpm = rpm;
        this.isDisplay = isDisplay;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public boolean isDisplay() {
        return isDisplay;
    }

    public void setDisplay(boolean display) {
        isDisplay = display;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wash)) return false;
        if (!super.equals(o)) return false;

        Wash wash = (Wash) o;

        if (rpm != wash.rpm) return false;
        return isDisplay == wash.isDisplay;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + rpm;
        result = 31 * result + (isDisplay ? 1 : 0);
        return result;
    }

    @Override
    public void DoSone() {
        System.out.println("I wash !");
    }

    @Override
    public void Star() {

    }
}
