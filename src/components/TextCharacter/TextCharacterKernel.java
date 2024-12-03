package components.TextCharacter;

import components.standard.Standard;

/**
 * Kernel interface for managing numerical operations.
 */
public interface TextCharacterKernel extends Standard<TextCharacter> {

    /**
     * Returns the number of characters (letters, operators, and spaces) in this
     * text character component.
     *
     * @return the number of characters in the text character component
     * @ensures size = [the total number of characters in this]
     */
    int size();

    /**
     * Reports whether this text character component is empty.
     *
     * @return true if the text character component is empty, false otherwise
     * @ensures isEmpty = (this.size() == 0)
     */
    boolean isEmpty();

    /**
     * Adds the specified character to this text character component.
     *
     * @param k
     *            the character to add
     * @replaces this
     * @ensures this = #this with {@code k} appended
     * @updates this
     */
    void add(char k);

    /**
     * Removes the last character from this text character component.
     *
     * @throws IllegalStateException
     *             if the text character component is empty
     * @requires this.size() > 0
     * @ensures this = #this with the last character removed
     * @updates this
     */
    void reduce();

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

    /**
     * Sets the internal representation of this text character component from
     * the given string.
     *
     * @param text
     *            the string to set as the internal representation
     * @requires text is not null and only contains valid characters for this
     *           component (e.g., letters, punctuation, etc.)
     * @ensures this.legalCharacter = text
     */
    void setFromString(String text);

}
