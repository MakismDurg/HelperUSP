package main;

import javax.swing.*;

public class Frame extends JFrame {
    public Frame(){
        super(Launcher.PROGRAM_TITLE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 440);
        setResizable(false);
        JPanel panel = new Panel();
        setContentPane(panel);
    }
}