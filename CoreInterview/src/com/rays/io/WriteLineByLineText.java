package com.rays.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteLineByLineText {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("C:\\Users\\adity\\OneDrive\\Desktop\\IO\\writeLine.txt");

        BufferedWriter bw = new BufferedWriter(fw);

        String[] lines = {
            "This is the first line.",
            "This is the second line.",
            "This is the third line.",
            "This is the fourth line."
        };

        for (String line : lines) {
            bw.write(line);
            bw.newLine();
        }

        bw.close();
        fw.close();
    }
}
