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

        int expectedSum = 15;
        int actualSum = service.salesAmountForYear(salesInMonth);

        Assertions.assertEquals(expectedSum, actualSum);
    }
}
