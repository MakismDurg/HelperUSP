package main;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    public Panel() {
        setBackground(Color.blue);
        JTextArea windowRequestBeforeCleaning = new TextArea();
        JTextArea windowRequestAfterCleaning  = new TextArea();

        JButton buttonRequestInsert = new Button((TextArea) windowRequestBeforeCleaning,
                (TextArea) windowRequestAfterCleaning);
        JButton buttonRequestComplete = new Button((TextArea) windowRequestBeforeCleaning,
                (TextArea) windowRequestAfterCleaning);

        buttonRequestInsert.setText(Launcher.BUTTON_INSERT_TITLE);
        buttonRequestComplete.setText(Launcher.BUTTON_COMPLETE_TITLE);

        add(buttonRequestInsert);
        add(buttonRequestComplete);

        add(new JScrollPane(windowRequestBeforeCleaning));
        add(new JScrollPane(windowRequestAfterCleaning));

        buttonRequestInsert.addActionListener(Button.insertRequest);
        buttonRequestComplete.addActionListener(Button.cleanRequest);
    }
}
