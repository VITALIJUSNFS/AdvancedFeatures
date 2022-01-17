package Streams.savarankiskasDarbas;

import Streams.savarankiskasDarbas.body.DataService;
import Streams.savarankiskasDarbas.body.School;
import Streams.savarankiskasDarbas.body.Student;

import java.util.*;

public class Main {


    public static void main(String[] args) throws NoSuchFieldException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select from Menu");
        System.out.println("1. Print available Schools Name and address");
        System.out.println("2. Print best student, School and class");

        int menu = scanner.nextInt();

        if (menu == 1) {
            printSchoolList();
        } else if (menu == 2) {
            studentMaxGrade();
        }


    }


    public static void task() {
        System.out.println("" +
                "Sukurti klases - Mokykla, Klase, Mokinys, Mokytojas\n" +
                "Mokykla turi tureti daug klasiu. Taip pat pavadinima, adresa.\n" +
                "Klase turi pavadinima, mokytoja, daug mokiniu\n" +
                "Mokinys ir mokytojas turi varda, amziu pvz.\n" +
                "Mokinys turi pazymuio vidurki pvz. 9.2\n" +
                "Susikurti keleta mokyklu, keleta klasiu ir t.t.\n" +
                "Naudojant streamus surasti:\n" +
                "Vyriausia mokytoja is visu mokyklu\n" +
                "Surasti geriausia mokini is visu mokyklu.\n" +
                "surasti mokinius, kuriu vardai prasideda raide A\n" +
                "na ir patys pagalvokit dar pagal ka paieskot mokytoju ar mokiniu. Kurybine uzduotis. Apie 5-7 skirtingus punktus.");
    }

    public static void printSchoolList() {
        List<School> schools = DataService.preparedData();
        for (School school : schools) {
            System.out.println("--------------------------------------");
            System.out.println("School name: " + school.getSchoolName());
            System.out.println("Address: " + school.getSchoolAddress());
        }
    }

    public static void studentMaxGrade() throws NoSuchFieldException {

        List<School> schools = DataService.preparedData();
//        DataService dataService = new DataService();

        OptionalInt max = schools.stream()
                .flatMap(school -> school.getStudent().stream())
                .mapToInt(Student::getStudentGrade)
                .max();
        System.out.println(max);
            
        }

}
