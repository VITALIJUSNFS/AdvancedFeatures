package Streams.savarankiskasDarbas.body;

import java.util.ArrayList;
import java.util.List;

public class DataService {

    public static List<School> preparedData() {


        Student A1 = new Student("Rokas", "Anukas", 15, "basic1", 90);
        Student A2 = new Student("Tomas", "Risas", 15, "basic1", 87);
        Student A3 = new Student("Mantas", "Loras", 15, "basic1", 42);
        Student A4 = new Student("Darius", "Sumas", 15, "basic1", 99);
        Student A5 = new Student("Arturas", "Turkas", 15, "basic1", 56);

        List<Student> vlnStudentsClass = new ArrayList<>();
        vlnStudentsClass.add(A1);
        vlnStudentsClass.add(A2);
        vlnStudentsClass.add(A3);

        List<Student> kauStudentsClass = new ArrayList<>();
        kauStudentsClass.add(A2);
        kauStudentsClass.add(A3);
        kauStudentsClass.add(A5);

        List<Student> klaStudentsClass = new ArrayList<>();
        klaStudentsClass.add(A3);
        klaStudentsClass.add(A4);
        klaStudentsClass.add(A1);


        List<Trainer> trainers = new ArrayList<>();

        Trainer T1 = new Trainer("Antas", "Sera", 54, "JAVA");
        Trainer T2 = new Trainer("Rutas", "Dera", 54, "JAVA");
        Trainer T3 = new Trainer("Gidas", "Raila", 54, "JAVA");
        Trainer T4 = new Trainer("Antas", "Sera", 54, "JAVA");

        trainers.add(T1);
        trainers.add(T2);
        trainers.add(T3);
        trainers.add(T4);

        List<School> school = new ArrayList<>();

        School VLN = new School("Vilnius Programers", "Liepkalnio 10", 5, T1, vlnStudentsClass);
        School KAU = new School("Kaunas Programers", "Taikos 12", 4, T2, kauStudentsClass);
        School KLA = new School("Klaipeda Programers", "Laisves 35", 3, T3, klaStudentsClass);
        School SIA = new School("Siauliai Programers", "Azuolu 1", 1, T4, kauStudentsClass);
        School PNV = new School("Panevezio Programmers", "Sausio 12", 2, T1, klaStudentsClass);

        school.add(VLN);
        school.add(KAU);
        school.add(KLA);
        school.add(SIA);
        school.add(PNV);

        return school;
    }
}

