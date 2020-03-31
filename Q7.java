
//Write a program to demonstrate wait and notify methods.
import java.util.ArrayList;
import java.util.List;


public class Q7
{
    public static void main(String[] args)
    {
        Temporary obj = new Temporary();
       Thread t1 =  new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    obj.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    obj.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
class Temporary
{
    List<Integer> list = new ArrayList<Integer>();
           final int LIMIT = 10;
           static int value = 0;
    Object lock1 = new Object();
    void produce() throws InterruptedException {

            while (true) {
                synchronized (lock1) {
                while (list.size() == LIMIT)
                    lock1.wait();
                list.add(++value);
                lock1.notify();


            }
        }
    }

    void consume() throws InterruptedException {

        while (true) {
            synchronized (lock1) {
                while (list.size() == 0)
                    lock1.wait();
                System.out.print("List size is: " + list.size());
                System.out.println(" Removed element is : "+list.remove(list.size()-1));
                lock1.notify();



            }
            Thread.sleep(500);
        }
    }
}