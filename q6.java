import java.util.Scanner;

interface methods{
    static void multiply(int a,int b)
    {
        System.out.println(a*b);
    }
    default void add(int a,int b)
    {
        System.out.println(a+b);
    }
}
public class q6 implements methods{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();
        int b=scanner.nextInt();
        q6 obj=new q6();
        obj.add(a,b);
        methods.multiply(a,b);
    }
}
