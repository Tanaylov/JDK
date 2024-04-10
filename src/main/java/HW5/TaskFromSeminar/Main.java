package HW5.TaskFromSeminar;

public class Main {
    static int num = 100;
    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(new ThreadA());
        Thread threadB = new Thread(new ThreadB());
        threadA.setDaemon(true);
        threadA.start();
        threadB.start();
    }

}
class ThreadA implements Runnable {
    static boolean switcher = true;
    static int num = 100;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            switcher = !switcher;
        }
    }
}

class ThreadB extends ThreadA {


    @Override
    public void run() {
        while (num > 0) {
            if (ThreadA.switcher) {
                System.out.println(num--);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.print("");
        }
    }
}
