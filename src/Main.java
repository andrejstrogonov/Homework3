public class Main {
    public static void main(String[] args) {
        int performanceOfMachine = 16/2;
        int twentyMinutes = 20;
        int twentyMinutePerformance = performanceOfMachine*20;
        System.out.println("За 20 минут машина произвела "+ twentyMinutePerformance + " штук бутылок");
        int day = 60*24;
        int dayPerformance = performanceOfMachine*60*24;
        System.out.println("За сутки машина произвела "+ dayPerformance + " штук бутылок");
        int threeDays = 3*60*24;
        int threeDaysPerformance = dayPerformance*3;
        System.out.println("За 3 дня машина произвела "+ threeDaysPerformance + " штук бутылок");
        int month = 30*day;
        int monthPerformance = dayPerformance*30;
        System.out.println("За месяц машина произвела "+ monthPerformance + " штук бутылок");
        ала
    }
}