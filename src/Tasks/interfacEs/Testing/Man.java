package Tasks.interfacEs.Testing;



public class Man implements Igangster,Runer{
    String name, surmane;

    public Man(String name, String surmane) {
        this.name = name;
        this.surmane = surmane;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurmane() {
        return surmane;
    }

    public void setSurmane(String surmane) {
        this.surmane = surmane;
    }

    @Override
    public void Shut() {
        System.out.println("Run boy");
    }

    @Override
    public void pase() {
    }

    @Override
    public String Der() {
        return null;
    }


    @Override
    public String Run() {
        return this.getName()+" Dude";
    }


}
