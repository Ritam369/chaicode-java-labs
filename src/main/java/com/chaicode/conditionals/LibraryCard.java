package com.chaicode.conditionals;

import com.chaicode.conditionals.model.BorrowResult;

/**
 * Maple Town Library
 *
 * <p>The librarian at Maple Town Public Library is tired of manually checking
 * whether members can borrow books. She asks you to automate it!
 *
 * <p>A member can borrow books ONLY if ALL of these are true:
 * <ol>
 *   <li>They are at least 6 years old</li>
 *   <li>They have a valid library card (hasValidCard is true)</li>
 *   <li>They have zero overdue books</li>
 * </ol>
 *
 * <p>Return a {@link BorrowResult} with two properties:
 * <ul>
 *   <li>allowed: true if they can borrow, false otherwise</li>
 *   <li>message: a descriptive message</li>
 * </ul>
 *
 * <p>Check conditions in this order and return the FIRST failure:
 * <ul>
 *   <li>Age &lt; 6:
 *     { allowed: false, message: "Too young - must be at least 6 years old" }</li>
 *   <li>No valid card:
 *     { allowed: false, message: "Invalid library card - please renew at the front desk" }</li>
 *   <li>Has overdue books:
 *     { allowed: false, message: "Please return your X overdue book(s) first" }
 *     (replace X with the actual number of overdue books)</li>
 *   <li>All conditions met:
 *     { allowed: true, message: "You may borrow up to 3 books" }</li>
 * </ul>
 *
 * @param memberAge the member's age
 * @param hasValidCard whether they have a valid library card
 * @param overdueBooks number of overdue books
 * @return the borrowing eligibility result
 */
public final class LibraryCard {

    private LibraryCard() {}

    public static BorrowResult canBorrowBook(int memberAge, boolean hasValidCard, int overdueBooks) {
        if (memberAge < 6) {
            return new BorrowResult(false, "Too young - must be at least 6 years old");
        }
        if (!hasValidCard) {
            return new BorrowResult(false, "Invalid library card - please renew at the front desk");
        }
        if (overdueBooks > 0) {
            return new BorrowResult(false, "Please return your " + overdueBooks + " overdue book(s) first");
        }
        return new BorrowResult(true, "You may borrow up to 3 books");
    }
}
