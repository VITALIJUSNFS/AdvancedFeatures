package intro;

public class Main {
    public static void main(String[] args) {
        // procedural approach
        int baseSalary = 30000;
        int overTimeHours = 10;
        int overTimeRate = 20;

        int totalWage = baseSalary + (overTimeHours * overTimeRate);
        System.out.println("Total wage: " + totalWage);
        System.out.println("Total wage with finctional call: " + getWage(baseSalary, overTimeHours,overTimeRate));

        Employee employee = new Employee(30000, 10,20);
        System.out.println("Total age with OOP approach: " + employee.getWage());
    }

    private static int getWage(int baseSalary, int overTimeHours, int overTimeRate) {
        return baseSalary + (overTimeHours * overTimeRate);
    }
}

class Employee {
    private int baseSalary ;
    private int overTimeHours ;
    private int overTimeRate ;

    public Employee(int baseSalary, int overTimeHours, int overTimeRate) {
        this.baseSalary = baseSalary;
        this.overTimeHours = overTimeHours;
        this.overTimeRate = overTimeRate;
    }
    /*
    Pagal "Clean code knyga, kalbant apie funkcijos parametrus kiek ju turi buti.
    0 - idealu
    1-2 - isskirtiniais atvejais
    4 ir >  - niekada
    Uncle Bob - best functions are those with no parameters
     */
    public int getWage(){
        return this.baseSalary + (overTimeHours*overTimeRate);
    }
}