package com.chaicode.variables;

/**
 * FitTrack Health Dashboard
 *
 * <p>A fitness app shows each user's BMI (Body Mass Index) on their profile.
 *
 * <p>Formula: BMI = weightKg / (heightM × heightM) where heightM = heightCm / 100.0
 *
 * <p>Rules:
 * <ul>
 *   <li>Return BMI rounded to 1 decimal place using Math.round(bmi * 10.0) / 10.0</li>
 *   <li>If heightCm or weightKg is zero or negative, return -1.0</li>
 * </ul>
 *
 * @param weightKg weight in kilograms
 * @param heightCm height in centimeters
 * @return BMI rounded to 1 decimal, or -1.0 for invalid input
 */
public final class FitnessProfile {

    private FitnessProfile() {}

    public static double calculateBmi(double weightKg, int heightCm) {
        if (heightCm <= 0 || weightKg <= 0) {
            return -1.0;
        }
        double heightM = heightCm / 100.0;
        double bmi = weightKg / (heightM * heightM);
        return Math.round(bmi * 10.0) / 10.0;
    }
}
