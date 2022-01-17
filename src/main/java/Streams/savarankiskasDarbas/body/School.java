package Streams.savarankiskasDarbas.body;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor

public class School {

    private String schoolName;
    private String schoolAddress;
    private int classes;
    private Trainer trainer;
    private List <Student> student;

}
