package PT;

public class NoteBook extends PC {
    private String prosesor;
    private int ram;

    public NoteBook(String serialNumber, boolean garanty, int acamulatorMass, double displaySize, String oC, String prosesor, int ram) {
        super(serialNumber, garanty, acamulatorMass, displaySize, oC);
        this.prosesor = prosesor;
        this.ram = ram;
    }

    public String getProsesor() {
        return prosesor;
    }

    public void setProsesor(String prosesor) {
        this.prosesor = prosesor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NoteBook)) return false;

        NoteBook noteBook = (NoteBook) o;

        if (ram != noteBook.ram) return false;
        return prosesor.equals(noteBook.prosesor);
    }

    @Override
    public int hashCode() {
        int result = prosesor.hashCode();
        result = 31 * result + ram;
        return result;
    }

    @Override
    public void DoSone() {
        System.out.println("Let's play dude !");
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "prosesor='" + prosesor + '\'' +
                ", ram=" + ram +
                '}';
    }

    @Override
    public void Star() {

    }
}
