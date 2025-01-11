package components.impl;

import java.util.Optional;
import java.util.function.Function;

import components.DataFactory;
import datamodel.Article;
import datamodel.Customer;
import datamodel.OrderBuilder;
import datamodel.Pricing.PricingCategory;
import datamodel.Pricing.TAXRate;


final class DataFactoryImpl implements DataFactory {

    private final datamodel.DataFactory dataFactory = datamodel.DataFactory.getInstance();

    @Override
    public Optional<Customer> createCustomer(String name, String contact) {
        return dataFactory.createCustomer(name, contact);
    }

    @Override
    public Optional<Article> createArticle(String description, long unitPrice, PricingCategory pricingCategory, TAXRate... taxRate) {
        return dataFactory.createArticle(description, unitPrice, pricingCategory, taxRate);
    }

    @Override
    public OrderBuilder createOrderBuilder(PricingCategory pricingCategory,
            Function<String, Optional<Customer>> customerFetcher, Function<String, Optional<Article>> articleFetcher)
    {
        return dataFactory.createOrderBuilder(pricingCategory, customerFetcher, articleFetcher);
    }
}