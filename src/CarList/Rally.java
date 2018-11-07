package CarList;


public class Rally extends Sport{
    String classeOfRaceing;

    public Rally(String vin, int topspeed, double acseleration, String sponsor, String pilotName, boolean solodWay, String classeOfRaceing) {
        super(vin, topspeed, acseleration, sponsor, pilotName, solodWay);
        this.classeOfRaceing = classeOfRaceing;
    }

    public String getClasseOfRaceing() {
        return classeOfRaceing;
    }

    public void setClasseOfRaceing(String classeOfRaceing) {
        this.classeOfRaceing = classeOfRaceing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rally)) return false;
        if (!super.equals(o)) return false;

        Rally rally = (Rally) o;

        return classeOfRaceing.equals(rally.classeOfRaceing);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + classeOfRaceing.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Rally{" +
                "classeOfRaceing='" + classeOfRaceing + '\'' +
                '}';
    }
}
