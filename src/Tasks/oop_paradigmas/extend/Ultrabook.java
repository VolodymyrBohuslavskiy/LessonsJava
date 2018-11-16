package Tasks.oop_paradigmas.extend;


public class Ultrabook extends Laptop{
protected String color;
protected boolean kayboardLight;

    public Ultrabook(String processor, double frequency, int ram, int rom, boolean garanty, int sotsfForRam, boolean opticalDrive, String ramType, String graphicAdapter, boolean hasBatarey, double monitorDiagonal, String color, boolean kayboardLight) {
        super(processor, frequency, ram, rom, garanty, sotsfForRam, opticalDrive, ramType, graphicAdapter, hasBatarey, monitorDiagonal);
        this.color = color;
        this.kayboardLight = kayboardLight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isKayboardLight() {
        return kayboardLight;
    }

    public void setKayboardLight(boolean kayboardLight) {
        this.kayboardLight = kayboardLight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ultrabook)) return false;
        if (!super.equals(o)) return false;

        Ultrabook ultrabook = (Ultrabook) o;

        if (kayboardLight != ultrabook.kayboardLight) return false;
        return color.equals(ultrabook.color);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + color.hashCode();
        result = 31 * result + (kayboardLight ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Ultrabook{" +
                "color='" + color + '\'' +
                ", kayboardLight=" + kayboardLight +
                '}';
    }
}
