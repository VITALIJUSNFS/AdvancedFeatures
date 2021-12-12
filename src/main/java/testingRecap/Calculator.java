package testingRecap;

import org.apache.log4j.Logger;
import java.util.Arrays;

public class Calculator {

    private static final Logger LOGGER = Logger.getLogger(Calculator.class);

    public int add(int firstNumber, int secondNumber) {
        LOGGER.info("Adding two numbers " + firstNumber + " add " + secondNumber);
        return firstNumber + secondNumber;
    }

    public int addMultipleNumbers(int[] numbers) {
        LOGGER.info("Adding two numbers " + Arrays.toString(numbers));
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
    //atimties metodas
    public int subtract(int firstNumber, int secondNumber) {
        LOGGER.info("Subtracting two numbers " + firstNumber + " minus " + secondNumber);
        return firstNumber - secondNumber;
    }

    public int subtractMultipleNumbers(int[] numbers) {
        LOGGER.info("Subtracting numbers " + Arrays.toString(numbers));
        int total = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            total -= numbers[i];
        }

        return total;
    }

//multiply
    public int multiply(int firstNumber, int secondNumber) {
        LOGGER.info("Multiple " + firstNumber + " x " + secondNumber);
        return firstNumber * secondNumber;
    }

    public  int multiplyMultipleNumbers(int [] numbers) {
        LOGGER.info("Multiple " + Arrays.toString(numbers));
        int total = 1;
        for (int number : numbers) {
            total = total * number;
        }
        return total;
    }
//devide

        public double divide( int firstNumber, int secondNumber){
            return  (double) firstNumber/secondNumber;
    }

}
