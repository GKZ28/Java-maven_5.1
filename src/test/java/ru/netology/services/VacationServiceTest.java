//package ru.netology.services;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Assertions;
//import ru.netology.services.VacationService;
//
//public class testVacationService {
//    @Test
//    public void testCalculateVacationMonths1() {
//        VacationService vacationServiceTest = new VacationService();
//                int month = vacationServiceTest.calculateVacationMonths( 10_000, 3_000, 20_000);
//
//    }
//
//    @Test
//    public void testCalculateVacationMonths2() {
//        VacationService vacationServiceTest = new VacationService();
//        int month = vacationServiceTest.calculateVacationMonths( 100_000, 60_000, 150_000);
//
//    }
//}

package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class VacationServiceTest {
    @ParameterizedTest
    @CsvSource({
            "10000, 3000, 20000",
            "100000, 60000, 150000"
    })

    public void testCalculateVacationMonths1(int income, int expense, int threshold) {
        VacationService vacationService = new VacationService();
        int months = vacationService.calculateVacationMonths( income, expense, threshold);
    }
}

//    @Test
//    public void testCalculateVacationMonths2() {
//        VacationService vacationService = new VacationService();
//        int months = vacationService.calculateVacationMonths(100_000, 60_000, 150_000);
//    }
//}
