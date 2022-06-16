import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {


    @Test
    public void monthMaximumSumSales() {
        StatsService service = new StatsService();
       long[] sum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 8+15+13+15+17+20+19+20+7+14+14+18;

        long actualMonth = service.totalOfAllSales(sum);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }


    @Test
    public void averageValueOfTheProfitAmount() {
        StatsService service = new StatsService();
        long[] average = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 15;
        long actualSum = service.averageValueOfTheProfitAmount(average);

        Assertions.assertEquals(expectedSum, actualSum);
    }


    @Test
    public void monthMaximumSales() {
        StatsService service = new StatsService();
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 6;

        long actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }


    @Test
    public void monthMinimumSales() {
        StatsService service = new StatsService();
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;

        long actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }


    @Test
    public void MonthOfTheLowestSales() {
        StatsService service = new StatsService();
       long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverage = 15;
         long actualAverage = (long) service.MonthOfTheLowestSales(month);

        Assertions.assertEquals(expectedAverage,actualAverage);
    }


    @Test
    public void MonthOfSaleIsAboveAverage() {
        StatsService service = new StatsService();
       long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = (int) service.MonthOfSaleIsAboveAverage(month);

        Assertions.assertEquals(expectedAverage,actualAverage);
    }
}

