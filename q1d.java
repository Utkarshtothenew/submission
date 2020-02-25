import java.util.Scanner;

interface upp{
    String uppercase(String s);
}
public class q1d {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        upp t=(String st)->{
            return st.toUpperCase();
        };
        System.out.println(t.uppercase(s));
    }
}
