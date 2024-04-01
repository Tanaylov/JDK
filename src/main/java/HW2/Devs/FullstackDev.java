package HW2.Devs;

import HW2.Interfaces.DoBackend;
import HW2.Interfaces.DoFrontend;

import java.time.LocalDate;

public class FullstackDev extends Developer implements DoFrontend, DoBackend {
    public FullstackDev(String name, LocalDate birthdate) {super(name, birthdate);}

    @Override
    public void developGUI() {
        System.out.println("Create GUI");
    }

    @Override
    public void doWork() {
        DoFrontend.super.doWork();
        DoBackend.super.doWork();
    }


}
