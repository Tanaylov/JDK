package HW4;

import java.util.HashSet;

public class StaffDirectory<T extends Worker> {
    private HashSet<T> workersSet = new HashSet<>(55);
    public void addWorker(T worker) {workersSet.add(worker);}

    public HashSet<T> getWorkersSet() {
        return workersSet;
    }

    public void print() {workersSet.forEach(System.out::println);}
}
