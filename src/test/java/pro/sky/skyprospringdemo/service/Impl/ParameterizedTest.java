package pro.sky.skyprospringdemo.service.Impl;

import net.bytebuddy.asm.Advice;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ParameterizedTest {
    private final CalculatorServiceImpl calculatorService = new  CalculatorServiceImpl();

    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(2,5),
                Arguments.of(4,6),
                Arguments.of(3,0),
                Arguments.of(0,3),
                Arguments.of(-4,5),
                Arguments.of(3,-8)
        );
    }

    @org.junit.jupiter.params.ParameterizedTest
    @MethodSource ("argumentsStream")
    public void shouldCorrectCalculatePlus(int num1, int num2) {

        Assertions.assertEquals(num1+num2, calculatorService.plus(num1,num2));

    }

    @org.junit.jupiter.params.ParameterizedTest
    @MethodSource ("argumentsStream")
    public void shouldCorrectCalculateMinus(int num1, int num2) {

        Assertions.assertEquals(num1-num2, calculatorService.minus(num1,num2));

    }
    @org.junit.jupiter.params.ParameterizedTest
    @MethodSource ("argumentsStream")
    public void shouldCorrectCalculateMultiply(int num1, int num2) {

        Assertions.assertEquals(num1*num2, calculatorService.multiply(num1,num2));

    }
    @org.junit.jupiter.params.ParameterizedTest
    @MethodSource ("argumentsStream")
    public void shouldCorrectCalculateDivide(double num1, double num2) {

        Assertions.assertEquals(num1 / num2, calculatorService.divide(num1,num2));

    }


}
