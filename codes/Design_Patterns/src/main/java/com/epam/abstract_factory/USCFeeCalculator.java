package com.epam.abstract_factory;

public class USCFeeCalculator extends FeeCalculator{
    @Override
    public int calculateFee() {
        return 10000;
    }
}
