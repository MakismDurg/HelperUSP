package main;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JButton{
    private static TextArea windowRequestBeforeCleaning;
    private static TextArea windowRequestAfterCleaning;

    public Button(TextArea windowRequestBeforeCleaning, TextArea windowRequestAfterCleaning) {
        Button.windowRequestBeforeCleaning = windowRequestBeforeCleaning;
        Button.windowRequestAfterCleaning = windowRequestAfterCleaning;
    }

    static ActionListener insertRequest = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            windowRequestBeforeCleaning.setText(null);
            windowRequestBeforeCleaning.paste();
            windowRequestAfterCleaning.setText(null);
        }
    };
    static ActionListener cleanRequest = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String request = Launcher.stringClean(windowRequestBeforeCleaning.getText());
            windowRequestAfterCleaning.setText(request);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            StringSelection stringSelection = new StringSelection(request);
            clipboard.setContents(stringSelection, null);
        }
    };
}
