//3. Write a program to create a thread using Thread class and Runnable interface each.
public class Q3 extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Hi there I am thread made through extending thread class");
    }

    public static void main(String[] args) throws InterruptedException {
        Q3 thread1 = new Q3();
        thread1.setName("t1");

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hi there I am created through implementing Runnable interface");
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("I am main thread");

    }
}
