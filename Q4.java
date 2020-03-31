// Write a program using synchronization block
public class Q4
{
    Object lock1 = new Object();
    Object lock2 = new Object();
    int count1 =0,count2=0;
    void synch1()
    {
        synchronized (lock1)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for(int i=0;i<10;i++)
            {
                count1++;
                if(i%2==0)
                    System.out.println("even no : "+ i + Thread.currentThread().getName());
            }
        }



    }
    void synch2()
    {
        synchronized (lock2)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for(int i=0;i<10;i++)
            {
                count2++;
                if(i%2!=0)
                    System.out.println("odd no : "+ i +  Thread.currentThread().getName());
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Q4 obj = new Q4();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.synch1();
                obj.synch2();
            }
        });


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.synch1();
                obj.synch2();
            }
        });
        long start = System.currentTimeMillis();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        long end = System.currentTimeMillis();
        System.out.println("The time taken for execution of both thread is : "+ (end-start));
        System.out.println("count2 : "+ obj.count1+"count2 : "+ obj.count2);

    }
}
