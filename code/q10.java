public class q10 {
    public static void main(String[] args) {
        int a=10;
        int b=11;
        double c =1.0;
        double d =2.0;
        float e =3.0F;
        float f = 4.0F;
        String ab = "abcd";
        String ba = "dcba";
        String aa = "aaa";
        add(a,b);
        add(c,d);
        Multiply(e,f);
        Multiply(a,b);
        conCat(ab,ba);
        conCat(ab,ba,aa);

    }
    public static void add(int a, int b)
    {
        System.out.println(a+b);
    }
    public static void add(double a, double b)
    {
        System.out.println(a+b);
    }
    public static void Multiply(float a, float b)
    {
        System.out.println(a*b);
    }
    public static void Multiply(int a, int b)
    {
        System.out.println(a*b);
    }
    public static void conCat(String a, String b)
    {
        System.out.println(a.concat(b));
    }
    public static void conCat(String a, String b, String c)
    {
        System.out.println((a.concat(b)).concat(c));
    }

}
