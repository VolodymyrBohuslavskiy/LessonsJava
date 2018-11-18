package generics_java;


public class Main {

    public static void main(String[] args) {
        System.out.println(new Car<>(1.5));
        System.out.println(new Car<>(2));

        System.out.println(new Car<>("njk"));


        Hey("asdasd");
        Hey('$');
        Hey(12);
        Hey(1.2);


    }
// або <? extends Number> наслідує Number, те саме, або <? super Integer> є батьківським для Integer;
    private static void Cared(Car /*<? extends Number>*/ car) {
        System.out.println("Drive" + car);
    }

    private static <E> void Hey(E e) {
        System.out.println(e);
    }
}
