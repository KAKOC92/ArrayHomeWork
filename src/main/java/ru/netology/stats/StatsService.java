package ru.netology.stats;

public class StatsService {

    public int salesAmountForYear(int[] salesInMonth) {                 //сумма продаж за год
        int sum = 0;
        for (int i = 0; i < salesInMonth.length; i++) {
            sum = sum + salesInMonth[i];
        }
        return sum;
    }

    public int averageAmountSalePerMonth(int[] salesInMonth) {         // средняя сумма продаж за год
        int sum = 0;
        for (int i = 0; i < salesInMonth.length; i++) {
            sum = (sum + salesInMonth[i]) / 12;
        }
        return sum;
    }

}
