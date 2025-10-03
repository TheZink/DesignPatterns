package com.example;

public class ApiFacade {
    private ApiClient client = new ApiClient();

    public String getAttributeValueFromJson(String urlString, String valueString1, String valueString2){
        try {

            String fetchApi = client.fetchData(urlString, valueString1, valueString2);
            return fetchApi;

        } catch (Exception e){

            throw new IllegalArgumentException();

        }
    }
}
