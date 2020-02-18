public class q6 {
    public static void main(String[] args) {
        int a[]={1,1,2,3,2,4,5,4,5};
        int output = 0;
        for(int i=0;i<a.length;i++)
        {
            output = output ^ a[i];
        }
        System.out.println(output);
    }
}
