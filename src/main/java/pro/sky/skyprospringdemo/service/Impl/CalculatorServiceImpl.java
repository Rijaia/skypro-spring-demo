package pro.sky.skyprospringdemo.service.Impl;

import org.springframework.stereotype.Service;
import pro.sky.skyprospringdemo.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String plus(Integer num1, Integer num2) {
        return num1+" + "+num2+" = " + num1+num2;
    }

    @Override
    public String minus(Integer num1, Integer num2) {

        return num1 + " - "+ num2 + " = " + (num1 - num2);
    }

    @Override
    public String multiply(Integer num1, Integer num2) {

        return num1 + " * "+ num2 + " = " + (num1 * num2);
    }

    @Override
    public String divide(Integer num1, Integer num2) {
        return num1 + " / "+ num2 + " = " + ((double) num1 / num2);
    }
}
