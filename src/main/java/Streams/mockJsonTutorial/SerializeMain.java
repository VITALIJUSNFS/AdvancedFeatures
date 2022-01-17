package Streams.mockJsonTutorial;

import com.google.gson.GsonBuilder;
import mockJsonTutorial.Department;
import mockJsonTutorial.Employee;
import com.google.gson.Gson;

public class SerializeMain {

    public static void main(String[] args) {
        Employee user = new Employee(1, "Tom", "Brandy", 1000, new Department("IT", Boolean.TRUE));

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String jsonString = gson.toJson(user);

        System.out.println(jsonString);
    }
}