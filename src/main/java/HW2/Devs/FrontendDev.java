package HW2.Devs;

import HW2.Interfaces.DoFrontend;

import java.time.LocalDate;

public class FrontendDev extends Developer implements DoFrontend {
    public FrontendDev(String name, LocalDate birthdate) {super(name, birthdate);}

    @Override
    public void developGUI() {
        System.out.println("Create new GUI");
    }

}
