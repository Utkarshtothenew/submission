import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Write a program to create a Thread pool of 2 threads
// where one Thread will print even numbers and other will print odd numbers.
public class Q6
{
    void printEven()
    {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (this)
        {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Even Numbers are : "+Thread.currentThread().getName());
            for (int i = 0; i < 20; i++)
                if (i % 2 == 0)
                    System.out.println(i);
        }
    }
    void printOdd()
    {
        synchronized (this)
        {
            System.out.println("Odd Numbers are :  "+ Thread.currentThread().getName());
            for (int i = 0; i < 20; i++)
                if (i % 2 != 0)
                    System.out.println(i);
        }
    }
    public static void main(String[] args)
    {
        ExecutorService exec = Executors.newFixedThreadPool(2);
        Q6 obj = new Q6();
        long start = System.currentTimeMillis();
        exec.submit(new Runnable() {
            @Override
            public void run() {
               obj. printEven();
            }
        });
        exec.submit(new Runnable() {
            @Override
            public void run() {
                obj.printOdd();
            }
        });

        exec.shutdown();
        long end = System.currentTimeMillis();
        System.out.println("Time Taken is : "+(end-start));
    }
}