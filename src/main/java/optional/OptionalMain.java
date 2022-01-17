package optional;
import java.util.Optional;

public class OptionalMain {

    /**
     * Optional yra konteineris (wrapper klase, kiautas) betkokio tipo.
     * Tame konteineryje gali buti arba nebuti kazkas ideta :)
     */

    public static void main(String[] args) {
        Car car = new Car("Volvo");
        System.out.println(car.getName());
        car = null;

        if(car != null) {
            System.out.println(car.getName());
        } else {
            //daryk kazka kito...
        }

        car = new Car("Lada");

        Optional<Car> optionalCar = Optional.ofNullable(car);

        optionalCar.ifPresent(automobilis -> System.out.println(automobilis.getName()));

        optionalCar.ifPresent(automobilis -> {
            System.out.println(automobilis.getName());
            System.out.println("Labas");
            System.out.println("Viso gero");
            int x = 5 * 3;
            System.out.println(x);
        });

        optionalCar.ifPresent(OptionalMain::doSomeLogic);

        optionalCar.ifPresentOrElse(OptionalMain::doSomeLogic, () -> System.out.println("Nera ka daryt."));

    }

    private static void doSomeLogic(Car automobilis) {
        System.out.println(automobilis.getName());
        System.out.println("Labas");
        System.out.println("Viso gero");
        int x = 5 * 3;
        System.out.println(x);

        System.out.println("***************");
        Car audi = new Car("Audi");
        Optional<Car> garazas = Optional.ofNullable(audi);
        garazas.ifPresentOrElse(car1 -> System.out.println("Vaziuoju"), ()-> System.out.println("Pavoge"));
        garazas.ifPresentOrElse(car2 -> System.out.println("Vaziuoju"), ()-> doSomeLogic());
    }

    private static void doSomeLogic() {
        int a=5, b=3;
        int c = a+b;
        System.out.println(c);
    }


}

