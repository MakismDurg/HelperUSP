package main;

import javax.swing.*;
import java.awt.*;

import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;
import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
import static main.Launcher.BUTTON_ROCK;

public class Panel extends JPanel {
    private Button[] bZButtons = {
            new Button("Как создать ДУ?", "SD0000738", 5, 320),
            new Button("МЧД", "SD0039480", 5, 355),
            new Button("Как отправить ЭД", "SD0000716", 5, 390),
            new Button("Как получить ЭД", "SD0000723", 5, 425),
            new Button("Не найден ЭД по ИД", "SD0044996", 5, 460),
            new Button("Нерезультативный", "SD0000072", 5, 495),
            new Button("Отправить приглашение", "SD0000665", 195, 320),
            new Button("Принять приглашение", "SD0000976", 195, 355),
            new Button("Состояние ЭДО", "SD0000794", 195, 390),
            new Button("Распаковка ТК", "SD0000689", 195, 425),
            new Button("Добавить сертификат", "SD0017049", 195, 460),
            new Button("Невалидный серт", "SD0088558", 195, 495),
            new Button("Скрипт МЧД", "РазрешенныеТипыДокументов = Новый Массив();\n" +
                    "РазрешенныеТипыДокументов.Добавить(Перечисления.ТипыДокументовЭДО.ТоварнаяНакладная);\n" +
                    "РазрешенныеТипыДокументов.Добавить(Перечисления.ТипыДокументовЭДО.СчетФактура);\n" +
                    "РазрешенныеТипыДокументов.Добавить(Перечисления.ТипыДокументовЭДО.ЗаказТовара);\n" +
                    "РазрешенныеТипыДокументов.Добавить(Перечисления.ТипыДокументовЭДО.АктВыполненныхРабот);\n" +
                    "РазрешенныеТипыДокументов.Добавить(Перечисления.ТипыДокументовЭДО.УПД);\n" +
                    "РазрешенныеТипыДокументов.Добавить(Перечисления.ТипыДокументовЭДО.АктСверкиВзаиморасчетов);\n" +
                    "РазрешенныеТипыДокументов.Добавить(Перечисления.ТипыДокументовЭДО.Прочее);\n" +
                    "ТипДокумента = Параметры.ЭлектронныйДокумент.ВидДокумента.ТипДокумента;\n" +
                    "Параметры.Результат.Успех = Истина;\n" +
                    "Если РазрешенныеТипыДокументов.Найти(ТипДокумента) = Неопределено Тогда\n" +
                    "Параметры.Результат.Успех = Ложь;\n" +
                    "Параметры.Результат.ТекстОшибки = СтрШаблон(\"Не разрешено подписывать документ типа: %1\", " +
                    "ТипДокумента);\n" +
                    "КонецЕсли;", 575, 40),
            new Button("Почта Контура", "TRoaming@skbkontur.ru", 575, 75),
            new Button("Журнал регистрации",
                    "e1cib/app/Обработка.ЖурналРегистрации", 385, 40),
            new Button("Текущие дела ЭДО",
                    "e1cib/app/Обработка.ИнтерфейсДокументовЭДО.Форма.ТекущиеДелаПоЭДО", 385, 75),
            new Button("УЗ ЭДО",
                    "e1cib/list/РегистрСведений.УчетныеЗаписиЭДО", 385, 110),
            new Button("Перевыслать счет", "Добрый день!" +
                    "\nПисьмо со счетом на оплату во вложениях. " +
                    "Просьба произвести оплату ровно на сумму выставленного счета. " +
                    "Разблокировка производится автоматически в течение 24 часов.", 575, 110),
            new Button("Адресные книги", "Добрый день!" +
                    "\nПросьба подтвердить данные абонента." +
                    "\nИдЭДО: \nИНН/КПП: \nНаименование (ФИО): ", 575, 145),
            new Button("2-й роуминговый Тензор", """
                    Добрый день!
                    Мы являемся представителем абонента:\s
   
                    В связи с отказом настройки приглашения, от лица абонента просим внести 2-й идентификатор в Вашей системе:\s""", 575, 180),
            new Button("Почта Тензора", "Тензор <rsp@tensor.ru>;", 575, 215),
            new Button("Запрос ТК", "Пришлите, пожалуйста, транспортный контейнер документа " +
                    "(требуется открыть документ → кнопка «Ещё» → выбрать «Транспортный контейнер» → «Сохранить на диск»)." +
                    "\n", 575, 250),
            new Button("Длительное ожидание", "Добрый день!\n" +
                    "Приносим извинения за длительное ожидание." +
                    "\n", 575, 285),
            new Button("Состояния ЭД", "e1cib/list/РегистрСведений.СостоянияДокументовЭДО", 385, 145),
            new Button("Список ТК", "e1cib/list/Документ.ТранспортныйКонтейнерЭДО", 385, 180),
            new Button("Настройки отправки", "e1cib/list/РегистрСведений.НастройкиОтправкиЭлектронныхДокументовПоВидам", 385, 215),
            new Button("Настройки получения", "e1cib/list/РегистрСведений.НастройкиПолученияЭлектронныхДокументов", 385, 250),
            new Button("Приглашения", "e1cib/list/РегистрСведений.ПриглашенияКОбменуЭлектроннымиДокументами", 385, 285),
            new Button("Настройки ЭДО", "e1cib/app/Обработка.НастройкиЭДО.Форма.НастройкиЭДО", 385, 320),
            new Button("Настройки ЭПиШ", "e1cib/app/ОбщаяФорма.НастройкиЭлектроннойПодписиИШифрования", 385, 355),
            new Button("Разблокировка", "SD0000878", 5, 285),
            new Button("Адресные книги", "SD0066794", 195, 285),
            new Button("Список МЧД", "e1cib/list/РегистрСведений.ЖурналМашиночитаемыхДоверенностей", 385, 390),
            new Button("Удаление объектов", "e1cib/app/Обработка.УдалениеПомеченныхОбъектов", 385, 425)
            ,
            new Button("Архив ЭДО", "e1cib/app/Обработка.ИнтерфейсДокументовЭДО.Форма.АрхивЭлектронныхДокументов", 385, 460),
            new Button("Преобразования форматов", "e1cib/list/РегистрСведений.ПравилаПреобразованияФорматов", 385, 495)
    };

    public Panel() {
        setBackground(Color.getHSBColor(250, 237, 158));
        setLayout(null);

        JTextArea windowInput = new JTextArea();
        windowInput.setLineWrap(true);
        windowInput.setWrapStyleWord(true);

        JTextArea windowOutput = new JTextArea();
        windowOutput.setLineWrap(true);
        windowOutput.setWrapStyleWord(true);

        Button rock = new Button();
        rock.setText(BUTTON_ROCK);
        rock.setSize(85, 30);
        rock.setLocation(150, 5);
        rock.addActionListener(Button.playROCK);
        add(rock);

        Button buttonInput = new Button(windowInput,
                windowOutput);
        buttonInput.setText(Launcher.BUTTON_INSERT_TITLE);
        buttonInput.setLocation(5, 5);
        buttonInput.addActionListener(Button.insertRequest);

        Button buttonOutput = new Button(windowInput,
                windowOutput);
        buttonOutput.setText(Launcher.BUTTON_COMPLETE_TITLE);
        buttonOutput.setLocation(240, 5);
        buttonOutput.addActionListener(Button.cleanRequest);

        JScrollPane scrollPane1 = new JScrollPane(windowInput, VERTICAL_SCROLLBAR_AS_NEEDED,
                HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane1.setLocation(5, 40);
        scrollPane1.setSize(375, 118);

        JScrollPane scrollPane2 = new JScrollPane(windowOutput, VERTICAL_SCROLLBAR_AS_NEEDED,
                HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane2.setLocation(5, 163);
        scrollPane2.setSize(375, 118);

        JLabel label = new JLabel("GHJKLHGGHJKL");
        setLocation(500, 99);
        add(label);


        add(buttonInput);
        add(buttonOutput);

        add(scrollPane1);
        add(scrollPane2);

        addArrayBZButtons();
    }

    private void addArrayBZButtons() {
        for (Button button : bZButtons
        ) {
            add(button);
        }
    }
}

