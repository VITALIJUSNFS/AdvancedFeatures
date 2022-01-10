package sample3;

public class Waiter extends Person {

    public Waiter(String name){
        super(name);
    }
    public  void serveFood(String foodName){
        System.out.println("Serving"+foodName);
    }
}
