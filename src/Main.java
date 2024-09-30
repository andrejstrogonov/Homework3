public class Main {
    public static void main(String[] args) {
        int averageOfWeightKg = 7;
        int averageGrammsToKg = 1000;
        int firstStrategyG = 250;
        int secondStrategyG = 500;

        int firstStrategy = (averageGrammsToKg*averageOfWeightKg)/firstStrategyG;
        System.out.println("Дней по стратегии 250 г за день: "+firstStrategy);
        int secondStrategy = (averageGrammsToKg*averageOfWeightKg)/secondStrategyG;
        System.out.println("Дней по стратегии 500 г за день: "+secondStrategy);
    }
}