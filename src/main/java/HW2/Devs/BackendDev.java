package HW2.Devs;

import HW2.Interfaces.DoBackend;

import java.time.LocalDate;

public class BackendDev extends Developer implements DoBackend {
    public BackendDev(String name, LocalDate birthdate) {super(name, birthdate);}

    @Override
    public void developGUI() {
        System.out.println("GUI isn't my work");
    }
}
