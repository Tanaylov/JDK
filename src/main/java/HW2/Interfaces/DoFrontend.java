package HW2.Interfaces;

public interface DoFrontend {
    default void doWork() {
        System.out.println("Can frontend programming");
    }
}
