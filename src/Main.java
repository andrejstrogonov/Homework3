public class Main {
    public static void main(String[] args) {
        int countsOfBananas = 5;
        int weightOfBanana = 80;
        int sumWieghtOfBananas = countsOfBananas*weightOfBanana;

        int countsOfIceCream = 2;
        int weightOfIceCream = 100;
        int sumWeightOfIceCream = countsOfIceCream*weightOfIceCream;

        int countsOfEggs = 4;
        int weightOfEgg = 70;
        int sumWeightOfEggs = countsOfEggs*weightOfEgg;

        int weightOfMilk = 200;
        int oneOfOneMilk = 100;
        int weightOfMilkMl = 105;
       float weightPerLiterOfMilk = (oneOfOneMilk/weightOfMilkMl)*weightOfMilk;

       float sumOfWeights = sumWieghtOfBananas+sumWeightOfIceCream+sumWeightOfEggs+weightPerLiterOfMilk;
       System.out.println("Общий вес в граммах равен: "+ sumOfWeights);
       float sumOfWeightsKg = sumOfWeights/1000;
       System.out.println("Общий вес в килограммах равен: "+ sumOfWeightsKg);
    }
}