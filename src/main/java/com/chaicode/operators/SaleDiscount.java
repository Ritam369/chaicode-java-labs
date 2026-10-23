package com.chaicode.operators;

/**
 * FlashSale Discount Engine
 *
 * <p>An e-commerce site runs flash sales. Given the original price and discount percentage,
 * return the sale price.
 *
 * <p>Rules:
 * <ul>
 *   <li>salePrice = originalPrice × (1 - discountPercent / 100.0)</li>
 *   <li>Round to 2 decimal places: Math.round(price * 100) / 100.0</li>
 *   <li>If originalPrice is negative or discountPercent is not between 0 and 100 inclusive, return -1.0</li>
 * </ul>
 *
 * @param originalPrice original price in dollars
 * @param discountPercent discount percentage (0–100)
 * @return sale price, or -1.0 for invalid input
 */
public final class SaleDiscount {

    private SaleDiscount() {}

    public static double applyDiscount(double originalPrice, int discountPercent) {
        if (originalPrice < 0 || discountPercent <= 0 || discountPercent >= 100) {
            return -1.0;
        }

        double salePrice = originalPrice * (1 - discountPercent / 100.0);
        return Math.round(salePrice * 100) / 100.0;
    }
}
