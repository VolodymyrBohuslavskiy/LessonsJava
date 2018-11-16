package PT;

public class SmatPhone extends PC{
    private double CameraMpx;
    private boolean dualSim;

    public SmatPhone(String serialNumber, boolean garanty, int acamulatorMass, double displaySize, String oC, double cameraMpx, boolean dualSim) {
        super(serialNumber, garanty, acamulatorMass, displaySize, oC);
        CameraMpx = cameraMpx;
        this.dualSim = dualSim;
    }

    public double getCameraMpx() {
        return CameraMpx;
    }

    public void setCameraMpx(double cameraMpx) {
        CameraMpx = cameraMpx;
    }

    public boolean isDualSim() {
        return dualSim;
    }

    public void setDualSim(boolean dualSim) {
        this.dualSim = dualSim;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SmatPhone)) return false;

        SmatPhone smatPhone = (SmatPhone) o;

        if (Double.compare(smatPhone.CameraMpx, CameraMpx) != 0) return false;
        return dualSim == smatPhone.dualSim;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(CameraMpx);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (dualSim ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SmatPhone{" +
                "CameraMpx=" + CameraMpx +
                ", dualSim=" + dualSim +
                '}';
    }

    @Override
    public void DoSone() {
        System.out.println("Call with me !");
    }

    @Override
    public void Star() {
        System.out.println("ololololollo");
    }
}
