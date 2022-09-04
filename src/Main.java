public class Main {
    public static void printSeparator (){
        System.out.println("++++++++++++++++++");
        System.out.println("------------------");
    }
    public static void printIssues (int issueCount)   {
        System.out.println(issueCount);
    }
    public static int sum (int[] nambers) {
        int sum = 0;
        for (int i = 0; i < nambers.length; i++) {
            sum = sum + nambers[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] issuesByMonth = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8};
        printSeparator();
        for (int i = 0; i < issuesByMonth.length; i++) {
            printIssues(issuesByMonth[i]);
            if ((i+1)%3 == 0) {
                printSeparator();
            }
        }
        printSeparator();
        int total = sum(issuesByMonth);
        printIssues(total);
    }
}