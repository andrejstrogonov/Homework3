public class Main {
    public static void main(String[] args) {
        byte lessonLyudmyla = 23;
        byte lessonAnna = 27;
        byte lessonEkaterina = 30;
        short sumOfSheets = 480;
        int sumOfLessons = lessonAnna+lessonEkaterina+lessonLyudmyla;
        int result = sumOfSheets / sumOfLessons;
        System.out.println("На каждого ученика рассчитано "+result+" листов бумаги");
    }
}