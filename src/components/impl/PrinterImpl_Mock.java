package components.impl;

import java.util.Collection;

import application.Application_E12;
import components.Printer;
import datamodel.Article;
import datamodel.Customer;
import datamodel.Order;
import datamodel.Pricing.PricingCategory;


final class PrinterImpl_Mock implements Printer {

    private final Application_E12 e12 = new Application_E12();

    @Override
    public StringBuilder printCustomers(Collection<Customer> customers) {
        // return d12.printCustomers(customers);
        // 
        // TODO Auto-generated method stub
        try {
            throw new UnsupportedOperationException("Unimplemented method 'printCustomers'");
        } catch(UnsupportedOperationException uoe) {
            System.out.println(String.format("%s", uoe.getMessage()));
        }
        return new StringBuilder();
    }

    @Override
    public StringBuilder printArticles(Collection<Article> articles, PricingCategory pricingCategory) {
        // return d12.printArticles(articles, pricingCategory);
        // 
        // TODO Auto-generated method stub
        try {
            throw new UnsupportedOperationException("Unimplemented method 'printArticles'");
        } catch(UnsupportedOperationException uoe) {
            System.out.println(String.format("%s", uoe.getMessage()));
        }
        return new StringBuilder();
    }

    @Override
    public StringBuilder printOrders(Collection<Order> orders) {
        return e12.printOrders(orders);
    }
}