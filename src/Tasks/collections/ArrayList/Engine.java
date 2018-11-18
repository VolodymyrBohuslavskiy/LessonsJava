package Tasks.collections.ArrayList;


//        - Двигун (к)
//        - модель
//        - об'єм
//        - кінські сили


public class Engine {
    private String engienModel;
    private double mass;
    private int power;

    public Engine(String engienModel, double mass, int power) {
        this.engienModel = engienModel;
        this.mass = mass;
        this.power = power;
    }

    public String getEngienModel() {
        return engienModel;
    }

    public void setEngienModel(String engienModel) {
        this.engienModel = engienModel;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Engine)) return false;

        Engine engine = (Engine) o;

        if (Double.compare(engine.mass, mass) != 0) return false;
        if (power != engine.power) return false;
        return engienModel.equals(engine.engienModel);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = engienModel.hashCode();
        temp = Double.doubleToLongBits(mass);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + power;
        return result;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engienModel='" + engienModel + '\'' +
                ", mass=" + mass +
                ", power=" + power +
                '}';
    }
}
