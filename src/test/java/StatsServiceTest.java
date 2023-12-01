import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    public void shouldFindSalesAmountForYear() {
        StatsService service = new StatsService();

        int[] salesInMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.salesAmountForYear(salesInMonth);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindAverageAmountSalePerMonth() {
        StatsService service = new StatsService();

        int[] salesInMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverageSum = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12 ;
        int actualAverageSum = service.averageAmountSalePerMonth(salesInMonth);

        Assertions.assertEquals(expectedAverageSum, actualAverageSum);
    }

    @Test
    public void shouldFindMonthWithMaxSales() {
        StatsService service = new StatsService();

        int[] salesInMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.monthWithMaxSales(salesInMonth);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindMonthWithMinSales() {
        StatsService service = new StatsService();

        int[] salesInMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.monthWithMinSales(salesInMonth);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    public void sholdFindMonthsWithWichLessAverageSales() {
        StatsService service = new StatsService();

        int[] salesInMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 5;
        int actualMonth =  service.calcMonthsWichLessAverageSales(salesInMonth);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    public void  calcMonthsBiggerLessAverageSales() {
        StatsService service = new StatsService();

        int[] salesInMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 7;
        int actualMonth =  service. calcMonthsBiggerLessAverageSales(salesInMonth);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }


}