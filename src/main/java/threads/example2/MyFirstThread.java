package threads.example2;

public class MyFirstThread extends Thread {

    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Labas");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }

}
