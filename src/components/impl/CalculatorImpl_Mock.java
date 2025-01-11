package components.impl;

import components.Calculator;
import datamodel.Order;
import datamodel.Order.OrderItem;
import datamodel.Pricing;


final class CalculatorImpl_Mock implements Calculator {

    @Override
    public long calculateIncludedVAT(long grossValue, double taxRate) { return 0L; }

    @Override
    public long calculateOrderItemValue(OrderItem item, Pricing pricing) { return 0L; }

    @Override
    public long calculateOrderItemVAT(OrderItem item, Pricing pricing) { return 0L; }

    @Override
    public long calculateOrderValue(Order order) { return 0L; }

    @Override
    public long calculateOrderVAT(Order order) { return 0L; }
}