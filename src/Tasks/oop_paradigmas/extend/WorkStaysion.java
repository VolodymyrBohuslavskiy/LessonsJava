package Tasks.oop_paradigmas.extend;

public class WorkStaysion extends PersonalComputer{
    private String ramType,graphicAdapter;


    public WorkStaysion(String processor, double frequency, int ram, int rom, boolean garanty, int sotsfForRam, boolean opticalDrive, String ramType, String graphicAdapter) {
        super(processor, frequency, ram, rom, garanty, sotsfForRam, opticalDrive);
        this.ramType = ramType;
        this.graphicAdapter = graphicAdapter;
    }

    public String getRamType() {
        return ramType;
    }

    public void setRamType(String ramType) {
        this.ramType = ramType;
    }

    public String getGraphicAdapter() {
        return graphicAdapter;
    }

    public void setGraphicAdapter(String graphicAdapter) {
        this.graphicAdapter = graphicAdapter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WorkStaysion)) return false;
        if (!super.equals(o)) return false;

        WorkStaysion that = (WorkStaysion) o;

        if (!ramType.equals(that.ramType)) return false;
        return graphicAdapter.equals(that.graphicAdapter);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + ramType.hashCode();
        result = 31 * result + graphicAdapter.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "WorkStaysion{" +
                "ramType='" + ramType + '\'' +
                ", graphicAdapter='" + graphicAdapter + '\'' +
                '}';
    }
}
