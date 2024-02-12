package main;

import javax.swing.*;
import java.awt.*;

import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;
import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;

public class Panel extends JPanel {
    private BZButton[] bZButtons = {
            new BZButton("Как создать ДУ?", "SD0000738", 5, 290),
            new BZButton("МЧД", "SD0039480", 5, 325),
            new BZButton("Как отправить ЭД", "SD0000716", 5, 360),
            new BZButton("Как получить ЭД", "SD0000723", 5, 395),
            new BZButton("Почта разблокировки", "esch@1c.ru; bykn@1c.ru", 5, 430),
            new BZButton("Отправить приглашение", "SD0000665", 195, 290),
            new BZButton("Добавление сертификата", "SD0017049", 195, 325),
            new BZButton("Состояние ЭДО", "SD0000794", 195, 360),
            new BZButton("Распаковка ТК", "SD0000689", 195, 395)
    };

    public Panel() {
        setBackground(Color.blue);
        setLayout(null);

        JTextArea windowInput = new JTextArea();
        windowInput.setLineWrap(true);
        windowInput.setWrapStyleWord(true);

        JTextArea windowOutput = new JTextArea();
        windowOutput.setLineWrap(true);
        windowOutput.setWrapStyleWord(true);

        RequestButton buttonInput = new RequestButton(windowInput,
                windowOutput);
        buttonInput.setText(Launcher.BUTTON_INSERT_TITLE);
        buttonInput.setLocation(5, 5);
        buttonInput.addActionListener(RequestButton.insertRequest);

        RequestButton buttonOutput = new RequestButton(windowInput,
                windowOutput);
        buttonOutput.setText(Launcher.BUTTON_COMPLETE_TITLE);
        buttonOutput.setLocation(195, 5);
        buttonOutput.addActionListener(RequestButton.cleanRequest);

        JScrollPane scrollPane1 = new JScrollPane(windowInput, VERTICAL_SCROLLBAR_AS_NEEDED,
                HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane1.setLocation(5, 40);
        scrollPane1.setSize(375, 120);

        JScrollPane scrollPane2 = new JScrollPane(windowOutput, VERTICAL_SCROLLBAR_AS_NEEDED,
                HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane2.setLocation(5, 165);
        scrollPane2.setSize(375, 120);

        add(buttonInput);
        add(buttonOutput);

        add(scrollPane1);
        add(scrollPane2);

        addArrayBZButtons();
    }

    private void addArrayBZButtons() {
        for (BZButton button : bZButtons
        ) {
            add(button);
        }
    }
}

