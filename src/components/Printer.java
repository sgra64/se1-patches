package components;

import java.util.Collection;

import datamodel.Customer;
import datamodel.Article;
import datamodel.Order;
import datamodel.Pricing.PricingCategory;


/**
 * Public interface of component that prints (formats) objects of
 * {@link datamodel} classes in a table format created by a
 * {@link TableFormatter} objects wrapping a {@link StringBuffer}.
 * @version <code style=color:green>{@value application.package_info#Version}</code>
 * @author <code style=color:blue>{@value application.package_info#Author}</code>
 */
public interface Printer {

    /**
     * Print objects of class {@link Customer} as table row into a {@link StringBuilder}.
     * @param customers customer objects to print
     * @return StringBuilder with customers rendered as rows in table format
     * @throws IllegalArgumentException with null arguments
     */
    StringBuilder printCustomers(Collection<Customer> customers);

    /**
     * Print objects of class {@link Article} as table rows into a {@link StringBuilder}.
     * @param articles articles to print as rows into table
     * @param pricingCategory {@link PricingCategory} used to print articles (tax rate, currency)
     * @return StringBuilder with articles rendered in table format
     * @throws IllegalArgumentException with null arguments
     */
    StringBuilder printArticles(Collection<Article> articles, PricingCategory pricingCategory);

    /**
     * Print objects of class {@link Order} as table rows into a {@link TableFormatter}.
     * @param orders collection to print as rows into table
     * @return {@link TableFormatter} with orders rendered in table format
     * @throws IllegalArgumentException with null argument
     */
    StringBuilder printOrders(Collection<Order> orders);
}