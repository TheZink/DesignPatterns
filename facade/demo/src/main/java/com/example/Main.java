package com.example;
public class Main {
    public static void main(String[] args) {
        ApiFacade facade = new ApiFacade();

        // Example 1 - Advice Slip API
        String url = "https://api.adviceslip.com/advice";
        String attribute1 = "slip";
        String attribute2 = "advice";

        // Example 2 - Chuck Norris API
        // String url = "https://api.chucknorris.io/jokes/random";
        // String attribute1 = "value";
        // String attribute2 = null;

        // Example 3 - Fxratesapi API
        // String url = "https://api.fxratesapi.com/latest";
        // String attribute1 = "rates";
        // String attribute2 = "ADA";

        System.out.println("\n"  + facade.getAttributeValueFromJson(url, attribute1, attribute2) + "\n");
    }

}
