package CarList;

public class main {

    public static void main(String[] args) {
        Sedan s500 = new Sedan("52",150,11.0,"red",11.0,45,5,"Lux");
        Coup c6 = new Coup("852",320,4.3,"red",15.8,85,4,true);
        Van convoy = new Van("852588",120,15.0,1.5,1.5,false);
        TIR actros = new TIR("1234cd",160,24.5,153.2,9.9,true);
        F1 mc = new F1("85285wqdsca",320,3.1,"Kokonut","Ralph",true,"Tokyo");
        Rally ford = new Rally("8756",300,4.1,"Hella","Ralph",false,"Finland");

        System.out.println("--------------------------");
        System.out.println(ROZHOD(20, s500)+" l");
        System.out.println(ROZHOD(20, c6)+" l");
        System.out.println("--------------------------");
        System.out.println(CostOfWay(15000,convoy)+" grn");
        System.out.println(CostOfWay(15000,actros)+" grn");
        System.out.println("--------------------------");
        System.out.println(acs0to200(mc)+" sec");
        System.out.println("--------------------------");
        System.out.println(acs0to200(ford)+" sec");
        System.out.println("--------------------------");

    }


    private static double ROZHOD(double x, Civil c){
    return (x/c.getRozhid()*100);
    }

    private static double CostOfWay(double km, Cargo c){
        return km*c.getOneKmCost();
    }

    private static double acs0to200(Sport c){
        return 2*c.getAcseleration();
    }






}
