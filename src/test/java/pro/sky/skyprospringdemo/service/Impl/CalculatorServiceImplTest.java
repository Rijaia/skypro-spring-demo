package pro.sky.skyprospringdemo.service.Impl;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pro.sky.skyprospringdemo.service.CalculatorService;

import static org.assertj.core.api.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {
    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
    @Test
    public void plus1() {
        Integer x = 2;
        Integer y = 5;
        Integer expected = 7;
        Integer actual = calculatorService.plus(x, y);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void plus2() {
        Integer x = 4;
        Integer y = 6;
        Integer expected = 10;
        Integer actual = calculatorService.plus(x, y);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minus1() {
        Integer x = 2;
        Integer y = 5;
        Integer expected = -3;
        Integer actual = calculatorService.minus(x, y);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void minus2() {
        Integer x = 4;
        Integer y = 6;
        Integer expected = -2;
        Integer actual = calculatorService.minus(x, y);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void multiply1() {
        Integer x = 2;
        Integer y = 5;
        Integer expected = 10;
        Integer actual = calculatorService.multiply(x, y);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void multiply2() {
        Integer x = 4;
        Integer y = 6;
        Integer expected = 24;
        Integer actual = calculatorService.multiply(x, y);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void divide1() {
        Integer x = 2;
        Integer y = 5;
        Double expected = 0.4;
        Double actual = calculatorService.divide(x, y);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void divide2() {
        Integer x = 4;
        Integer y = 8;
        Double expected = 0.5;
        Double actual = calculatorService.divide(x, y);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void divide0() {
        Integer x = 4;
        Integer y = 0;
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> calculatorService.divide(x,y));
    }
}