package Exceptions.Parsing;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Wrriter {
    public void setE(String[] arr) {
        String surname = arr[0];
        System.out.println(surname);
        try {
        processPersonData(arr,surname);
    } catch (IOException e) {
        System.out.println("Произошла ошибка при работе с файлом.");

    }
}

private static void processPersonData(String[] arr,String surname) throws IOException {
    FileWriter writer = new FileWriter(surname, true); // Открываем файл для записи
    for (int i = 0; i < arr.length; i++) {
    writer.write(arr[i] +" "); // Записываем фамилию в файл
        }
    writer.write(" \n");
    writer.close(); // Закрываем соединение с файлом
}
}
