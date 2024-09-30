public class Main {
    public static void main(String[] args) {
       int whiteBank = 2;
       int brawnBank = 4;
       int averageBanks = 120;
       int sumOfColorTypesBanks = whiteBank+brawnBank;
       int averageClasses = averageBanks/sumOfColorTypesBanks;
       int whiteBanks = averageClasses*whiteBank;
       int brawnBanks = averageClasses*brawnBank;
        System.out.println("В школе, где "+averageClasses+" классов,нужно "+whiteBanks+" белых банок"+" и "
                +brawnBanks+" банок коричневой краски");

    }
}