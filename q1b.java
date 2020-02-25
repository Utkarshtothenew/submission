import java.util.Scanner;

interface  incc{
    int incre(int x);
}
public class q1b {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int x=scanner.nextInt();
        incc t=(int a)-> {return a+1;};
        System.out.println(t.incre(x));
    }
}
