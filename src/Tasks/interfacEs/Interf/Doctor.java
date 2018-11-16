package Tasks.interfacEs.Interf;


public class Doctor extends Humann implements I_intrr1{


    public Doctor() {
    }

    @Override
    public void Scream() {
        System.out.println("y-y-y-y-y-y-y-y-y-y!!!!!");
    }

/*    @Override
    public int[] Creator(int x) {

    }*/

    @Override
    public int[] Creator(int x) {
        int []arr=new int[10];
        for (int i = 0; i <arr.length; i++) {
            arr[i]= (int) (Math.random()*x);
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
        return Math.pow(a,2.0);
    }
}
