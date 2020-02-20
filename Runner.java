package question1;

import java.util.Scanner;

public class Runner {

    private static volatile boolean state = true;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                while (state) {
                    System.out.println("Hi i'm there ");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        th.start();
        sc.nextLine();
        exit();

    }
    public static void exit ()
    {
        state = false;
    }
}
