package HW4;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Ivan");
        Worker worker2 = new Worker("Fill", 9857773355L);
        Worker worker3 = new Worker("John", 9038773355L, (byte) 5);
        Worker worker4 = new Worker("Georg", 9038773123L, (byte) 5);
        Worker worker5 = new Worker("John", 903_845_65_51L, (byte) 7);
//        System.out.println(worker1);
//        System.out.println(worker2);
        Worker.showWorkers();
        System.out.println(Worker.getWorkersByExp((byte) 5));
        System.out.println(Worker.getTelephonesByName("Ivan"));
        System.out.println(Worker.getWorkerByID(109));
    }
}
