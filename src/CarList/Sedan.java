package CarList;


public class Sedan extends Civil {
   private String category;

    public Sedan(String vin, int topspeed, double acseleration, String color, double rozhid, int tankMass, int plase, String category) {
        super(vin, topspeed, acseleration, color, rozhid, tankMass, plase);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sedan)) return false;
        if (!super.equals(o)) return false;

        Sedan sedan = (Sedan) o;

        return category.equals(sedan.category);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + category.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "category='" + category + '\'' +
                '}';
    }
}
