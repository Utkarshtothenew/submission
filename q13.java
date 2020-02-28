public class q13
{
    public static void main(String args[])
    {
        try
        {
            throw new MyException("custom exception");
        }
        catch (MyException ex)
        {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
}



class MyException extends Exception
{
    public MyException(String s)
    {
        super(s);
    }
}

