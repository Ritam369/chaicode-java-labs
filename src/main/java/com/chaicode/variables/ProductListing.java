package com.chaicode.variables;

import com.chaicode.variables.model.ProductItem;

/**
 * GreenBasket Grocery Listings
 *
 * <p>You're building product cards for an online grocery app. Each card shows the item name,
 * stock quantity, line total, and whether it's organic.
 *
 * <p>Format (exactly):
 * <pre>
 * Organic Tomatoes x3 = $4.50
 * Regular Milk x2 = $6.00
 * </pre>
 *
 * <p>Rules:
 * <ul>
 *   <li>Line total = quantity × unitPrice, shown with 2 decimal places</li>
 *   <li>Prefix "Organic " when isOrganic is true; otherwise "Regular "</li>
 *   <li>Use String.format for the price part: "%.2f"</li>
 * </ul>
 *
 * @param item the product item
 * @return formatted listing line
 */
public final class ProductListing {

    private ProductListing() {}

    public static String formatListing(ProductItem item) {
        String name = item.isOrganic() ? "Organic " + item.name() : "Regular " + item.name();
        double lineTotal = item.quantity() * item.unitPrice();
        return String.format("%s x%d = $%.2f", name, item.quantity(), lineTotal);
    }
}
