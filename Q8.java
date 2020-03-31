//8. Write a program to demonstrate sleep and join methods.
public class Q8
{
    public static void main(String[] args) throws InterruptedException {
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("Thread "+ Thread.currentThread().getName()+"sleeping");
                        Thread.sleep(4000);
                        System.out.println("Now "+ Thread.currentThread().getName()+" Running");
                        System.out.println(Thread.currentThread().getName());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    for(int i=0;i<5;i++)
                        System.out.println(i);
                }
            });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+" Running");
                for(int i=0;i<5;i++)
                    System.out.println(i);
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }

}
