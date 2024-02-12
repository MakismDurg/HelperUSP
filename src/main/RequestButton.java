package main;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RequestButton extends JButton {
    private static JTextArea windowInput;
    private static JTextArea windowOutput;

    public RequestButton(JTextArea windowInput, JTextArea windowOutput) {
        RequestButton.windowInput = windowInput;
        RequestButton.windowOutput = windowOutput;
        setSize(185, 30);
    }

    static ActionListener insertRequest = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            windowInput.setText(null);
            windowInput.paste();
            windowOutput.setText(null);
        }
    };
    static ActionListener cleanRequest = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String request = Launcher.stringClean(windowInput.getText());
            windowOutput.setText(request);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            StringSelection stringSelection = new StringSelection(request);
            clipboard.setContents(stringSelection, null);
        }
    };
}
