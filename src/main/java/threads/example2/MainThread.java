package threads.example2;

public class MainThread {
    public static void main(String[] args) {

        MyFirstThread firstThread = new MyFirstThread();
        MySecondThread secondThread = new MySecondThread();

        firstThread.start();

        secondThread.run();

        System.out.println(firstThread.getName());
        System.out.println(secondThread.getName());
        System.out.println(Thread.currentThread().getName());

    }
}
