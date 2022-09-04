public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Task-1.
        printIsLeap(2022);
        //task-2.
        printInstallOs(0, 2014);
        //Task-3.
        printDeliveryDays(150);

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
    public static void printInstallOs(int osVersion, int productYear) {
        if (osVersion == 0 && productYear >= 2015) {
            System.out.println("Установите приложение для iOS по ссылке");
        } else {
            if (osVersion == 0 && productYear < 2015) {
                System.out.println("Установите облегченное приложение для iOS по ссылке");
            }
            if (osVersion == 1 && productYear >= 2015) {
                System.out.println("Установите приложение для Android по ссылке");
            } else {
                if (osVersion == 1 && productYear < 2015) {
                    System.out.println("Установите облегченное приложение для Android по ссылке");
                }
            }
        }
    }
    public static void printDeliveryDays(int distance) {
        int deliveryDays = 1;
        int interval = 40;
        int startInterval = 20;
        if (distance <=20 ) {
            deliveryDays = 1;
        }else{
            deliveryDays = deliveryDays + (int) Math.ceil((distance - startInterval) / (double) interval) ;
        }
        System.out.println("Потребуется дней : " + deliveryDays);
    }

}