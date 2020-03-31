//Role of "volatile" keyword.
//The efeect of volatile keyword is nullified in later versions of java.
public class Q2
{
   volatile  int count ;

    public Q2(int count) {
        this.count = count;
    }
    void incrementCount()
    {
        count++;
    }
    public static void main(String[] args) throws InterruptedException {
        Q2 obj = new Q2(10);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++)
                     obj.incrementCount();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++)
                     obj.incrementCount();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("The value of count is :"+ obj.count);
    }
}
