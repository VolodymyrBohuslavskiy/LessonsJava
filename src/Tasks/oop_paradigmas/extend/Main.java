package Tasks.oop_paradigmas.extend;

public class Main {
    public static void main(String[] args) {
        Computer one = new Computer("Intel Core 2 duo", 2.4, 4000, 500000, true);
        PersonalComputer two = new PersonalComputer("Intel Core i3", 3.1, 6000, 640000, true, 3, true);
        WorkStaysion three = new WorkStaysion("Intel Core i3", 3.1, 6000, 640000, true, 3, true, "DDR2", "Radeon");
        Laptop four = new Laptop("Intel Core i5", 3.4, 6000, 1000000, true, 2, true, "DDR3", "NVidia", true, 15.7);
        Ultrabook five =new Ultrabook("Intel Core i9", 4.1, 16000, 1000000, true, 0, false, "DDR3", "NVidia", true, 17.3,"Black",true);


    }
}
