public class Main {
    public static void main(String[] args) {
        // homework 07 started
        // chapter 1, task 1
        double deposit = 15000;
        double total = 0;
        int month = 1;
        while (total <= 2_459_000) {
            total = total + total / 100;
            total = total + deposit;
            String round = String.format("%.2f", total);
            System.out.println("Month " + month + " amount of savings equals " + round + " rubles.");
            month++;
        }

        // chapter 1, task 2
        int numericalSeries = 0;
        int numericalSeries1 = 0;
        while (numericalSeries < 10) {
            numericalSeries++;
            System.out.print(numericalSeries + " ");
        }
        System.out.println("\n");
        for (numericalSeries1 = 10; numericalSeries1 > 0; numericalSeries1--) {
            System.out.print(numericalSeries1 + " ");
        }
        System.out.println("\n");

        // chapter 1, task 3
        long population = 12_000_000;
        int birthRate = 17;
        int mortalityRate = 8;
        int populationGrowth = birthRate - mortalityRate;
        int year = 0;
        while (year < 10) {
            population = population + (population * populationGrowth) / 1000;
            year++;
            System.out.println("Year " + year + ", the population size is " + population);
        }

        // chapter 2, task 1
        double deposit1 = 15000;
        int month1 = 0;
        while (deposit1 <= 12_000_000) {
            deposit1 = deposit1 + deposit1 / 100 * 7;
            month1++;
            String round = String.format("%.2f", deposit1);
            System.out.println("Month " + month1 + " amount of savings equals " + round + " rubles.");
        }

        // chapter 2, task 2
        double deposit2 = 15000;
        int month2 = 0;
        while (deposit2 <= 12_000_000) {
            deposit2 = deposit2 + deposit2 / 100 * 7;
            month2++;
            if (month2 % 6 == 0) {
                String round1 = String.format("%.2f", deposit2);
                System.out.println("Month " + month2 + " amount of saving equals " + round1 + " rubles.");
            }
        }

        // chapter 2, task 3
        double deposit3 = 15000;
        int years = 9;
        int monthsOfDeposit = years * 12;
        int month3 = 0;
        for (month3 = 1; month3 <= monthsOfDeposit; month3++) {
            deposit3 = deposit3 + deposit3 / 100 * 7;
            if (month3 % 6 == 0) {
                String round = String.format("%.2f", deposit3);
                System.out.println("Month " + month3 + " amount of saving equals " + round + " rubles.");
            }
        }

        // chapter 2, task 4
        int firstFridayOfTheMonth = 7;
        while (firstFridayOfTheMonth <= 31) {
            System.out.println("Today's friday, " + firstFridayOfTheMonth + " day of month. Need to prepare a report.");
            firstFridayOfTheMonth = firstFridayOfTheMonth + 7;
        }

        // chapter 3, task 1
        int currentYear = 2022;
        int endOfPeriod = currentYear + 100;
        int startOfPeriod = currentYear - 200;
        int cometAppeared = 79;
        int year1 = 0;
        while(year1 <= currentYear) {
            year1 = year1 + cometAppeared;
            if (year1 >= startOfPeriod && year1 <= currentYear)
                System.out.println("Comet appeared in " + year1);
            else if (year1 <= endOfPeriod && year1 > currentYear)
                System.out.println("Comet will appear in " + year1);
        }

        //chapter 3, task 2
        int multiplier = 2;
        int multiplicand = 1;
        do {
            System.out.println(multiplicand + " * " + multiplier + " = " + multiplicand * multiplier);
            multiplicand++;
        } while(multiplicand <=10);
    }
}
