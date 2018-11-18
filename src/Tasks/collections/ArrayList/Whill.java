package Tasks.collections.ArrayList;

//        - Колесо (к)
//        -виробник
//        -діаметр

public class Whill {
private String whillBrand;
private int size;

    public Whill(String whillBrand, int size) {
        this.whillBrand = whillBrand;
        this.size = size;
    }

    public String getWhillBrand() {
        return whillBrand;
    }

    public void setWhillBrand(String whillBrand) {
        this.whillBrand = whillBrand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Whill)) return false;

        Whill whill = (Whill) o;

        if (size != whill.size) return false;
        return whillBrand.equals(whill.whillBrand);
    }

    @Override
    public int hashCode() {
        int result = whillBrand.hashCode();
        result = 31 * result + size;
        return result;
    }

    @Override
    public String toString() {
        return "Whill{" +
                "whillBrand='" + whillBrand + '\'' +
                ", size=" + size +
                '}';
    }
}
