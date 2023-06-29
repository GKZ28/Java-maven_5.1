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

public class VacationServiceTest {
    @Test
    public void testCalculateVacationMonths1() {
        VacationService vacationService = new VacationService();
        int months = vacationService.calculateVacationMonths(10_000, 3_000, 20_000);
    }

    @Test
    public void testCalculateVacationMonths2() {
        VacationService vacationService = new VacationService();
        int months = vacationService.calculateVacationMonths(100_000, 60_000, 150_000);
    }
}
