package com.geekmasher.ssrf.utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Streamer {
    public static String readStream(InputStream stream) {
        StringBuffer sb = new StringBuffer();
        
        try {
            InputStreamReader reader = new InputStreamReader(stream);
            BufferedReader buff_reader = new BufferedReader(reader);

            String result;

            while ((result = buff_reader.readLine()) != null) {
                sb.append(result);
            }
        }
        catch (Exception error) {
            System.out.println(error.getMessage());
        }

        return sb.toString();
    }
}
