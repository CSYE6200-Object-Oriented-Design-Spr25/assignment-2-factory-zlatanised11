package edu.neu.csye6200;

import java.io.*;
import java.util.*;

public class FileUtil {
    public static List<String> readFile(String filename) {
        List<String> lines = new ArrayList<>();
        String filePath = "data/" + filename;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error: Could not read file " + filePath);
            e.printStackTrace();
        }
        return lines;
    }
}
