package threads.example1;

public class ConcurrencyMain {
    public static void main(String[] args) throws InterruptedException {
        // daugiagijiskumas - Multihread - Concurrency

        System.out.println("Main thread starts");
        System.out.println("Threado pavadinimas - " + Thread.currentThread().getName());
//        Thread.sleep(5000);
        System.out.println("Atsibudau, vaziuoju toliau");
//        Thread.sleep(5000);
        System.out.println("Vel atsibudau");
        System.out.println("Main thread ends");




    }
}
