package Tasks.oop_paradigmas.extend;

public class PersonalComputer extends Computer {

    private int sotsfForRam;
    private boolean OpticalDrive;


    public PersonalComputer(String processor, double frequency, int ram, int rom, boolean garanty) {
        super(processor, frequency, ram, rom, garanty);
    }

    public PersonalComputer(String processor, double frequency, int ram, int rom, boolean garanty, int sotsfForRam, boolean opticalDrive) {
        super(processor, frequency, ram, rom, garanty);
        this.sotsfForRam = sotsfForRam;
        OpticalDrive = opticalDrive;
    }

    public int getSotsfForRam() {
        return sotsfForRam;
    }

    public void setSotsfForRam(int sotsfForRam) {
        this.sotsfForRam = sotsfForRam;
    }

    public boolean isOpticalDrive() {
        return OpticalDrive;
    }

    public void setOpticalDrive(boolean opticalDrive) {
        OpticalDrive = opticalDrive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonalComputer)) return false;
        if (!super.equals(o)) return false;

        PersonalComputer that = (PersonalComputer) o;

        if (sotsfForRam != that.sotsfForRam) return false;
        return OpticalDrive == that.OpticalDrive;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + sotsfForRam;
        result = 31 * result + (OpticalDrive ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PersonalComputer{" +
                "sotsfForRam=" + sotsfForRam +
                ", OpticalDrive=" + OpticalDrive +
                '}';
    }
}
