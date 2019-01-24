package com.chan.vivian;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;

import java.io.IOException;
import java.net.URL;

public class JsonFileLoader {

    public static String readFromJsonFile(String resourceFilePath) throws IOException {
        URL url = Resources.getResource(resourceFilePath);
        String text = Resources.toString(url, Charsets.UTF_8);
        return text;
    }
}
