package HW2.Interfaces;

public interface DoBackend {
    default void doWork() {
        System.out.println("Can backend programming");
    }
}
