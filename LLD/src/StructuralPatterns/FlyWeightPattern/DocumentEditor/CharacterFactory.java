package StructuralPatterns.FlyWeightPattern.DocumentEditor;


import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private final Map<String, CharacterFlyweight> characters = new HashMap<>();

    public CharacterFlyweight getCharacter(String fontStyle, int fontSize, String color) {
        String key = fontStyle + fontSize + color;

        if (!characters.containsKey(key)) {
            System.out.println("Creating new character: " + fontStyle + " " + fontSize + " " + color);

            // TODO: Create and store a new ConcreteCharacter if it doesn't already exist in the map.
            CharacterFlyweight ch = new ConcreteCharacter(fontStyle,fontSize,color);
            characters.put(key,ch);

        } else {
            System.out.println("Reusing character: " + fontStyle + " " + fontSize + " " + color);
        }

        // TODO: Return the existing or newly created CharacterFlyweight instance.
        return characters.get(key);

    }
}