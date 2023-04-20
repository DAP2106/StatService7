package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTests {

    @Test
    void sumSales() {
        StatsService service = new StatsService();
        int expected = 180;
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.sumSales(sales);


        Assertions.assertEquals(expected, actual);
    }

    @Test
    void avergSales() {
        StatsService service = new StatsService();
        double expected = 15;
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double actual = service.avergSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void minSales() {
        StatsService service = new StatsService();

        int expected = 9;
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.minSales(sales);


        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxSales() {
        StatsService service = new StatsService();

        int expected = 8;

        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        int actual = service.maxSales(sales);


        Assertions.assertEquals(expected, actual);

    }

    @Test
    void lessThanAvergSales() {
        StatsService service = new StatsService();

        int expected = 7;

        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.lessThanAvergSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void biggerAvergSales() {
        StatsService service = new StatsService();
        int expected = 7;

        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.biggerAvergSales(sales);

        Assertions.assertEquals(expected, actual);
    }


}

