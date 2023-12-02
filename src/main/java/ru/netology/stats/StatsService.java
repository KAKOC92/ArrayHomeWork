package ru.netology.stats;

public class StatsService {

    public int salesAmountForYear(int[] salesInMonth) {                 //сумма продаж за год
        int sum = 0;
        for (int i = 0; i < salesInMonth.length; i++) {
            sum = sum + salesInMonth[i];
        }
        return sum;
    }

    public int averageAmountSalePerMonth(int[] salesInMonth) {         // средняя сумма продаж в месяц
        int sum = 0;
        for (int i = 0; i < salesInMonth.length; i++) {
            sum = sum + salesInMonth[i];
        }
        int averageSum = sum / 12;
        return averageSum;
    }

    public int monthWithMaxSales(int[] salesInMonth) {                //номер месяца, в котором был пик продаж
        int maxMonth = 0;
        for (int i = 0; i < salesInMonth.length; i++) {
            if (salesInMonth[i] >= salesInMonth[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int monthWithMinSales(int[] salesInMonth) {              //номер месяца, в котором был минимум продаж
        int minMonth = 0;
        for (int i = 0; i < salesInMonth.length; i++) {
            if (salesInMonth[i] <= salesInMonth[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int calcMonthsWichLessAverageSales(int[] salesInMonth) { //количество месяцев, в которых продажи были ниже среднего
        int avarageSum = averageAmountSalePerMonth(salesInMonth);
        int monthCounter = 0;
        for (int i = 0; i < salesInMonth.length; i++) {
            if (salesInMonth[i] < avarageSum) {
                monthCounter++;
            }
        }
        return monthCounter;

    }

    public int calcMonthsBiggerLessAverageSales(int[] salesInMonth) {
        int avarageSum = averageAmountSalePerMonth(salesInMonth);
        int monthCounter = 0;
        for (int i = 0; i < salesInMonth.length; i++) {
            if (salesInMonth[i] >= avarageSum) {
                monthCounter++;
            }
        }
        return monthCounter;

    }
}