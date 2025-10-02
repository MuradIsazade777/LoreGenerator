package com.skillsync;

public class LoreGenerator {
    public static void main(String[] args) {
        LoreEngine engine = new LoreEngine();
        System.out.println("🔮 Generated Lore:");
        System.out.println(engine.generateLore());
    }
}
