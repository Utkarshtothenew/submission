import javax.naming.Name;
import java.awt.*;


class Bank
{
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.getDetails();
    }
    public void getDetails()
    {
        BOI boi = new BOI();
        boi.getDetails();
        ICICI icici= new ICICI();
        icici.getDetails();
        SBI sbi = new SBI();
        sbi.getDetails();
    }
}
class BOI extends Bank{
    static double rate = 8.5;
    static String Name = "BOI Bank";

    public  double getRate() {
        return rate;
    }

    public  String getName() {
        return Name;
    }

    public  void getDetails()
    {
        System.out.println(getName());
        System.out.println(getRate());
    }

}
class ICICI extends Bank{


    static double rate = 8.0;
    static String Name="ICICI Bank";

    public double getRate() {
        return rate;
    }

    public String getName() {
        return Name;
    }
    public void getDetails()
    {
        System.out.println(getName());
        System.out.println(getRate());
    }

}
class SBI extends Bank{
    static  double rate = 8.8;
    static String Name = "SBI Bank";

    public double getRate() {
        return rate;
    }

    public  String getName() {
        return Name;
    }
    public void getDetails()
    {
        System.out.println(getName());
        System.out.println(getRate());
    }
}
