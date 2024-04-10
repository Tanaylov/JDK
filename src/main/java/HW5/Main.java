package HW5;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            String name = "Philosopher " + (i+1);
            new Thread(new Philosopher(name)).start();
        }
    }
}
