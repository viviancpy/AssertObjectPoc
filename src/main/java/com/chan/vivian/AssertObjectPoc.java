package com.chan.vivian;


import com.google.gson.Gson;

import java.io.IOException;

public class AssertObjectPoc {

    public static void main(String[] args) throws IOException {
        String jsonFromFile = JsonFileLoader.readFromJsonFile("strictlyEqual.json");
        System.out.println(jsonFromFile);

        Gson gson = new Gson();
        String jsonFromObject = gson.toJson(new TargetObject());
        System.out.println(jsonFromObject);

    }
}
