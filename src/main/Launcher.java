package main;


public class Launcher {
    public static final String PROGRAM_TITLE = "Помощник в УСПшечке";
    public static final String BUTTON_INSERT_TITLE = "ВВОД ЗАПРОСА";
    public static final String  BUTTON_COMPLETE_TITLE = "ВЫВОД";
    public static final String BUTTON_ROCK = "ROCK";

    public static void main(String[] args) {
        Frame frame = new Frame();
    }

    public static String stringClean(String request) {
        String[] requestSymbols = request.split("");
        for (int i = 0; i < requestSymbols.length; i++) {
            switch (requestSymbols[i]) {
                case ":", "-", "(", ")", "{", "}", "=", "'", "\"", "№", "[", "]", ";", "/", "\\",
                        "\n", ",", "  ", "?" -> requestSymbols[i] = " ";
            }
        }
        request = String.join("", requestSymbols);
        return request;
    }

    public static String prepareAdress(String errorText) {
        String[] errorWords = errorText.split(" ");
        String idEDO;
        String iNN;
        String name ="";
        for (int i = 0; i < errorWords.length; i++) {
            if (errorWords[i] == "ИдЭДО") {
                idEDO = errorWords[i + 1];
            }
            if (errorWords[i] == "ИНН/КПП" || errorWords[i] == "ИНН") {
                iNN = errorWords[i + 1];
            }
            if (errorWords[i] == "(ФИО)") {
                String[] wordSymbols = errorWords[i + 1].split("");
                errorWords[i + 1] = "";
                for (int j = 0; j < wordSymbols.length; j++) {
                    errorWords[i + 1] = wordSymbols [j];
                }
               // надо прописать метод, который должен оборвать строку на группе символов ","
            }
        }
        return errorText;
    }
}