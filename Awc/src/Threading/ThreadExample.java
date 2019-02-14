package Threading;
import java.lang.*;
public class ThreadExample {
    public static volatile boolean isActive;
    public static void main(String[] args) {
        isActive = true;
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                while(true) {
                    if(isActive) {
                        System.out.println("THREAD 1");
                        isActive = false;
                    }
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                while(true) {
                    if(!isActive) {
                        System.out.println("THREAD 2");
                        try {
                            Thread.sleep(100);
                        } catch (Exception e) {
                        }
                        isActive = true;
                    }
                }
            }
        });
        thread1.start();
        thread2.start();
    }
}