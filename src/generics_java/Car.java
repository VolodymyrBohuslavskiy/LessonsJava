package generics_java;


import lombok.Data;


@Data
public class Car<V extends Number, T extends String> {
    private V engMass;
    private T Oololoool;

    public Car(V engMass) {
        this.engMass = engMass;
    }

    public Car(T oololoool) {
        Oololoool = oololoool;
    }
}
