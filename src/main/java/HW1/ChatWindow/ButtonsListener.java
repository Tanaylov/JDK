package HW1.ChatWindow;

import HW1.ChatLogic.Chat;
import HW1.SaveLoad.LoadFrom;
import HW1.SaveLoad.SaveTo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonsListener implements ActionListener {
    private String command;

    @Override
    public void actionPerformed(ActionEvent e) {
        command = e.getActionCommand();
        switch (command) {
            case "Start":
                if (Chat.getIsWorking()) MainWindow.setTextInTextArea("Server already " + command.toLowerCase());
                else {
                    MainWindow.setTextInTextArea("Server " + command.toLowerCase());
                    Chat.setIsWorking(true);
                    new ClientWindow().setVisible(true);
                    ClientWindow.setHistory(LoadFrom.loadFromFile());
                }
                break;
            case "Stop":
                if (!Chat.getIsWorking()) MainWindow.setTextInTextArea("Server already " + command.toLowerCase());
                else {
                    MainWindow.setTextInTextArea("Server " + command.toLowerCase());
                    Chat.setIsWorking(false);
                    SaveTo.saveToFile(ClientWindow.getHistory());
//                    System.exit(0);
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + command);
        }
    }
}
