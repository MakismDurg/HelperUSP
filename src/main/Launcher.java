package main;

import javax.swing.*;

public class Launcher {
    public static final String PROGRAM_TITLE = "Очисти строчку для запроса в УСП";
    public static final String BUTTON_INSERT_TITLE = "ВВОД ЗАПРОСА";
    public static final String BUTTON_COMPLETE_TITLE = "ВЫВОД ЗАПРОСА";

    public static void main(String[] args) {
        JFrame frame = new Frame();
        frame.setVisible(true);
    }
    public static String stringClean (String request) {
        String[] requestSymbols = request.split("");
        for (int i = 0; i < requestSymbols.length; i++) {
                switch (requestSymbols[i]) {
                    case ":", "-", "(", ")", "{", "}", "=", "'", "\"", "№", "[", "]", ";", "/", "\\",
                            "\n", ",", "  ", "?" ->
                            requestSymbols[i] = " ";
                }
        }
        request = String.join("", requestSymbols);
        return request;
    }
}