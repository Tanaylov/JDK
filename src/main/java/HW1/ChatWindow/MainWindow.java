package HW1.ChatWindow;

import HW1.ChatLogic.Chat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class MainWindow extends JFrame {

    //region PARAMETERS:
    private static final int WINDOW_WIDTH = 500;
    private static final int WINDOW_HEIGHT = 400;
    private static final int WINDOW_POSX = 600;
    private static final int WINDOW_POSY = 500;
    private static final JPanel buttonStartStop = new JPanel(new GridLayout(1, 2));
    private static final JButton bStart = new JButton("Start");
    private static final JButton bStop = new JButton("Stop");
    private static final JTextArea textArea = new JTextArea(3, 10);

    //endregion PARAMETERS
    {
        bStart.setMnemonic(KeyEvent.VK_S);
        bStop.setMnemonic(KeyEvent.VK_E);

        bStart.setToolTipText("Start the chat");
        bStop.setToolTipText("Stop the chat");
    }
    public MainWindow() {
        setTitle("Chat Server");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocationRelativeTo(null);


        buttonStartStop.add(bStart);
        buttonStartStop.add(bStop);
//        buttonStartStop.add(textArea);
        add(buttonStartStop);

        add(textArea, BorderLayout.SOUTH);

        bStart.addActionListener(new ButtonsListener());
        bStop.addActionListener(new ButtonsListener());

        setVisible(true);
    }

    public static void setTextInTextArea(String text) {
        textArea.setText(text);
    }

}
