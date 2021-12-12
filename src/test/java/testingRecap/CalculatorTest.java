package testingRecap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    void add() {
        //given
        int firstNumber = 12;
        int secondNumber = 3;
        //when
        int actualAddResult = calculator.add(firstNumber, secondNumber);
        //then
        assertEquals(15, actualAddResult); //junit ASSERT eQUALS
        assertThat(actualAddResult).isEqualTo(15); //pvz ASSERTJ BILIOTEKA
    }

    @Test
    void testaddMultipleNumbers() {
        //given
        int[] numbersToTest = {5, 2, -6, 8, 1};
        //when
        int actualResult = calculator.addMultipleNumbers(numbersToTest);
        //then
        assertEquals(10, actualResult);
        assertThat(actualResult).isEqualTo(10);
    }

    //atimties
    @Test
    void testSubtractTwoNumbers() {
        int firstNumber = 5;
        int secondNumber = 2;

        int actualResult = calculator.subtract(firstNumber, secondNumber);

        assertEquals(3, actualResult);
    }

    @Test
    void testSubtractMultipleNumbers() {
        int[] numbersToTest = {5, 2, 3, 4, 2};

        int actualResult = calculator.subtractMultipleNumbers(numbersToTest);

        assertThat(actualResult).isEqualTo(-6);
    }

    //daugyba
    @Test
    void multiply() {
        int firstNumber = 10;
        int secondNumber = 5;

        int actualMultiplyResult = calculator.multiply(firstNumber, secondNumber);

        assertThat(actualMultiplyResult).isEqualTo(50);
    }

    @Test
    void multiplyMultiple() {
        int[] numbersToTest = {2, 5, 2, 1, 1};

        int actualMultiplyMultipleResult = calculator.multiplyMultipleNumbers(numbersToTest);

        assertThat(actualMultiplyMultipleResult).isEqualTo(20);
    }

    //devide
    @Test
    void testDivideTwoNumbers() {
        int firstNumber = 4;
        int secondNumber = 2;
        double actualResult = calculator.divide(firstNumber, secondNumber);
        assertThat(actualResult).isEqualTo(2);
    }

    @Test
    void testDivideTwoNumbersWhereResultsIsNotInteger() {
        int firstNumber = 3;
        int secondNumber = 2;
        double actualResult = calculator.divide(firstNumber, secondNumber);
        assertThat(actualResult).isEqualTo(1.5);
    }

    @Test
    void testDivideNumbersByZero() {
        int firstNumber = 3;
        int secondNumber = 0;
        double actualResult = calculator.divide(firstNumber, secondNumber);
        assertThat(actualResult).isEqualTo(1);
    }


}