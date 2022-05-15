package com.first.cucumber.bdd.calculator;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( plugin = {"pretty"},
        glue ="com.first.cucumber.bdd.calculator.steps",
        features = "classpath:features/calculator")
public class CalculatorTest {
}
