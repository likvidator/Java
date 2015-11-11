package ru.netcracker;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Parser {

    public  static  String getWeb(String urlText){

        URL url;
        try {
            //get Url connect
            url = new URL(urlText);
            URLConnection conn = url.openConnection();


            //open stream and put into buffer
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;

            //save to file
                String html = new String();

            while ((inputLine = reader.readLine()) != null) {
                html+=inputLine;
                html+='\n';
            }

            reader.close();
            return html ;
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}