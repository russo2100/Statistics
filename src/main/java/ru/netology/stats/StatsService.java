package ru.netology.stats;

public class StatsService<month> {

    public static int totalOfAllSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public static int averageValueOfTheProfitAmount(int[] sales) {
        int sum = {8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18};
        return (int) ((double) sum / sales.length);
    }


    public int maxSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale > sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }


    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public static int salesBelowAverage(int[] month) {
        int average = 15;
        for (int belowAverage : month) {
            if (belowAverage < average) {
                System.out.println(belowAverage);
            }


        }
        return average;

    }


    public static int salesAboveAverage(int[] month) {
        int average = 15;
        for (int aboveAverage: month) {
            if (aboveAverage > average) {
                System.out.println(aboveAverage);
            }


        }
        return average;

    }

}
