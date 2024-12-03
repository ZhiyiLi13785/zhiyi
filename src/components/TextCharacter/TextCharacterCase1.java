package components.TextCharacter;

/**
 * Demonstrates filtering unwanted characters from text using TextCharacter.
 */
public final class TextCharacterCase1 {

    /**
     * Private constructor to prevent instantiation of the utility class.
     */
    private TextCharacterCase1() {
        throw new UnsupportedOperationException(
                "TextCharacterSample1 Is a utility class and cannot be instantiated.");
    }

    /**
     * Main method to filter unwanted characters from a given text.
     *
     * @param args
     *            the command line arguments (not used)
     */
    public static void main(String[] args) {
        // Create a TextCharacter instance
        TextCharacter textCharacter = new TextCharacter1L();

        // Add characters to the TextCharacter component
        String inputText = "Hello, World123!";
        for (char c : inputText.toCharArray()) {
            textCharacter.add(c);
        }

        // Remove all occurrences of specific unwanted characters
        char[] unwantedChars = { ',', '!' };
        for (char c : unwantedChars) {
            if (textCharacter.contains(c)) {
                textCharacter.reduceCharacter(c);
            }
        }

        // Print the filtered text
        StringBuilder filteredText = new StringBuilder();
        for (int i = 0; i < textCharacter.size(); i++) {
            filteredText.append(textCharacter.charAt(i));
        }

        System.out.println("Filtered text: " + filteredText.toString());
    }
}
