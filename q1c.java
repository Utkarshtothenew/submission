import java.util.Scanner;

interface con{
    String conca(String a,String b);
}
public class q1c {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String x=scanner.next();
        String y=scanner.next();
        con t=(String a,String b)->{
            String s=a+b;
            return s;
        };
        System.out.println(t.conca(x,y));
    }
}
