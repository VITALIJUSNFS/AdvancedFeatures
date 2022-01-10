package testingRecap;

import org.apache.log4j.Logger;

public class ShapeCalculator {

    private static final Logger LOGGER = Logger.getLogger(Calculator.class);


    public double calculateSquareArea(double height, double width) {

        LOGGER.info("Scenario when one of two values are negative");
        if (height <= 0 || width <= 0) {
            System.out.println("Err, below 0");
        }
        return height * width;
    }

    public double calculateSquareVolume(double height, double width, double length) {
        return height * width * length;
    }
}
