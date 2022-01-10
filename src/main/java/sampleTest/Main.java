package sampleTest;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Daktaras daktaras = new Daktaras("Jon");
        Vairuotojas vairuotojas = new Vairuotojas("Antanas");
        Virejas virejas = new Virejas("Tomis");

        List<Worker> workers = new ArrayList<>();
        workers.add(daktaras);
        workers.add(vairuotojas);
        workers.add(virejas);

        System.out.println("***************");
        for (Worker worker : workers) {
            worker.salary();
            worker.jobDefinition();
            System.out.println();
        }
    }
}

//        daktaras.salary();
//        vairuotojas.salary();
//        virejas.salary();