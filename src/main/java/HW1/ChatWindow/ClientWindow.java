package HW1.ChatWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class ClientWindow extends JFrame {
    private static final int HEIGHT = 300;
    private static final int WIDTH = 400;
    private static StringBuilder history;
    private static final JButton buttonLogin = new JButton("Login");
    private static final JButton buttonSend = new JButton("Send");
    private static final JPanel panelLogin = new JPanel(new GridLayout(2, 3));
    private static final JPanel panelSendMessage = new JPanel(new FlowLayout(2));

    private static final HashMap<String, JTextField> textFields = new HashMap<String, JTextField>(){{
            put("IP", new JTextField());
            put("Port", new JTextField());
            put("Login", new JTextField());
            put("Password", new JPasswordField());
            put("Message", new JTextField());
    }};
    private static final JTextArea textAreaHistory = new JTextArea();
    private static final JScrollPane scrollHistory = new JScrollPane(textAreaHistory);
    private static JList<String> listUser = new JList<>(new String[] {
            "Ivan", "Anatoliy", "Sergey", "Anton", "John", "Fedor", "Alex"
    });


    /*
    private static final JTextField textFieldPort = new JTextField();
    private static final JTextField textFieldLogin = new JTextField();
    private static final JTextField textFieldPassword = new JTextField();
    private static final JTextField textFieldMessage = new JTextField();
    */
    ClientWindow (){
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);

        setTitle("Chat Client");

        for (Map.Entry<String, JTextField> element : textFields.entrySet()) {
            if (element.getKey().equals("Message")) {
                element.getValue().setColumns(getWidth()/15);
                element.getValue().setFont(new Font("Arial", Font.ITALIC, 14));
                panelSendMessage.add(element.getValue());
            }
            else panelLogin.add(element.getValue());
            element.getValue().setToolTipText(element.getKey());
        }
        panelLogin.add(buttonLogin);

        listUser.setLayoutOrientation(JList.VERTICAL);
        listUser.setVisibleRowCount(1);
        panelLogin.add(new JScrollPane(listUser));

        buttonSend.setMnemonic(KeyEvent.VK_ENTER);
        panelSendMessage.add(buttonSend);

        buttonSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = textFields.get("Message").getText();
                if (!message.isEmpty()) {
                    if (!textAreaHistory.getText().isEmpty())
                        textAreaHistory.setText(textAreaHistory.getText() + message + " " +LocalDate.now() + "\n");
                    else textAreaHistory.setText(message + " " + LocalDate.now() + "\n");
                    history = new StringBuilder(textAreaHistory.getText());
                    System.out.println(textFields.get("Message").getText());
                }
            }
        });


        add(panelLogin, BorderLayout.NORTH);
        add(panelSendMessage, BorderLayout.SOUTH);

        textAreaHistory.setEditable(false);
        add(scrollHistory);
    }

    public static String getHistory() {return history.toString();}
    public static void setHistory(String text) {textAreaHistory.setText(text);}
}
