package ru.netology.stats;

public class StatsService {

    public long totalOfAllSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageValueOfTheProfitAmount(long[] sales) {
       long sum = totalOfAllSales(sales);
        return  sum / 12;
    }


    public int maxSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale > sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }


    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long monthOfTheLowestSales(long[] month) {
        int count = 0;
        long average = averageValueOfTheProfitAmount(month);
        for (long aboveAverage: month) {
            if (aboveAverage < average) {
                count++;
            }


        }
        return count;

    }


    public long monthOfSaleIsAboveAverage(long[] month) {
        int count = 0;
        long average = averageValueOfTheProfitAmount(month);
        for (long aboveAverage: month) {
            if (aboveAverage > average) {
                count++;
            }


        }
        return count;

    }

}
