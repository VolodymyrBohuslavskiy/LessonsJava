package Tasks.interfacEs.Interf;


public class Policeman extends Humann implements I_intrr1{

    public Policeman() {
    }

    @Override
    public void Scream() {
        System.out.println("a-a-a-a-a-a-a!!!!!!");
    }

    @Override
    public int[] Creator(int x) {
        int []arr=new int[x];
        for (int i = 0; i <arr.length; i++) {
             arr[i]= (int) (Math.random()*200);
        }
        return arr;
    }

    @Override
    public int[] Creator() {
        int []arr=new int[o];
        for (int i = 0; i <arr.length; i++) {
            arr[i]= (int) (Math.random()*o);
        }
        return arr;
    }

    @Override
    public double Sqar(double a, double b) {
        return a*b;
    }

    @Override
    public double Sqar(double a) {
        return a*a;
    }
}
