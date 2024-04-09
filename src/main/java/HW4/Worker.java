package HW4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Worker {
    private int ID = 100;
    private static int idCounter;
    private final String name;
    private long telephone;
    private byte experience;
    private static final StaffDirectory<Worker> staffDirectory = new StaffDirectory<>();

    {
        ID += ++idCounter;
        staffDirectory.addWorker(this);
    }
    //region constructors:
    public Worker(String name, long telephone, byte experience) {
        this(name, telephone);
        this.experience = experience;
    }
    public Worker(String name, long telephone) {
        this(name);
        this.telephone = telephone;
    }
    public Worker(String name) {
        this.name = name;
    }
    //endregion constructors

    public static void showWorkers() {staffDirectory.print();}
    //region getters:
    public static List<Worker> getWorkersByExp(byte experience) {
        ArrayList<Worker> workers = new ArrayList<>();
        for (Worker o : staffDirectory.getWorkersSet()) {
            if (o.experience == experience) workers.add(o);
        }
        if (workers.isEmpty()) {
            System.out.println("There are no workers with such experience");
            return null;
        }
        return workers;
    }

    public static List<Long> getTelephonesByName(String name) {
        List<Long> telephones = new ArrayList<>();
        Iterator<Worker> workerIterator = staffDirectory.getWorkersSet().iterator();
        while (workerIterator.hasNext()) {
            Worker currentWorker = workerIterator.next();
            if (currentWorker.name == name) {
                if (currentWorker.telephone == 0) System.out.println(currentWorker.name +
                        " ID: " + currentWorker.ID + " hasn't telephone");
                telephones.add(currentWorker.telephone);
            }
        }
        if (telephones.isEmpty()) {
            System.out.println("There are no workers with such name");
            return null;
        }
        return telephones;
    }
    public static Worker getWorkerByID(int id) {
        for (Worker worker : staffDirectory.getWorkersSet()) {
            if (worker.ID == id) return worker;
        }
        System.out.println("Worker with such ID doesn't exist");
        return null;
    }

    //endregion getters:

    @Override
    public String toString() {
        return "Worker{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", telephone=" + telephone +
                ", experience=" + experience +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return ID == worker.ID && telephone == worker.telephone && experience == worker.experience && Objects.equals(name, worker.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, telephone, experience);
    }
}
