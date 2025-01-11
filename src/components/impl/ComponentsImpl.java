package components.impl;

import components.Calculator;
import components.Components;
import components.DataFactory;
import components.Printer;


public final class ComponentsImpl implements Components {

    private final static Components instance = new ComponentsImpl();

    private final Calculator calculator = new CalculatorImpl_Mock();

    private final DataFactory dataFactory = new DataFactoryImpl();

    private final Printer printer = new PrinterImpl_Mock();


    public static Components getInstance() {
        return instance;
    }

    private ComponentsImpl() { }


    @Override
    public Calculator getCalculator() {
        return calculator;
    }

    @Override
    public DataFactory getDataFactory() {
        return dataFactory;
    }

    @Override
    public Printer getPrinter() {
        return printer;
    }
}