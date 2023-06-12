package pro.sky.skyprospringdemo.service.Impl;

import org.springframework.stereotype.Service;
import pro.sky.skyprospringdemo.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int plus(Integer num1, Integer num2) {
        return num1+num2;
    }

    @Override
    public int minus(Integer num1, Integer num2) {

        return num1 - num2;
    }

    @Override
    public int multiply(Integer num1, Integer num2) {

        return num1 * num2;
    }

    @Override
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя!");
        }
        return (double) num1 / num2;
    }
}
