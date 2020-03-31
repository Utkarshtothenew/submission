import java.util.Scanner;
import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


class Employee extends Thread {

    public synchronized void firstMeth()
     {
         System.out.println("I am firstmeth()"+ Thread.currentThread().getName());

     }
    public synchronized void secondMeth()
    {
        System.out.println("I am secondmeth()"+ Thread.currentThread().getName());
    }
{



}


}
public class App implements  Runnable
{
    static Employee e = new Employee();

    @Override
    public void run() {
        e.firstMeth();
        e.secondMeth();
    }
    public static void main(String[] args) {

        App app = new App();
       Thread t = new Thread(app);
       t.setName("t1");
       t.start();

    }

}
