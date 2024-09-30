public class Main {
    public static void main(String[] args) {
       int oneYear = 12;
       float upperCoeffForCalc = 0.1f;

       int salaryOfMasha = 67760;
       float salaryOfMashaPerYear = salaryOfMasha*oneYear;
       float salaryOfMashaUpper = salaryOfMasha+(salaryOfMasha*upperCoeffForCalc);
       float salaryOfMashaPerYearUpper = salaryOfMashaUpper*oneYear;
       float salaryDifferenceMasha = salaryOfMashaPerYearUpper-salaryOfMashaPerYear;
       System.out.println("Маша теперь получает "+salaryOfMashaUpper+" рублей. Годовой доход вырос на "
                +salaryDifferenceMasha+" рублей.");

       int salaryOfDenis = 83690;
       float salaryOfDenisPerYear = salaryOfDenis*oneYear;
       float salaryOfDenisUpper = salaryOfDenis+(salaryOfDenis*upperCoeffForCalc);
       float salaryOfDenisPerYearUpper = salaryOfDenisUpper*oneYear;
       float salaryOfDifferenceDenis = salaryOfDenisPerYearUpper-salaryOfDenisPerYear;
       System.out.println("Денис теперь получает "+salaryOfDenisUpper+" рублей. Годовой доход вырос на "
                +salaryOfDifferenceDenis+" рублей.");

       int salaryOfKristy = 76230;
       float salaryOfKristyPerYear = salaryOfKristy*oneYear;
       float salaryOfKristyUpper = salaryOfKristy+(salaryOfKristy*upperCoeffForCalc);
       float salaryOfKristyPerYearUpper = salaryOfKristyUpper*oneYear;
       float salaryDifferenceKristy = salaryOfKristyPerYearUpper-salaryOfKristyPerYear;
       System.out.println("Кристина теперь получает "+salaryOfKristyUpper+" рублей. Годовой доход вырос на "
                +salaryDifferenceKristy+" рублей.");




    }
}