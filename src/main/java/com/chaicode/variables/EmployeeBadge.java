package com.chaicode.variables;

import com.chaicode.variables.model.EmployeeProfile;

/**
 * TechCorp Employee Badge Printer
 *
 * <p>HR needs a badge formatter for the new hire orientation. Given an employee profile,
 * build the badge text printed on their lanyard.
 *
 * <p>Format (exactly):
 * <pre>
 * [ID-00042] Priya Sharma | Engineering | MANAGER
 * </pre>
 *
 * <p>Rules:
 * <ul>
 *   <li>ID is zero-padded to 5 digits (e.g. employeeId 42 → "00042")</li>
 *   <li>If isManager is true, suffix is "MANAGER"; otherwise "STAFF"</li>
 *   <li>department is used as-is (already validated)</li>
 * </ul>
 *
 * @param profile the employee profile
 * @return formatted badge string
 */
public final class EmployeeBadge {

    private EmployeeBadge() {}

    public static String formatBadge(EmployeeProfile profile) {
        String id = String.format("ID-%05d", profile.employeeId());
        String role = profile.isManager() ? "MANAGER" : "STAFF";
        return String.format("[%s] %s | %s | %s", id, profile.name(), profile.department(), role);
    }
}
