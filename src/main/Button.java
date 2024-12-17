package main;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Button extends JButton {
    private static JTextArea windowInput;
    private static JTextArea windowOutput;
    public String textOfButton;

    public Button() {
    }

    public Button(JTextArea windowInput, JTextArea windowOutput) {
        Button.windowInput = windowInput;
        Button.windowOutput = windowOutput;
        setSize(140, 30);
    }

    public Button(String name, String textOfButton, int locX, int locY) {
        this.textOfButton = textOfButton;
        setText(name);
        setSize(185, 30);
        setLocation(locX, locY);
        addActionListener(pushButton);

    }

    static ActionListener playROCK = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            playSound();
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

    static ActionListener insertRequest = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            windowInput.setText(null);
            windowInput.paste();
            windowOutput.setText(null);
        }
    };

    ActionListener pushButton = new ActionListener() {
        public void actionPerformed(ActionEvent e) {

            String value = textOfButton;
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            StringSelection stringSelection = new StringSelection(value);
            clipboard.setContents(stringSelection, null);
        }
    };

    public static void playSound() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("D:/music/rock/roc.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }
}
