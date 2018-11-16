package Partns.factory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Zil zil = (Zil) factory.Create("Zil");
        Zaz zaz = (Zaz) factory.Create("Zaz");

        //+-----------------------------------------------------

        AnimalFactory zoo=new AnimalFactory();
        Pet one =new Pet();
        Wild two = new Wild();

        one.Run();
        two.Run();
    }
}

interface Car {
    void Drive();
}

class Zil implements Car {
    @Override
    public void Drive() {
        System.out.println("Zil");
    }
}

class Zaz implements Car {
    @Override
    public void Drive() {
        System.out.println("Zaz");
    }
}


class Factory {
    public Car Create(String TypeOfCar) {
        switch (TypeOfCar) {
            case "Zil":
                return new Zil();
            case "Zaz":
                return new Zaz();
            default:
                return null;
        }
    }
}

//---------------------------------------------------------------------------

interface Action{
public void Run();
}

class Pet implements Action{
    @Override
    public void Run() {
        System.out.println("Run on room!");
    }
}

class Wild implements Action{
    @Override
    public void Run() {
        System.out.println("Run o field!");
    }
}


class AnimalFactory{
    public Action Doo(String typeOfAnimal){
   if (typeOfAnimal.equals("Pet")) return new Pet();
   if (typeOfAnimal.equals("Wild")) return new Wild();
   else return null;}
}





