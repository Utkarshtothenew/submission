import java.io.IOException;
import java.util.Scanner;

interface q1{
    boolean greater(int a, int b);
}
public class q1a {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        q1 some=(int a,int b) -> {
            return a > b ;
        };

        boolean store = some.greater(x,y);
        System.out.println(store);

    }




}
