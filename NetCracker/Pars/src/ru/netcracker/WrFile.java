package ru.netcracker;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by likvidator on 10.02.15.
 */
public class WrFile {
    public static void write(String fileName, String text) {
        File file = new File(fileName);
        try {
            if(!file.exists()){
                file.createNewFile();
            }

            PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            try {

                out.print(text);
            } finally {
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }


}
