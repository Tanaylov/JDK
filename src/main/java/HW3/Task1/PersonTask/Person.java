package HW3.Task1.PersonTask;

public interface Person {
    default void doWork() {
        System.out.println("I'm working");
    }

    default void haveRest() {
        System.out.println("Do nothing");
    }
}
