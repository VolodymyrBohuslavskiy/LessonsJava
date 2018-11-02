package les2;


public class User {
   private String name, tel, statuse;
    private int id;
    private double weight;

    public int getId() {
        return id;
    }

    public User(String name, String tel, String statuse, int id, double weight) {
        this.name = name;
        this.tel = tel;
        this.statuse = statuse;
        this.id = id;
        this.weight = weight;


    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName(int pin) {
        if (pin==1111)
        {return name;}
        return null;
    }

    // Методи---------------------------------------------- "void - no return" (воід - нічого не повертає !)
  /*public*/   void plus() {
        System.out.print(this.name + "it is Me; ");
    }

    /*private*/ void skid(int a, int b) {
        System.out.println((this.id + a)/b);
    }

    /*protected*/ int idPlusOne() {
        return this.id + 1;
    }

String oloolo(){
        return this.statuse+" "+this.name+" hi ther";
    }

    double Summa(double a,double b){
    return a+b;
    }

    //____________________________________________________


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (Double.compare(user.weight, weight) != 0) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (tel != null ? !tel.equals(user.tel) : user.tel != null) return false;
        return statuse != null ? statuse.equals(user.statuse) : user.statuse == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (tel != null ? tel.hashCode() : 0);
        result = 31 * result + (statuse != null ? statuse.hashCode() : 0);
        result = 31 * result + id;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", statuse='" + statuse + '\'' +
                ", id=" + id +
                ", weight=" + weight +
                '}';
    }
}
