public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int month = 1;
        while (total <= 2_459_000) {
            total = total + salary;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i > 0; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int Y = 12_000_000;
        int fertility = Y / 1000 * 17;
        int mortality = Y / 1000 * 8;
        for (int i = 2022; i < 2032; i++) {
            System.out.println("Год " + i + ", численность населения составляет " + Y);
            Y = Y + fertility - mortality;
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int contribution = 15000;
        int month = 1;
        while (contribution < 12000000) {
            contribution = contribution * 7 / 1200 + contribution;
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений составляет " + contribution);
                if (contribution > 12000000) {
                    System.out.println("Месяцев для накопления этой суммы понадобилось " + month);
                }
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int contribution = 15000;
        int month = 1;
        while (month < 108) {
            contribution = contribution * 7 / 1200 + contribution;
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений составляет " + contribution);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int dateOfFriday = 2;
        while (dateOfFriday < 31) {
            System.out.println("Сегодня пятница, " + dateOfFriday + "-е число. Необходимо подготовить отчет");
            dateOfFriday = dateOfFriday + 7;
        }
    }
    public static void task8() {
        System.out.println("Задача 8");
        int yearToday = 2022;
        for (int cometIsComing = 0; cometIsComing < (yearToday + 100); cometIsComing = cometIsComing + 79) {
            if (cometIsComing > (yearToday - 200)) {
                System.out.println(cometIsComing);
            }
        }
    }
}
