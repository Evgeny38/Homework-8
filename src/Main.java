import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Task-1.
        printIsLeap(2022);
        //task-2.
        printInstallOs(0, 2015);
        //Task-3.
        System.out.println("Потребуется дней : " + printDeliveryDays(95));


    }
    // Task-1.
    private static void printIsLeap ( int year ){
        if (year%4 == 0 && year%100 != 0 || year%400 == 0) {
            System.out.println(year + " - высокосный год");
        }else {
            System.out.println(year + " - не высокосный год");
        }
    }
    // Task-2.
    private static void printInstallOs(int osVersion, int productYear) {
        int currentYear  = LocalDate.now().getYear();
        if (osVersion == 0 && productYear >= currentYear) {
            System.out.println("Установите приложение для iOS по ссылке");
        } else {
            if (osVersion == 0 && productYear < currentYear) {
                System.out.println("Установите облегченное приложение для iOS по ссылке");
            }
            if (osVersion == 1 && productYear >= currentYear) {
                System.out.println("Установите приложение для Android по ссылке");
            } else {
                if (osVersion == 1 && productYear < currentYear) {
                    System.out.println("Установите облегченное приложение для Android по ссылке");
                }
            }
        }
    }
    // Task-3.
    private static int printDeliveryDays(int distance) {
        int printDeliveryDays = 1;
        int interval = 40;
        int startInterval = 20;
        if (distance <=20 ) {
            printDeliveryDays = 1;
        }else{
            printDeliveryDays = printDeliveryDays + (int) Math.ceil((distance - startInterval) / (double) interval);
        }
        return printDeliveryDays;
    }

}