package HW2.Devs;

import HW2.Interfaces.DevelopGUI;

import java.time.LocalDate;

public abstract class Developer implements DevelopGUI {
    String name;
    LocalDate birthdate;

    Developer(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    abstract public void developGUI();

    @Override
    public void doGUI() {
        if (this instanceof BackendDev) System.out.println("Can't make GUI");
        else System.out.println("GUI - not a problem");
    }
}
