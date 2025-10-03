package com.example;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ApiClient {
    public String fetchData(String url, String value1, String value2) throws Exception {
        String jsonResult = getJsonFromApi(url);
        return extractDataFromJson(jsonResult, value1, value2);
    }

    private String getJsonFromApi(String apiUrl) throws Exception {
        URL url = new URL(apiUrl);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            return content.toString();
        } finally {
            con.disconnect();
        }
    }

    private String extractDataFromJson(String json, String value1, String value2) throws Exception {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(json);

        if (value2 != null){
            JSONObject attribute1 = (JSONObject) jsonObject.get(value1);
            Object attribute2 = (Object) attribute1.get(value2);

            return attribute2 != null ? attribute2.toString() : null;
        } else {

            return (String) jsonObject.get(value1).toString();
        }
    }
}