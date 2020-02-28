import java.util.Scanner;
class q8 {
    public static void main(String args[]) {
        String s;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter a string");
            s = sc.nextLine();
            if(s.equals("done"))
            {
                System.out.println("its done");
                break;
            }
            else
            {
                if(s.charAt(0)==(s.charAt(s.length()-1)))
                {
                    System.out.println("equals");
                }
                else
                {
                    System.out.println("not equals");
                }
            }
        }
    }
}
