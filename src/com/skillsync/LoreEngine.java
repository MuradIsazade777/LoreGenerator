#  LoreEngine generates a random lore sentence by combining
   a beginning, middle, and ending fragment.
   Each part is selected randomly from predefined arrays.
   Used by LoreGenerator to produce creative console output.
   
package com.skillsync;

import java.util.Random;

public class LoreEngine {
    private static final String[] beginnings = {
        "In the year 2042,", "Long ago in the digital realm,", "When protocols ruled the world,"
    };

    private static final String[] middles = {
        "SkillSync unified all freelance minds", "a lone developer forged a modular engine",
        "the last server pulsed with encrypted wisdom"
    };

    private static final String[] endings = {
        "under one protocol.", "that changed the course of open-source history.",
        "and branded the future with elegance."
    };

    public String generateLore() {
        Random rand = new Random();
        String part1 = beginnings[rand.nextInt(beginnings.length)];
        String part2 = middles[rand.nextInt(middles.length)];
        String part3 = endings[rand.nextInt(endings.length)];
        return part1 + " " + part2 + " " + part3;
    }
}
