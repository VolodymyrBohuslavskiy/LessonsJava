package Partns.abstract_factory;

public class abstract_factory {
    public static void main(String[] args) {
       Mage m= new NiceSqad().CreateMage();
        System.out.println(m.cast());

        Mage bad= new BadSqad().CreateMage();
        System.out.println(bad.cast());

    }


}

abstract class Sqad {
    public abstract Mage CreateMage();
    public abstract Archer CreteArcher();
}
class NiceSqad extends Sqad{

    @Override
    public Mage CreateMage() {
        return new GoodMag();
    }

    @Override
    public Archer CreteArcher() {
        return new GoodArcher();
    }
}


class BadSqad extends Sqad{

    @Override
    public Mage CreateMage() {
        return new BadMag();
    }

    @Override
    public Archer CreteArcher() {
        return new BadArcher();
    }
}


interface Mage {
    int cast();
}

class GoodMag implements Mage{
    @Override
    public int cast() {
        return 1200;
    }
}
class BadMag implements Mage{
    @Override
    public int cast() {
        return 500;
    }
}


interface Archer {
    int shoot();
}
class GoodArcher implements Archer{
    @Override
    public int shoot() {
        return 500;
    }
}
class BadArcher implements Archer{
    @Override
    public int shoot() {
        return 200;
    }
}












