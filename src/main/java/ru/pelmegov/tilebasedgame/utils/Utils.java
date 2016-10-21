package ru.pelmegov.tilebasedgame.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Utils {

    public static String loadFileAsString(String path) {
        StringBuilder builder = new StringBuilder();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line).append("\n");
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.toString();
    }

    public static int parseInt(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 0;
        }
    }

}
