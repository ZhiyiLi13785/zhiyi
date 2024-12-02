package components.TextCharacter;

public interface TextCharacter extends TextCharacterKernel {

    // TODO: contracts only

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

    /**
     * Returns the character at the specified position in this text character
     * component.
     *
     * @param n1
     *            the position of the character to return (0-based index)
     * @return the character at the specified position {@code n1}
     * @requires 0 <= n1 < this.size()
     * @ensures charAt = character at index {@code n1} of this
     */
    char charAt(int n1);
}
