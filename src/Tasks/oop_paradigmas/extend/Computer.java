package Tasks.oop_paradigmas.extend;

/**
 * Created by Володя on 05.11.2018.
 */
public class Computer {
    protected String processor;
    protected double frequency;
    protected int ram,rom;
    protected boolean garanty;

    public Computer(String processor, double frequency, int ram, int rom, boolean garanty) {
        this.processor = processor;
        this.frequency = frequency;
        this.ram = ram;
        this.rom = rom;
        this.garanty = garanty;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
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
        if (!(o instanceof Computer)) return false;

        Computer computer = (Computer) o;

        if (Double.compare(computer.frequency, frequency) != 0) return false;
        if (ram != computer.ram) return false;
        if (rom != computer.rom) return false;
        if (garanty != computer.garanty) return false;
        return processor.equals(computer.processor);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = processor.hashCode();
        temp = Double.doubleToLongBits(frequency);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + ram;
        result = 31 * result + rom;
        result = 31 * result + (garanty ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", frequency=" + frequency +
                ", ram=" + ram +
                ", rom=" + rom +
                ", garanty=" + garanty +
                '}';
    }
}
