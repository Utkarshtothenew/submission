//Write a program which creates deadlock between 2 threads
public class Q12
{
    Object  lock1 = new Object();
    Object  lock2 = new Object();

    void threadMethod1()
    {
        synchronized (lock1)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock2)
            {
                System.out.println("Current running thread is : "+Thread.currentThread().getName()+" has acquired lock on both objects");

            }
        }

    }
    void threadMethod2()
    {
        synchronized (lock2)
        {
            synchronized (lock1)
            {
                System.out.println("Current running thread is : "+Thread.currentThread().getName()+" has acquired lock on both objects");

            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Q12 obj = new Q12();
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                            obj.threadMethod1();
                }
            });
        //Q12 obj = new Q12();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.threadMethod2();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("In main thread..");

    }
}
