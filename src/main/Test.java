package main;

import javax.swing.*;
import java.awt.*;

import static javax.swing.SwingConstants.*;

public class Test {
    public static void main(String[] args) {
        JFrame suka = new JFrame("тест");
        suka.setSize(444, 444);
        suka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        suka.setVisible(true);
        suka.setResizable(true);
        JPanel panel = new JPanel();
        panel.setBackground(Color.getHSBColor(99, 99, 88));
        JLabel label = new JLabel("Ну что, псы, не ожидали?");
        panel.add(label);
        label.setAlignmentX(77);
        suka.setContentPane(panel);
    }
}
