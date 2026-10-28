package com.chaicode.conditionals;

/**
 * City Central Parking
 *
 * <p>City Central Parking garage is the busiest in downtown. They need an
 * automated system to calculate parking fees. Different vehicle types
 * have different rates, and there's a daily maximum so customers
 * aren't overcharged.
 *
 * <p>Rates (first hour / each additional hour):
 * <ul>
 *   <li>"car":        $5 first hour, then $3/hour</li>
 *   <li>"motorcycle": $3 first hour, then $2/hour</li>
 *   <li>"bus":        $10 first hour, then $7/hour</li>
 * </ul>
 *
 * <p>Daily Maximum (fee can never exceed this):
 * <ul>
 *   <li>"car":        $30</li>
 *   <li>"motorcycle": $18</li>
 *   <li>"bus":        $60</li>
 * </ul>
 *
 * <p>Rules:
 * <ul>
 *   <li>Partial hours are rounded UP (e.g., 1.5 hours → 2 hours)</li>
 *   <li>The fee should never exceed the daily maximum</li>
 *   <li>If hours is 0 or negative, return -1</li>
 *   <li>If vehicleType is not "car", "motorcycle", or "bus", return -1</li>
 * </ul>
 *
 * <p>Examples:
 * <ul>
 *   <li>car, 1 hour     → $5</li>
 *   <li>car, 3 hours    → $5 + $3 + $3 = $11</li>
 *   <li>car, 0.5 hours  → rounds up to 1 hour → $5</li>
 *   <li>car, 24 hours   → $5 + 23×$3 = $74 → capped at $30</li>
 * </ul>
 *
 * @param hours number of hours parked
 * @param vehicleType "car", "motorcycle", or "bus"
 * @return parking fee or -1 for invalid input
 */
public final class ParkingFee {

    private ParkingFee() {}

    public static int calculateParkingFee(double hours, String vehicleType) {
        if (hours <= 0) {
            return -1;
        }
        if (!vehicleType.equals("car") && !vehicleType.equals("motorcycle") && !vehicleType.equals("bus")) {
            return -1;
        }
        switch (vehicleType) {
            case "car":
                {
                    int parkingFee = 5;
                    int additionalHours = (int) Math.ceil(hours) - 1;
                    if (additionalHours > 0) {
                        parkingFee += additionalHours * 3;
                    }
                    return Math.min(parkingFee, 30);
                }
            case "motorcycle":
                {
                    int parkingFee = 3;
                    int additionalHours = (int) Math.ceil(hours) - 1;
                    if (additionalHours > 0) {
                        parkingFee += additionalHours * 2;
                    }
                    return Math.min(parkingFee, 18);
                }
            case "bus":
                {
                    int parkingFee = 10;
                    int additionalHours = (int) Math.ceil(hours) - 1;
                    if (additionalHours > 0) {
                        parkingFee += additionalHours * 7;
                    }
                    return Math.min(parkingFee, 60);
                }
            default:
                return -1;
        }
    }
}
