package practice;

/**
 * @author WangZY
 * @date 2021年09月06日15:03
 */
public class Threads extends Thread{
    public void run() {
        String name = Thread.currentThread().getName();
        int i = 0;
        for (i = 0; i < 10; i++) {
            System.out.println(name + "-" + i);
        }
        try {
            Thread.sleep(1000);
            System.out.println("wait 1000 ms");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (; i < 20; i++) {
            System.out.println(name + "-" + i);
        }
    }

    public static void main(String[] args) {
        Thread thread = new Threads();
        thread.start();
//        thread.run();
        try {
            Thread.sleep(200);
            System.out.println("wait 200 ms");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 10; i++) {
            System.out.println(name + "-" + i);
        }
    }
}
