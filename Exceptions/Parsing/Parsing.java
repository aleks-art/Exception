package Exceptions.Parsing;

import java.awt.*;
import java.io.Writer;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parsing {
    public static void parseInput(String input) throws ParserException {
        Wrriter wr = new Wrriter();
        String[] arr = new String[5];
        int i = 0;
        for (String s : input.split(" ")) {
            arr[i] = s;
            i++;
        }
        for (int j = 0; j < 3; j++) {
            if (arr[j].matches("\\d+")) {
                throw new ParserException("Неверный формат данных");
            } else {
                System.out.println(arr[j]);
            }
        }
            if (!(isDateFormat(arr[3]))) {
                throw new IllegalArgumentException("Дата введена не корректно");
            }
//|| (arr[4].equals(gender.f))
            if ((arr[4]).equals(gender.m.name())|| (arr[4].equals(gender.f.name()))){
                System.out.println("Строка равна значению num.");
            }else {System.out.println("Строка не равна значению .");}
    wr.setE(arr);
    }
    public static boolean isDateFormat(String s) {
        Pattern pattern = Pattern.compile("\\d{2}\\.\\d{2}\\.\\d{4}");
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }
}
