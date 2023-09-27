package main;

import javax.swing.*;

public class TextArea extends JTextArea {
    public TextArea() {
        super(10, 34);
        setLineWrap(true);
        setWrapStyleWord(true);
    }
}
