package com.first.cucumber.bdd.loyalty;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( plugin = {"pretty"},
        glue ="com.first.cucumber.bdd.loyalty.steps",
        features = "classpath:features/loyalty")
public class LoyaltyTest {

}
