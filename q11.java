class q11
{
    public static void main(String [] args)
    {
        int i=0,j=0;
        int s = 0;
        int t = 1;
        while(i<10)
        {
            s = s + i;
            j=i;
            while(j>0)
            {
                t = t * (j - i);
                j=j-1;
            }
            s = s * t;
            System.out.println("T is " + t);
            i=i+1;
        }
        System.out.println("S is " + s);
    }
}