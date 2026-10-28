package com.chaicode.conditionals;

/**
 * Ms. Parker's Report Cards
 *
 * <p>Ms. Parker teaches 8th-grade science and needs help converting
 * percentage scores into letter grades for report cards. She also
 * rewards students who earned extra credit by adding 5 bonus points
 * to their score — but the final score can never go above 100.
 *
 * <p>Grading Scale:
 * <ul>
 *   <li>90–100 → "A"</li>
 *   <li>80–89  → "B"</li>
 *   <li>70–79  → "C"</li>
 *   <li>60–69  → "D"</li>
 *   <li>0–59   → "F"</li>
 * </ul>
 *
 * <p>Rules:
 * <ul>
 *   <li>Check validity FIRST: if the original score is less than 0
 *       or greater than 100, return "INVALID"</li>
 *   <li>If hasExtraCredit is true, add 5 points AFTER validation
 *       (cap the result at 100)</li>
 *   <li>Then determine the letter grade from the adjusted score</li>
 * </ul>
 *
 * @param score the student's percentage score (0-100)
 * @param hasExtraCredit whether the student has extra credit
 * @return the letter grade or "INVALID"
 */
public final class GradeCalculator {

    private GradeCalculator() {}

    public static String calculateGrade(int score, boolean hasExtraCredit) {
        if (score < 0 || score > 100) {
            return "INVALID";
        }
        if (hasExtraCredit) {
            score += 5;
            if (score > 100) {
                score = 100;
            }
        }
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
