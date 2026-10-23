package com.chaicode.operators;

import com.chaicode.operators.model.TimeParts;

/**
 * StreamTime Video Duration Parser
 *
 * <p>A video platform stores clip length in total seconds. Convert to hours, minutes, and seconds
 * for the UI player.
 *
 * <p>Rules:
 * <ul>
 *   <li>hours = totalSeconds / 3600</li>
 *   <li>minutes = (totalSeconds % 3600) / 60</li>
 *   <li>seconds = totalSeconds % 60</li>
 *   <li>If totalSeconds is negative, return null</li>
 * </ul>
 *
 * @param totalSeconds total duration in seconds
 * @return TimeParts record, or null for invalid input
 */
public final class TimeBreakdown {

    private TimeBreakdown() {}

    public static TimeParts toTimeParts(int totalSeconds) {
        if (totalSeconds < 0) {
            return null;
        }

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        return new TimeParts(hours, minutes, seconds);
    }
}
