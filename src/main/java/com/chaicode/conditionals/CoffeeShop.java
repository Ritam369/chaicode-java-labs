package com.chaicode.conditionals;

import com.chaicode.conditionals.model.CoffeeExtras;

/**
 * Bean &amp; Brew Cafe
 *
 * <p>Bean &amp; Brew, the cozy neighborhood cafe, wants to go digital! They
 * need a system that calculates the total price of a coffee order.
 * Here's their menu:
 *
 * <p>Base price by size:
 * <ul>
 *   <li>"small"  → $3.00</li>
 *   <li>"medium" → $4.00</li>
 *   <li>"large"  → $5.00</li>
 * </ul>
 *
 * <p>Add-on for coffee type:
 * <ul>
 *   <li>"regular"    → +$0.00</li>
 *   <li>"latte"      → +$1.00</li>
 *   <li>"cappuccino" → +$1.50</li>
 *   <li>"mocha"      → +$2.00</li>
 * </ul>
 *
 * <p>Optional extras:
 * <ul>
 *   <li>whippedCream → +$0.50 (if true)</li>
 *   <li>extraShot    → +$0.75 (if true)</li>
 * </ul>
 *
 * <p>Rules:
 * <ul>
 *   <li>If size is not "small", "medium", or "large", return -1</li>
 *   <li>If type is not "regular", "latte", "cappuccino", or "mocha", return -1</li>
 *   <li>Return the total price rounded to 2 decimal places</li>
 * </ul>
 *
 * @param size "small", "medium", or "large"
 * @param type "regular", "latte", "cappuccino", or "mocha"
 * @param extras optional extras
 * @return total price or -1 for invalid input
 */
public final class CoffeeShop {

    private CoffeeShop() {}

    public static double calculateCoffeePrice(String size, String type) {
        return calculateCoffeePrice(size, type, new CoffeeExtras());
    }

    public static double calculateCoffeePrice(String size, String type, CoffeeExtras extras) {
        if (!size.equals("small") && !size.equals("medium") && !size.equals("large")) {
            return -1;
        }
        if (!type.equals("regular") && !type.equals("latte") && !type.equals("cappuccino") && !type.equals("mocha")) {
            return -1;
        }
        // Calculating base price
        double basePrice = 0;
        switch (size) {
            case "small":
                basePrice = 3.00;
                break;
            case "medium":
                basePrice = 4.00;
                break;
            case "large":
                basePrice = 5.00;
                break;
        }
        // Add on for coffee type
        double typePrice = 0;
        switch (type) {
            case "regular":
                typePrice = 0.00;
                break;
            case "latte":
                typePrice = 1.00;
                break;
            case "cappuccino":
                typePrice = 1.50;
                break;
            case "mocha":
                typePrice = 2.00;
                break;
        }
        // Calculate extras price
        double extrasPrice = 0;
        if (extras.whippedCream()) {
            extrasPrice += 0.50;
        }
        if (extras.extraShot()) {
            extrasPrice += 0.75;
        }
        // Return total price rounded to 2 decimal places
        return Math.round((basePrice + typePrice + extrasPrice) * 100.0) / 100.0;
    }
}