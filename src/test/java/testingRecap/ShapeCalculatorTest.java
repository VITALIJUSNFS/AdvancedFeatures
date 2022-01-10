package testingRecap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ShapeCalculatorTest {

    @Test
    void testCalculateSquareArea() {
        //given
        ShapeCalculator shapeCalculator =  new ShapeCalculator();
        double squareWidth = 5.5;
        double squareHeight = 6.8;

        //when //ctrl+alt v
        double squareArea = shapeCalculator.calculateSquareArea(squareHeight,squareWidth);

        //then
        assertThat(squareArea).isEqualTo(37.4);
    }

    @Test
    void shouldReturnZeroWhenParameterAreNegative() {
        ShapeCalculator shapeCalculator = new ShapeCalculator();

        double squareWidth = - 5.5;
        double squareHeight = - 6.8;

        double squareArea = shapeCalculator.calculateSquareArea(squareHeight,squareWidth);
        assertThat(squareArea).isEqualTo(37.4);
    }

    @Test
    void testCalculateSquareVolume() {
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        double squareWidth = 5.5;
        double squareHeight = 6.8;
        double squareLength = 2;

        double squareVolume = shapeCalculator. calculateSquareVolume(squareHeight,squareWidth,squareLength);

        assertThat(squareVolume).isEqualTo(74.8);
    }
}