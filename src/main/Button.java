package main;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JButton{
    private static TextArea a;
    private static TextArea b;

    public Button(TextArea a, TextArea b) {
        this.a = a;
        this.b = b;
    }
    static ActionListener insertRequest = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            a.setText(null);
            a.paste();
            b.setText(null);
        }
    };
    static ActionListener cleanRequest = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String request = Launcher.stringClean(a.getText());
            b.setText(request);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            StringSelection stringSelection = new StringSelection(request);
            clipboard.setContents(stringSelection, null);
        }
    };
}
