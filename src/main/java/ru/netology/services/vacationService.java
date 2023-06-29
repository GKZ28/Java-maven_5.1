package ru.netology.services;

public class vacationService {
    public int calculateVacationMonths (int income, int expense, int treshold) {

        int money = 0;

        int month;
        for (month = 0; month <= 12; month++) {
            if (money <= treshold) {
                System.out.println("Месяц " + month++ + "." + " Денег " + money + " Придется работать. " + "Заработал " + income + "," + "потратил -" + expense);
                money = money + income - expense;
            } else {
                System.out.println("Месяц " + month++ + "." + " Денег " + money + " Буду отдыхать. " + "Заработал " + income + "," + "потратил -" + expense);
                money = (money - expense) / 3;
            }
        }
        return month;
    }
}


//    public static void main(String[] args) {
//
//        int income = 100_000; // доход за месяц
//        int expense = 60_000; // Обязательные месячные расходы
//        int threshold = 150_000; // Необходимый минимум для отдыха
//        int money = 0; // Кол-во денег
//        int month = 1; // Месяц
//
//        while (month < 13) {
//            if (money < threshold) {
//                System.out.println("Месяц " + month++ + "." + " Денег " + money + " Придется работать. " + "Заработал " + income + "," + "потратил -" + expense);
//                money = money + income - expense;
//            } else {
//                System.out.println("Месяц " + month++ + "." + " Денег " + money + " Буду отдыхать. " + "Заработал " + income + "," + "потратил -" + expense);
//                money = (money - expense) / 3;
//
//            }