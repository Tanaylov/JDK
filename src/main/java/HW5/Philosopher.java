package HW5;

import java.util.Random;

public class Philosopher implements Runnable {

    private String name;
    private static final int eatingTime = 2000;
    private static final int eatingTimes = 3;
    private static final Random r = new Random();
    public Philosopher(String name) {this.name = name;}

    private static synchronized void eating(Philosopher philosopher, int count) throws InterruptedException {
        System.out.printf("%s eating %d time(s)\n", philosopher.name, count);
        Thread.sleep(eatingTime);
    }

    private void pondering() throws InterruptedException {Thread.sleep(r.nextInt(300, 3000));}

    @Override
    public void run() {
        for (int i = 1; i <= eatingTimes; i++) {
            try {
                eating(this, i);
                System.out.println(name + " pondering...");
                pondering();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
