package components.TextCharacter;

/**
 * Interface for a text character component that allows advanced text
 * manipulation and character management.
 *
 * Provides methods to check for characters or substrings, and to remove
 * specific characters from the text.
 */
public interface TextCharacter extends TextCharacterKernel {

    /**
     * Checks if this text character component contains the specified string.
     *
     * @param k
     *            the string to check for
     * @return true if the text character component contains the string
     *         {@code k}, false otherwise
     * @requires k != null && !k.isEmpty()
     * @ensures contains = (k is a substring of this)
     */
    boolean contains(String k);

    /**
     * Checks if this text character component contains the specified character.
     *
     * @param k
     *            the character to check for
     * @return true if the text character component contains the character
     *         {@code k}, false otherwise
     * @ensures contains = (k is in this)
     */
    boolean contains(char k);

    /**
     * Removes the first occurrence of the specified character from this text
     * character component.
     *
     * @param k
     *            the character to remove
     * @requires k is in this
     * @ensures this = #this with the first occurrence of {@code k} removed
     * @updates this
     */
    void reduceCharacter(char k);

}
