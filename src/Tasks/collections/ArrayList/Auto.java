package Tasks.collections.ArrayList;

//є класс авто
//        поля
//        - модель
//        - рік
//        - номер
//        - колір


public class Auto {
    private String model, color, number;
    private int year;
    private Engine eng;
    private Whill whi;

    public Auto(String model, String color, String number, int year, Engine eng, Whill whi) {
        this.model = model;
        this.color = color;
        this.number = number;
        this.year = year;
        this.eng = eng;
        this.whi = whi;
    }

    public Auto(String model, String color, String number, int year) {
        this.model = model;
        this.color = color;
        this.number = number;
        this.year = year;
    }

    public Auto() {
    }


    public Auto(String model, String color, String number, int year, String engienModel, double mass, int power) {
        this.model = model;
        this.color = color;
        this.number = number;
        this.year = year;
        new Engine(engienModel, mass, power);
    }

    public Auto(String model, String color, String number, int year, String engienModel, double mass, int power, String whillBrand, int size) {
        this.model = model;
        this.color = color;
        this.number = number;
        this.year = year;
        new Engine(engienModel, mass, power);
        new Whill(whillBrand, size);
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEng() {
        return eng;
    }

    public void setEng(Engine eng) {
        this.eng = eng;
    }

    public Whill getWhi() {
        return whi;
    }

    public void setWhi(Whill whi) {
        this.whi = whi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Auto)) return false;

        Auto auto = (Auto) o;

        if (year != auto.year) return false;
        if (!model.equals(auto.model)) return false;
        if (!color.equals(auto.color)) return false;
        if (!number.equals(auto.number)) return false;
        if (!eng.equals(auto.eng)) return false;
        return whi.equals(auto.whi);
    }

    @Override
    public int hashCode() {
        int result = model.hashCode();
        result = 31 * result + color.hashCode();
        result = 31 * result + number.hashCode();
        result = 31 * result + year;
        result = 31 * result + eng.hashCode();
        result = 31 * result + whi.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", number='" + number + '\'' +
                ", year=" + year +
                ", eng=" + eng +
                ", whi=" + whi +
                '}';
    }
}



