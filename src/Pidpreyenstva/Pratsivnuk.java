package Pidpreyenstva;


import lombok.Data;

@Data



public class Pratsivnuk {
    private String name;{}
    private int EXP= (int)(Math.random() * 10);
    private Pidpruyemstvo pidpruyemstvo;
    private Departament departament;

    public Pratsivnuk(String name, Pidpruyemstvo pidpruyemstvo, Departament departament) {
        this.name = name;
        this.pidpruyemstvo = pidpruyemstvo;
        this.departament = departament;
    }

    public Pratsivnuk(String name) {
        this.name = name;
    }
}
