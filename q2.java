import java.util.Scanner;

interface  q2r{
    int question2(int a,int b);
}
public class q2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        q2r t=(int x,int y)->{
            return y;
        };
        System.out.println(t.question2(a,b));
    }
}
