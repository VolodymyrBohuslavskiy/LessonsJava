package PT;


abstract class PC extends All {
    private int AcamulatorMass;
   private double displaySize;
   private String oC;

    public PC(String serialNumber, boolean garanty, int acamulatorMass, double displaySize, String oC) {
        super(serialNumber, garanty);
        AcamulatorMass = acamulatorMass;
        this.displaySize = displaySize;
        this.oC = oC;
    }

    public int getAcamulatorMass() {
        return AcamulatorMass;
    }

    public void setAcamulatorMass(int acamulatorMass) {
        AcamulatorMass = acamulatorMass;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public String getoC() {
        return oC;
    }

    public void setoC(String oC) {
        this.oC = oC;
    }

    @Override
    public String toString() {
        return "PC{" +
                "AcamulatorMass=" + AcamulatorMass +
                ", displaySize=" + displaySize +
                ", oC='" + oC + '\'' +
                '}';
    }
}
