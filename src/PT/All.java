package PT;


abstract public class All implements Work,I_ololololol{
private String serialNumber;
private boolean garanty;

    protected All(String serialNumber, boolean garanty) {
        this.serialNumber = serialNumber;
        this.garanty = garanty;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public boolean isGaranty() {
        return garanty;
    }

    public void setGaranty(boolean garanty) {
        this.garanty = garanty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof All)) return false;

        All all = (All) o;

        if (garanty != all.garanty) return false;
        return serialNumber.equals(all.serialNumber);
    }

    @Override
    public int hashCode() {
        int result = serialNumber.hashCode();
        result = 31 * result + (garanty ? 1 : 0);
        return result;
    }
}
