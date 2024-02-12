package main;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BZButton extends JButton {
    public String valueButton;

    public BZButton(String name, String valueButton, int locX, int locY) {
        this.valueButton = valueButton;
        setText(name);
        setSize(185, 30);
        setLocation(locX, locY);
        addActionListener(pushButton);
    }

    ActionListener pushButton = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String value = valueButton;
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            StringSelection stringSelection = new StringSelection(value);
            clipboard.setContents(stringSelection, null);
        }
    };

}
