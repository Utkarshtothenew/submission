//Write a program to demonstrate the use of semaphore

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Q10
{
    int count ;
    Semaphore s;
    CountDownLatch latch;

    public Q10(Semaphore s, CountDownLatch latch)
    {
        this.s = s;
        this.latch = latch;
    }

    Object lock = new Object();
    void sharedResAccess() throws InterruptedException
    {

            s.acquire();


        synchronized (lock)
        {

            System.out.println("current thread accessing the resource is : "+ Thread.currentThread().getName());
                count++;
        }

            Thread.sleep(1000);
            s.release();
            latch.countDown();

    }



    public static void main(String[] args) throws InterruptedException {
        Semaphore s = new Semaphore(5);
        CountDownLatch latch = new CountDownLatch(10);
        Q10 obj = new Q10(s,latch);

        ExecutorService exec = Executors.newFixedThreadPool(10);
        for (int i=0;i<10;i++)
        {
            exec.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        obj.sharedResAccess();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    exec.shutdown();
        latch.await();

        System.out.println("Main Thread running .. The value of shared resource is : "+ obj.count);

    }
}
