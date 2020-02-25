import java.util.Scanner;

interface q3{
    void display(int a,int b);
}
class operations
{
    void add(int a,int b){
        System.out.println(a+b);
    }
    void subtract(int a,int b){
        if(a>b)
            System.out.println(a-b);
        else
            System.out.println(b-a);
    }
    static void multiply(int a, int b)
    {
        System.out.println(a*b);
    }
}

public class q3b {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();

        //Reference to an instance method
        q3 t=new operations()::add;
        t.display(a,b);
        q3 t1=new operations()::subtract;
        t1.display(a,b);

        //Reference to a static method
        q3 t2=operations::multiply;
        t2.display(a,b);

    }
}
