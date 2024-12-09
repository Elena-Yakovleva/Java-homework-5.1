package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AssertionsKt;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class IncomeCalculationServiceTest {

    @ParameterizedTest
/*    @CsvSource({
            "3, 10000, 3000, 20000",
            "2, 100000, 60000, 150000"
    })
*/
    @CsvFileSource(files = "src/test/resources/vacationPlan.csv")

    public void vacationPlan(int expected, int income, int expenses, int threshold) {

        IncomeCalculationService service = new IncomeCalculationService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}



/*
    @Test
    public void vacationPlan_10000_3000_20000() {
        IncomeCalculationService service = new IncomeCalculationService();

        int expected = 3;
        int actual = service.calculate(10000, 3000, 20000);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void vacationPlan_100000_60000_150000() {
        IncomeCalculationService service = new IncomeCalculationService();

        int expected = 2;
        int actual = service.calculate(100000, 60000, 150000);

        Assertions.assertEquals(expected, actual);

    }
*/

