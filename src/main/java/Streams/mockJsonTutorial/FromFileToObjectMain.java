package Streams.mockJsonTutorial;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class FromFileToObjectMain {

    public static void main(String[] args) {
        try {
            // create Gson instance
            Gson gson = new Gson();

            // create a reader
            // Reader reader = Files.newBufferedReader(Paths.get("src/main/java/mockJsonTutorial/MOCK_DATA.json"));
            Reader reader = Files.newBufferedReader(Paths.get("src/main/java/mockJsonTutorial/MOCK_DATA.json"));

            // convert JSON string to User object
            //Emp user = gson.fromJson(reader, Emp.class);
            List<Emp> employees = new Gson().fromJson(reader, new TypeToken<List<Emp>>() {}.getType());

            // print user object
            //
            // System.out.println(user);
            employees.forEach(System.out::println);

            // close reader
            reader.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}