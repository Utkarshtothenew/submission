import java.util.concurrent.*;

//Run a task with the help of callable and store it's result in the Future.
public class Q9
{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool();
      Future<Integer> futval =  exec.submit(new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                Integer sum=0;
                for(int i=0;i<=10;i++) {
                    sum = sum + i;
                }
                return sum;
            }
        });
      exec.shutdown();
        System.out.println("The value returned by the thread is : "+futval.get());
    }
}
