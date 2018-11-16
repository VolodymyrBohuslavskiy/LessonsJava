package Partns.delegate;


public class delegate {
    public static void main(String[] args) {

        Car one = new Car("BMW","760Li","Sedan","V12","6l","550");
        one.EngenStart();


    }


}


class Car {

    private String brand, model, type;
    private Engine engine;

    public Car() {
    }

    public Car(String brand, String model, String type, String engenModel, String enMass, String power) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.engine = new Engine(engenModel, enMass, power);
    }

    public Car(String brand, String model, String type, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (!brand.equals(car.brand)) return false;
        if (!model.equals(car.model)) return false;
        if (!type.equals(car.type)) return false;
        return engine.equals(car.engine);
    }

    @Override
    public int hashCode() {
        int result = brand.hashCode();
        result = 31 * result + model.hashCode();
        result = 31 * result + type.hashCode();
        result = 31 * result + engine.hashCode();
        return result;
    }

    public void EngenStart() {
        this.engine.Start();
    }
}

class Engine {
    private String engenModel, enMass, power;

    public Engine(String engenModel, String enMass, String power) {
        this.engenModel = engenModel;
        this.enMass = enMass;
        this.power = power;
    }

    public String getEngenModel() {
        return engenModel;
    }

    public void setEngenModel(String engenModel) {
        this.engenModel = engenModel;
    }

    public String getEnMass() {
        return enMass;
    }

    public void setEnMass(String enMass) {
        this.enMass = enMass;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Engine)) return false;

        Engine engine = (Engine) o;

        if (!engenModel.equals(engine.engenModel)) return false;
        if (!enMass.equals(engine.enMass)) return false;
        return power.equals(engine.power);
    }

    @Override
    public int hashCode() {
        int result = engenModel.hashCode();
        result = 31 * result + enMass.hashCode();
        result = 31 * result + power.hashCode();
        return result;
    }

    public void Start() {
        System.out.println("Started");

    }
}