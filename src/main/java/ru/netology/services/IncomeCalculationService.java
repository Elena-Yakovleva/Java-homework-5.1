package ru.netology.services;

public class IncomeCalculationService {
    public int calculate(int income, int expenses, int threshold) {

        int count = 0;
        int money = 0;

//        System.out.println("Месяц 0" + " Придётся работать. " + "Заработал " + income + " Потратил " + expenses);
//        money = income - expenses;

        for (int month = 1; month < 12; month++) {
            if (money >= threshold) {
                count++;
//              System.out.println("Месяц " + month + " Денег " + money + " Йо-хо-хо! Я отдыхаю! " + "Потратил " + expenses + " Потратил на отпуск " + (money - (money / 3)));
                money = ((money - expenses) / 3);


            } else {

//              System.out.println("Месяц " + month + " Денег " + money + " Придётся работать. " + "Заработал " + income + " Потратил " + expenses);
                money = money + income - expenses;
            }
        }
        return count;


    }

}

