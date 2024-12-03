package components.TextCharacter;

import java.util.HashMap;
import java.util.Map;

/**
 * A utility class to demonstrate the usage of the TextCharacter component with
 * character frequency counting.
 */
public final class TextCharacterCase2 {

    /**
     * Private constructor to prevent instantiation of this utility class.
     */
    private TextCharacterCase2() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * Main method demonstrating character frequency counting in a string using
     * the TextCharacter component.
     *
     * @param args
     *            the command line arguments (not used)
     */
    public static void main(String[] args) {
        // Input text
        String inputText = "programming is fun123231!,";

        // Create a TextCharacter instance
        TextCharacter textCharacter = new TextCharacter1L();

        // Add characters from the input text to the TextCharacter component
        for (char c : inputText.toCharArray()) {
            textCharacter.add(c);
        }

        // Use a map to store character frequencies
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (int i = 0; i < textCharacter.size(); i++) {
            char currentChar = textCharacter.charAt(i);
            if (charFrequency.containsKey(currentChar)) {
                charFrequency.put(currentChar,
                        charFrequency.get(currentChar) + 1);
            } else {
                charFrequency.put(currentChar, 1);
            }
        }

        // Print the character frequencies
        System.out.println("Character Frequencies:");
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
