package main;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Panel extends JPanel {
    public Panel() {
        setBackground(Color.blue);
        JTextArea windowRequestBeforeCleaning = new TextArea();
        JTextArea windowRequestAfterCleaning  = new TextArea();

        JButton buttonRequestInsert = new JButton(Launcher.BUTTON_INSERT_TITLE);
        JButton buttonRequestComplete = new JButton(Launcher.BUTTON_COMPLETE_TITLE);

        add(buttonRequestInsert);
        add(buttonRequestComplete);

        add(new JScrollPane(windowRequestBeforeCleaning));
        add(new JScrollPane(windowRequestAfterCleaning));

        ActionListener insertRequest = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                windowRequestBeforeCleaning.setText(null);
                windowRequestBeforeCleaning.paste();
                windowRequestAfterCleaning.setText(null);
            }
        };
        buttonRequestInsert.addActionListener(insertRequest);

        ActionListener cleanRequest = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String request = Launcher.stringClean(windowRequestBeforeCleaning.getText());
                windowRequestAfterCleaning.setText(request);
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                StringSelection stringSelection = new StringSelection(request);
                clipboard.setContents(stringSelection, null);
            }
        };
        buttonRequestComplete.addActionListener(cleanRequest);
    }
}
