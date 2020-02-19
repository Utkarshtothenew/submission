public class q6 {
    public static void main(String args[]){
        try{
            int arr[]=new int[7];
            arr[9]=30/0;
            System.out.println("Last Statement of try block");
        }
        catch(ArithmeticException e){
            System.out.println("You should not divide a number by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Accessing array elements outside of the limit");
        }
        catch(Exception e){
            System.out.println("Some Other Exception");
        }
        finally
        {

            System.out.println("Finally block");
        }
    }

}
