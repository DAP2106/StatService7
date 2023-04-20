package ru.netology.stats;

public class StatsService {

    public int sumSales(long[] sales) {
        int sumMonth = 0;
        for (long purchase : sales) {
            sumMonth += purchase;

        }
        return sumMonth;
    }

    public double avergSales(long[] sales) {
        double avergSum = 0;
        double sumMonth = 0;

        sumMonth = sumSales(sales);
        avergSum = sumMonth / sales.length;

        return avergSum;
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int lessThanAvergSales(long[] sales) {
        int lessAvergMonth = 0;
        double avergSum = avergSales(sales);

        for (long sale : sales) {
            if (sale <= avergSum) {
                lessAvergMonth++;
            }
        }
        return lessAvergMonth;
    }

    public int biggerAvergSales(long[] sales) {
        int biggerAvergMonth = 0;
        double avergSum = avergSales(sales);

        for (long sale : sales) {
            if (sale >= avergSum) {
                biggerAvergMonth++;
            }
        }
        return biggerAvergMonth;
    }
}