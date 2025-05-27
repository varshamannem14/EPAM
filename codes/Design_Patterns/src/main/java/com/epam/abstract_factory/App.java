package com.epam.abstract_factory;

public class App {
    public static void main(String[] args) {
        int entranceExamScore = 109;

        UniversityFactory factory = UniversityFactory.getUniversity(entranceExamScore);
        AdmitCard admitCardOne = factory.getAdmitCard("Math");
        admitCardOne.card();
        FeeCalculator feeCalculatorOne = factory.getFeeCalculator("Math");
        System.out.println(feeCalculatorOne.calculateFee());


    }
}
