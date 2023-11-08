import java.util.Scanner;
/* in this program we convert one currency to another currency*/
/* USD means US Dollar
* EUR --> Euro
* GBP --> British Pound
* CAD --> Canadian Dollar
* AUD --> Australian Dollar
* JPY --> Japanese Yen
* INR --> Indian Rupee
* PKR --> Pakistani Rupee
 */
//convert USD to any other 5 currency
class USD {
    double US;

    USD(double US){
        this.US = US;
    }

    double euro() {
        double ue;
        ue = US * 0.943;
        return ue;
    }

    double britishPond() {
        double ubp = US * 0.82;
        return ubp;
    }

    double canadianDollar() {
        double ucd = US * 1.37;
        return ucd;
    }

    double IndianRupees() {
        double uir = US * 83.15;
        return uir;
    }

    double PakistaniRupees() {
        double upr = US * 280.20;
        return upr;
    }

}
//convert EURO to any other 5 currency
class EUR {
    double er;

    EUR(double er) {
        this.er = er;
    }

    double USDollar() {
        double eus = er * 1.059;
        return eus;
    }

    double britishPond() {
        double ebp = er * 0.87;
        return ebp;
    }

    double canadianDollar() {
        double ucd = er * 1.37;
        return ucd;
    }

    double IndianRupees() {
        double eir = er * 88.12;
        return eir;
    }

    double PakistaniRupees() {
        double epr = er * 296.96;
        return epr;
    }

}
//convert GBP to any other 5 currency
class GBP {
    double gbp;

    GBP(double gbp) {
        this.gbp = gbp;
    }

    double euro() {
        double ge;
        ge = gbp * 1.147;
        return ge;
    }

    double USDollar() {
        double gus = gbp * 1.21;
        return gus;
    }

    double canadianDollar() {
        double gcd = gbp * 1.67;
        return gcd;
    }

    double IndianRupees() {
        double gir = gbp * 101.15;
        return gir;
    }

    double PakistaniRupees() {
        double gpr = gbp * 340.86;
        return gpr;
    }

}
//convert CAD to any other 5 currency
    class CAD{
        double cad;
        CAD(double cad){
            this.cad=cad;
        }
        double euro(){
            double ce=cad*0.68;
            return ce;
        }

        double USDollar(){
            double cus=cad*0.72;
            return cus;
        }
        double britishPound(){
            double cbp=cad*0.59;
            return cbp;
        }

        double IndianRupees(){
            double cir=cad*60.116;
            return cir;
        }
        double PakistaniRupees(){
            double cpr=cad*199.89;
            return cpr;
        }

}
//INR to any other 5 currency
class INR{
    double inr;
    INR(double inr){
        this.inr=inr;
    }
    double euro(){
        double ie=inr*0.011;
        return ie;
    }

    double USDollar(){
        double ius=inr*0.01198;
        return ius;
    }
    double britishPound(){
        double ibp=inr*0.00989;
        return ibp;
    }

    double CanadianDollar(){
        double cir=inr*0.0166;
        return cir;
    }
    double PakistaniRupees(){
        double ipr=inr*3.3268;
        return ipr;
    }
}
//convert  PKR to any other 5 currency
class PKR{
    double pkr;
    PKR(double pkr){
        this.pkr=pkr;
    }
    double euro(){
        double pe=pkr*0.003419;
        return pe;
    }

    double USDollar(){
        double pus=pkr*0.0036;
        return pus;
    }
    double britishPound(){
        double pbp=pkr*0.00297;
        return pbp;
    }

    double CanadianDollar(){
        double pir=pkr*0.005;
        return pir;
    }
    double IndianRupees(){
        double ppr=pkr*0.30;
        return ppr;
    }
}
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose currency: USDollar, Euro, BritishPound, CanadianDollar, IndianRupee, PakistaniRupee");
        System.out.print("Enter the money that you want to convert: ");
        double money=sc.nextDouble();
        System.out.print("Enter the currency from: ");
        String From=sc.next();
        System.out.print("Enter the currency to: ");
        String To=sc.next();
        USD ud=new USD(money);
        EUR eu=new EUR(money);
        GBP bp=new GBP(money);
        CAD ca=new CAD(money);
        INR in=new INR(money);
        PKR pk=new PKR(money);
        if(From.equals("USDollar") && To.equals("Euro")){
            System.out.println(ud.euro());
        }
        else if(From.equals("USDollar") && To.equals("BritishPound")){
            System.out.println(ud.britishPond());
        }
        else if(From.equals("USDollar") && To.equals("CanadianDollar")){
            System.out.println(ud.canadianDollar());
        }
        else if(From.equals("USDollar") && To.equals("Indian Rupee")){
            System.out.println(ud.IndianRupees());
        }
        else if(From.equals("USDollar") && To.equals("PakistaniRupee")){
            System.out.println(ud.PakistaniRupees());
        }
        else if(From.equals("Euro") && To.equals("USDollar")){
            System.out.println(eu.USDollar());
        }
        else if(From.equals("Euro") && To.equals("BritishPound")){
            System.out.println(eu.britishPond());
        }
        else if(From.equals("Euro") && To.equals("CanadianDollar")){
            System.out.println(eu.canadianDollar());
        }
        else if(From.equals("Euro") && To.equals("IndianRupee")){
            System.out.println(eu.IndianRupees());
        }
        else if(From.equals("Euro") && To.equals("PakistaniRupee")){
            System.out.println(eu.PakistaniRupees());
        }
        else if(From.equals("BritishPound") && To.equals("USDollar")){
            System.out.println(bp.USDollar());
        }
        else if(From.equals("BritishPound") && To.equals("Euro")){
            System.out.println(bp.euro());
        }
        else if(From.equals("BritishPound") && To.equals("CanadianDollar")){
            System.out.println(bp.canadianDollar());
        }
        else if(From.equals("BritishPound") && To.equals("IndianRupee")){
            System.out.println(bp.IndianRupees());
        }
        else if(From.equals("BritishPound") && To.equals("PakistaniRupee")){
            System.out.println(bp.PakistaniRupees());
        }
        else if(From.equals("CanadianDollar") && To.equals("USDollar")){
            System.out.println(ca.USDollar());
        }
        else if(From.equals("CanadianDollar") && To.equals("Euro")){
            System.out.println(ca.euro());
        }
        else if(From.equals("CanadianDollar") && To.equals("BritishPound")){
            System.out.println(ca.britishPound());
        }
        else if(From.equals("CanadianDollar") && To.equals("IndianRupee")){
            System.out.println(ca.IndianRupees());
        }
        else if(From.equals("CanadianDollar") && To.equals("PakistaniRupee")){
            System.out.println(ca.PakistaniRupees());
        }
        else if(From.equals("IndianRupee") && To.equals("USDollar")){
            System.out.println(in.USDollar());
        }
        else if(From.equals("IndianRupee") && To.equals("Euro")){
            System.out.println(in.euro());
        }
        else if(From.equals("IndianRupee") && To.equals("BritishPound")){
            System.out.println(in.britishPound());
        }
        else if(From.equals("IndianRupee") && To.equals("Canadian")){
            System.out.println(in.CanadianDollar());
        }
        else if(From.equals("IndianRupee") && To.equals("PakistaniRupee")){
            System.out.println(in.PakistaniRupees());
        }

    }
}
