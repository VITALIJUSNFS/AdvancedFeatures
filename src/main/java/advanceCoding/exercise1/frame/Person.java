package advanceCoding.exercise1.frame;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public abstract class Person {

    protected String firstName;
    protected String lastName;
    protected Integer age;
    protected double salary;

    public void introduceYourself(){
        System.out.println("Hello, my name is "+  firstName);
        System.out.println("my lastname is "+  lastName);
        System.out.println("my age is "+  age);
        System.out.println("my salary is "+  salary);
    }


}
