package Tasks.oop_paradigmas.extend;


public class Laptop extends WorkStaysion{
    public Laptop(String processor, double frequency, int ram, int rom, boolean garanty, int sotsfForRam, boolean opticalDrive, String ramType, String graphicAdapter) {
        super(processor, frequency, ram, rom, garanty, sotsfForRam, opticalDrive, ramType, graphicAdapter);
    }
    protected boolean hasBatarey;
    protected double monitorDiagonal;

    public Laptop(String processor, double frequency, int ram, int rom, boolean garanty, int sotsfForRam, boolean opticalDrive, String ramType, String graphicAdapter, boolean hasBatarey, double monitorDiagonal) {
        super(processor, frequency, ram, rom, garanty, sotsfForRam, opticalDrive, ramType, graphicAdapter);
        this.hasBatarey = hasBatarey;
        this.monitorDiagonal = monitorDiagonal;
    }

    public boolean isHasBatarey() {
        return hasBatarey;
    }

    public void setHasBatarey(boolean hasBatarey) {
        this.hasBatarey = hasBatarey;
    }

    public double getMonitorDiagonal() {
        return monitorDiagonal;
    }

    public void setMonitorDiagonal(double monitorDiagonal) {
        this.monitorDiagonal = monitorDiagonal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;
        if (!super.equals(o)) return false;

        Laptop laptop = (Laptop) o;

        if (hasBatarey != laptop.hasBatarey) return false;
        return Double.compare(laptop.monitorDiagonal, monitorDiagonal) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + (hasBatarey ? 1 : 0);
        temp = Double.doubleToLongBits(monitorDiagonal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "hasBatarey=" + hasBatarey +
                ", monitorDiagonal=" + monitorDiagonal +
                '}';
    }
}
