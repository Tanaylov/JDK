package HW3.Task1.PersonTask;

public class Workplace extends Place {

    public Workplace(Person[] arrayT) {super(arrayT);}

    /*public void start() {
    }*/

    @Override
    void action() {
        for (int i = 0; i < personArray.length; i++) {
            personArray[i].doWork();
        }
    }
}
