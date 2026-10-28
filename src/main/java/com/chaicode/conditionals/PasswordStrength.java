package com.chaicode.conditionals;

/**
 * SecureApp Password Checker
 *
 * <p>You're building the signup page for SecureApp, a new productivity tool.
 * The product manager wants a password strength meter that gives users
 * real-time feedback as they type their password.
 *
 * <p>The checker evaluates 5 criteria:
 * <ol>
 *   <li>At least 8 characters long</li>
 *   <li>Contains at least one uppercase letter (A-Z)</li>
 *   <li>Contains at least one lowercase letter (a-z)</li>
 *   <li>Contains at least one number (0-9)</li>
 *   <li>Contains at least one special character (!@#$%^&amp;*()_+-=[]{}|;:,.&lt;&gt;?)</li>
 * </ol>
 *
 * <p>Strength levels based on how many criteria are met:
 * <ul>
 *   <li>0–1 criteria → "weak"</li>
 *   <li>2–3 criteria → "medium"</li>
 *   <li>4 criteria   → "strong"</li>
 *   <li>All 5        → "very strong"</li>
 * </ul>
 *
 * <p>Rules:
 * <ul>
 *   <li>Empty string or null → "weak"</li>
 * </ul>
 *
 * @param password the password to evaluate
 * @return "weak", "medium", "strong", or "very strong"
 */
public final class PasswordStrength {

    private PasswordStrength() {}

    public static String checkPasswordStrength(String password) {
        if (password == null || password.isEmpty()) {
            return "weak";
        }

        int criteriaMet = 0;

        if (password.length() >= 8) {
            criteriaMet++;
        }

        if (password.matches(".*[A-Z].*")) {
            criteriaMet++;
        }

        if (password.matches(".*[a-z].*")) {
            criteriaMet++;
        }

        if (password.matches(".*[0-9].*")) {
            criteriaMet++;
        }

        if (password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{}|;:,.<>?].*")) {
            criteriaMet++;
        }

        switch (criteriaMet) {
            case 0:
            case 1:
                return "weak";
            case 2:
            case 3:
                return "medium";
            case 4:
                return "strong";
            case 5:
                return "very strong";
            default:
                return "weak";
        }
    }
}