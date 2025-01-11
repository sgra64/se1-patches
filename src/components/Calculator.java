package components;

import datamodel.Order;
import datamodel.Pricing;
import datamodel.Order.OrderItem;


/**
 * Interface of component that performs price and VAT tax calculations.
 */
public interface Calculator {

    /**
     * Calculate a tax included in a gross (<i>"brutto"</i>) value based
     * on a given tax rate.
     * Applies to VAT taxes called <i>"Mehrwertsteuer" (MwSt.)</i> in Germany.
     * @param grossValue value that includes the tax
     * @param taxRate applicable tax rate
     * @return tax included in gross value or 0L if {@code gross value <= 0L}
     */
    public long calculateIncludedVAT(long grossValue, double taxRate);

    /**
     * Calculate the value of an {@link OrderItem} as: {@code article.unitPrice *
     * number of units ordered}.
     * @param item to calculate value for
     * @param pricing {@link Pricing} to find article unitPrice
     * @return value of ordered item
     * @throws IllegalArgumentException with null arguments
     */
    public long calculateOrderItemValue(OrderItem item, Pricing pricing);

    /**
     * Calculate the VAT included in an order item price uding method:
     * {@code calculateVAT(long grossValue, double taxRate)}.
     * @param item to calculate VAT for
     * @param pricing {@link Pricing} to find VAT tax rate applicable to article
     * @return VAT for ordered item
     * @throws IllegalArgumentException with null arguments
     */
    public long calculateOrderItemVAT(OrderItem item, Pricing pricing);

    /**
     * Calculate the total value of an order from the value of each ordered item,
     * calculated with: {@code calculateOrderItemValue(item)}.
     * @param order to calculate value for
     * @return total value of order
     * @throws IllegalArgumentException with null argument
     */
    public long calculateOrderValue(Order order);

    /**
     * Calculate the total VAT of an order from compounded VAT
     * of order items calculated with: {@code calculateOrderItemVAT(item)}.
     * @param order to calculate VAT tax for
     * @return VAT calculated for order
     * @throws IllegalArgumentException with null argument
     */
    public long calculateOrderVAT(Order order);
}