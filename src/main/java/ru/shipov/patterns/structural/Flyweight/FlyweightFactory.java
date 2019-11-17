package ru.shipov.patterns.structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<Integer, Character> characters = new HashMap<>();

    public Character getCharacter(int characterCode) {
        Character character = characters.get(characterCode);
        if (character == null) {
            switch (characterCode) {
                case 1:
                    character = new CharacterA();
                    break;
                case 2:
                    character = new CharacterB();
                    break;
                case 3:
                    character = new CharacterC();
                    break;
            }
            characters.put(characterCode, character);
        }
        return character;
    }
}
