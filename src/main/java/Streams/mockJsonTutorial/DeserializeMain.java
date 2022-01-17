package Streams.mockJsonTutorial;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class DeserializeMain {

    public static void main(String[] args) {
        String jsonString = "{\n" +
                "  \"id\": 1,\n" +
                "  \"firstName\": \"Tom\",\n" +
                "  \"lastName\": \"Brandy\",\n" +
                "  \"salary\": 1000,\n" +
                "  \"department\": {\n" +
                "    \"name\": \"IT\",\n" +
                "    \"active\": true\n" +
                "  }\n" +
                "}\n";

        Gson gson = new GsonBuilder().create();

        Employee employee = gson.fromJson(jsonString, Employee.class);

        System.out.println(employee);
    }
}