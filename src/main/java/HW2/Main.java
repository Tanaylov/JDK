package HW2;

import HW2.Devs.BackendDev;
import HW2.Devs.Developer;
import HW2.Devs.FrontendDev;
import HW2.Devs.FullstackDev;
import HW2.Interfaces.DoBackend;
import HW2.Interfaces.DoFrontend;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BackendDev backendDev1 = new BackendDev("John", LocalDate.of(1999, 11, 25));
        FrontendDev frontendDev1 = new FrontendDev("Kolya", LocalDate.of(2000, 11, 1));
        FullstackDev fullstackDev1 = new FullstackDev("Mike", LocalDate.of(1988, 10, 12));
        DoFrontend frontendDev2 = new FrontendDev("Anatolyj", LocalDate.of(1995, 9, 9));
        DoBackend backendDev2 = new BackendDev("Fill", LocalDate.of(1983, 1, 22));

        Developer frontendDev3 = new FrontendDev("Frank", LocalDate.of(1979, 11, 5));
        Developer backendDev3 = new BackendDev("Semen", LocalDate.of(1989, 3, 11));
        //seminar:
        backendDev1.doWork();
        backendDev2.doWork();
        frontendDev1.doWork();
        frontendDev2.doWork();
        fullstackDev1.doWork();

        //abstract method:
        frontendDev1.developGUI();
        frontendDev3.developGUI();

        // interface:
        backendDev3.doGUI();
        frontendDev3.doGUI();

    }
}
